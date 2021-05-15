package com.gy.kanke.store.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gy.kanke.store.IDao.OrderExpressMapper;
import com.gy.kanke.store.IDao.OrderManageMapper;
import com.gy.kanke.store.IDao.OrderMapper;
import com.gy.kanke.store.IDao.OrderPayMapper;
import com.gy.kanke.store.IDao.OrderProductMapper;
import com.gy.kanke.store.IDao.OrderReceiveMapper;
import com.gy.kanke.store.Util.DateUtil;
import com.gy.kanke.store.common.ResponseEntity;
import com.gy.kanke.store.domain.Order;
import com.gy.kanke.store.domain.OrderExample;
import com.gy.kanke.store.domain.OrderExpress;
import com.gy.kanke.store.domain.OrderExpressExample;
import com.gy.kanke.store.domain.OrderPay;
import com.gy.kanke.store.domain.OrderPayExample;
import com.gy.kanke.store.domain.OrderProduct;
import com.gy.kanke.store.domain.OrderProductExample;
import com.gy.kanke.store.domain.OrderReceive;
import com.gy.kanke.store.domain.OrderReceiveExample;
import com.gy.kanke.store.dto.OrderDTO;
import com.gy.kanke.store.dto.OrderExpressDTO;
import com.gy.kanke.store.dto.OrderInfoSyncDTO;
import com.gy.kanke.store.dto.OrderPayDTO;
import com.gy.kanke.store.dto.OrderProductDTO;
import com.gy.kanke.store.dto.OrderReceiveDTO;
import com.gy.kanke.store.param.PagerParam;
import com.gy.kanke.store.service.IOrderService;

@Service("orderSerivceImpl")
public class OrderSerivceImpl implements IOrderService {
	
	@Autowired
	private OrderMapper orderMapper;

	@Autowired
	private OrderPayMapper orderPayMapper;
	
	@Autowired
	private OrderManageMapper orderManageMapper;
	
	@Autowired
	private OrderReceiveMapper orderReceiveMapper;
	
	@Autowired
	private OrderExpressMapper orderExpressMapper;
	
	@Autowired
	private OrderProductMapper orderProductMapper;
	
	@Override
	public Order getOrderInfo(String orderNO) {
		
		return orderMapper.selectByPrimaryKey(orderNO);
	}

	@Override
	public int addOrderInfo(Order order) {
		
		Order o = new Order();
		o.setId("o"+System.currentTimeMillis());
		o.setOrderNo("123456789");
		o.setEvaluateType(1);
		 int r=orderMapper.insert(o);
		 return r;
	}

	@Override
	public ResponseEntity getOrderList(OrderDTO dto) {
		
		ResponseEntity response = new ResponseEntity();
		
		Map<String,Object> map = new HashMap<String,Object>();
		OrderExample example = new OrderExample();
		com.gy.kanke.store.domain.OrderExample.Criteria criteria = example.createCriteria();
		if (dto.getAccount() != null && !"".equals(dto.getAccount().trim())) {
			criteria.andAccountEqualTo(dto.getAccount());
		}

		int count = orderMapper.countByExample(example);
		response.setTotalCount(count);
		
		PagerParam page= new PagerParam();
		page.setPageSize(dto.getPageSize());
		page.setTotalCount(count);
		page.setPage(dto.getPage());
		
		map.put("account", dto.getAccount());
		response.setTotalPage(page.getTotalPage());
		
		if (dto.getBeginTime() != null && !"".equals(dto.getBeginTime().trim())) {
			map.put("beginTime", dto.getBeginTime());
		}
		
		if (dto.getEndTime() != null && !"".equals(dto.getEndTime().trim())) {
			map.put("endTime", dto.getEndTime());
		}
		
		map.put("orderNo", dto.getOrderNo());
		map.put("customerName", dto.getCustomerName());
		if(dto.getOrderState()!=null && dto.getOrderState()!=6){
			
			if (dto.getOrderState() == 1) {// 待付款
				map.put("payState", 1);
			} else if (dto.getOrderState() == 2) {// 待发货
				map.put("payState", 2);
				map.put("sendGoodsState", 1);
			} else if (dto.getOrderState() == 3) {// 待收货
				map.put("payState", 2);
				map.put("sendGoodsState", 2);
			} else if (dto.getOrderState() == 4) {// 交易成功
				map.put("payState", 2);
				map.put("sendGoodsState", 3);
			} else if (dto.getOrderState() == 5) {// 交易关闭
				map.put("payState", 2);
				map.put("orderState", 5);
			}
		}
		map.put("limitStart", page.getStart());
		map.put("limitEnd", page.getEnd());
		List<OrderDTO>  orderList = orderManageMapper.getOrderList(map);
		response.setData(orderList);
		return response;
	}

	@Override
	public OrderDTO getOrderInfoByOrderNo(String orderNO) {
		OrderExample example = new OrderExample();
		com.gy.kanke.store.domain.OrderExample.Criteria criteria = example.createCriteria();
		criteria.andOrderNoEqualTo(orderNO);
		List<Order> orders = orderMapper.selectByExample(example);
		OrderDTO dto = new OrderDTO();
		Order order = null;
		if (orders != null && !orders.isEmpty()) {
			order = orders.get(0);
			BeanUtils.copyProperties(order, dto);
			//设置状态
			if(order.getPayState()==1){
				dto.setOrderStateStr("待付款");
			}else if(order.getPayState()==2 && order.getSendGoodsState()==1){
				dto.setOrderStateStr("立即发货");
			}else if(order.getPayState()==2 && order.getSendGoodsState()==2){
				dto.setOrderStateStr("待收货");
			}else if(order.getPayState()==2 && order.getSendGoodsState()==3){
				dto.setOrderStateStr("交易成功");
			}else{
				dto.setOrderStateStr("交易关闭");
			}
		}
		dto.setCreateTimeStr(DateUtil.getDateStrYYYYMMDD(order.getCreateTime()));
		OrderPayExample pay = new OrderPayExample();
		com.gy.kanke.store.domain.OrderPayExample.Criteria payCriteria = pay.createCriteria();
		payCriteria.andOrderNoEqualTo(orderNO);
		List<OrderPay> payList = orderPayMapper.selectByExample(pay);
		OrderPay orderPay = null;
		if(payList!=null && !payList.isEmpty()){
			orderPay = payList.get(0);
			dto.setPrice(orderPay.getPrice());
		}
		
		return dto;
	}

	@Override
	public int updateOrderInfo(OrderDTO dto) {

		OrderExample example = new OrderExample();
		com.gy.kanke.store.domain.OrderExample.Criteria criteria = example.createCriteria();
		criteria.andOrderNoEqualTo(dto.getOrderNo());
		List<Order> orders = orderMapper.selectByExample(example);
		Order order = null;

		if (orders != null && !orders.isEmpty()) {
			order = orders.get(0);

			if (dto.getOrderState() != null && dto.getOrderState() != 0) {
				order.setOrderState(dto.getOrderState());
			}

			if (dto.getSendGoodsState() != null && dto.getSendGoodsState() != 0) {
				order.setSendGoodsState(dto.getSendGoodsState());
			}

			if (dto.getPayState() != null && dto.getPayState() != 0) {
				order.setPayState(dto.getPayState());
			}

			if (dto.getEvaluateState() != null && dto.getEvaluateState() != 0) {
				order.setEvaluateState(dto.getEvaluateState());
			}
		}
		return orderMapper.updateByPrimaryKeySelective(order);
	}

	@Override
	@Transactional
	public int syncOrderInfo(OrderInfoSyncDTO orderInfoSyncDTO) {

		OrderDTO orderDTO = orderInfoSyncDTO.getOrder();

		OrderPayDTO orderPayDTO = orderInfoSyncDTO.getOrderPay();

		List<OrderProductDTO> orderProducts = orderInfoSyncDTO.getOrderProducts();

		OrderReceiveDTO receiveDTO = orderInfoSyncDTO.getReceive();

		OrderExpressDTO expressDTO = orderInfoSyncDTO.getExpress();

		if (orderDTO != null) {
			Order order = new Order();
			BeanUtils.copyProperties(orderDTO, order);
			order.setCreateTime(new Date());
			//order.setMemberCreateTime(DateUtil.str2Date(orderDTO.getMemberCreateTimeStr()));
			//order.setLastUpdateTime(DateUtil.str2Date(orderDTO.getLastUpdateTimeStr()));
		    
			Order oldOrder = orderMapper.selectByPrimaryKey(order.getId());
			if (oldOrder != null) {
				OrderExample example = new OrderExample();
				com.gy.kanke.store.domain.OrderExample.Criteria criteria = example.createCriteria();
				criteria.andOrderNoEqualTo(order.getOrderNo());
				criteria.andIdEqualTo(order.getId());
				orderMapper.updateByExampleSelective(order, example);
			} else {
				orderMapper.insert(order);
			}

		}

		if (orderPayDTO != null) {
			OrderPay orderPay = new OrderPay();
			BeanUtils.copyProperties(orderPayDTO, orderPay);
			OrderPay oldOrderPay = orderPayMapper.selectByPrimaryKey(orderPay.getId());
			if(oldOrderPay!=null){
				OrderPayExample example = new OrderPayExample();
				com.gy.kanke.store.domain.OrderPayExample.Criteria criteria = example.createCriteria();
				criteria.andOrderNoEqualTo(orderPay.getOrderNo());
				criteria.andIdEqualTo(orderPay.getId());
				orderPayMapper.updateByExampleSelective(orderPay, example);
			}else{
				orderPayMapper.insert(orderPay);
			}
		}

		if (receiveDTO != null) {
			OrderReceive receive= new OrderReceive();
			BeanUtils.copyProperties(receiveDTO, receive);
			
			OrderReceive oldOrderReceive = orderReceiveMapper.selectByPrimaryKey(receive.getId());
			if(oldOrderReceive!=null){
				OrderReceiveExample example = new OrderReceiveExample();
				com.gy.kanke.store.domain.OrderReceiveExample.Criteria criteria = example.createCriteria();
				
				criteria.andOrderNoEqualTo(receive.getOrderNo());
				criteria.andIdEqualTo(receive.getId());
				orderReceiveMapper.updateByExampleSelective(receive, example);
				
			}else{
				orderReceiveMapper.insert(receive);
			}
		}

		if (expressDTO != null) {
			OrderExpress express = new OrderExpress();
			BeanUtils.copyProperties(expressDTO, express);
			
			OrderExpress oldOrderExpress = orderExpressMapper.selectByPrimaryKey(express.getId());
			
			if(oldOrderExpress!=null){
				OrderExpressExample example = new OrderExpressExample();
				com.gy.kanke.store.domain.OrderExpressExample.Criteria criteria = example.createCriteria();
				criteria.andOrderNoEqualTo(express.getOrderNo());
				criteria.andIdEqualTo(express.getId());
				orderExpressMapper.updateByExampleSelective(express, example);
			}else{
				orderExpressMapper.insert(express);
			}
			
		}

		if (orderProducts != null && !orderProducts.isEmpty()) {
			OrderProduct prod= null;
			for (OrderProductDTO product : orderProducts) {
				prod= new OrderProduct();
				BeanUtils.copyProperties(product, prod);
				
				OrderProduct oldOrderProduct = orderProductMapper.selectByPrimaryKey(prod.getId());
				
				if(oldOrderProduct!=null){
					OrderProductExample example = new OrderProductExample();
					com.gy.kanke.store.domain.OrderProductExample.Criteria criteria = example.createCriteria();
					criteria.andOrderNoEqualTo(prod.getOrderNo());
					criteria.andIdEqualTo(prod.getId());
					orderProductMapper.updateByExampleSelective(prod, example);
				}else{
					orderProductMapper.insert(prod);
				}
				
			}
		}
		
		return 1;
	}

}