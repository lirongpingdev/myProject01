package com.gy.kanke.store.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gy.kanke.store.IDao.OrderExpressMapper;
import com.gy.kanke.store.IDao.OrderManageMapper;
import com.gy.kanke.store.cache.CachePropertyData;
import com.gy.kanke.store.common.BaseAPIRequestparam;
import com.gy.kanke.store.common.HttpUtil;
import com.gy.kanke.store.common.ResponseStateInfo;
import com.gy.kanke.store.domain.Order;
import com.gy.kanke.store.domain.OrderExpress;
import com.gy.kanke.store.domain.OrderExpressExample;
import com.gy.kanke.store.dto.OrderExpressDTO;
import com.gy.kanke.store.service.IOrderExpressService;

@Service("orderExpressSerivceImpl")
public class OrderExpressSerivceImpl implements IOrderExpressService {

	private Logger logger = org.slf4j.LoggerFactory.getLogger(OrderExpressSerivceImpl.class);

	@Autowired
	private OrderExpressMapper orderExpressMapper;

	@Autowired
	private OrderManageMapper orderManageMapper;

	@Override
	@Transactional
	public int addOrderExpressInfo(OrderExpress orderExpress) {
		//orderExpressMapper.insert(orderExpress);

		Order order = new Order();
		order.setOrderNo(orderExpress.getOrderNo());
		order.setSendGoodsState(2);
		order.setExpressName(orderExpress.getExpressName());
		order.setExpressNo(orderExpress.getExpressNo());
		//orderManageMapper.updateOrderInfo(order);

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("orderNo", orderExpress.getOrderNo());
		map.put("expressName", orderExpress.getExpressName());
		map.put("expressNo", orderExpress.getExpressNo());
		map.put("sendGoodsState", 2);

		try {
			BaseAPIRequestparam<Map<String, Object>> requestparam = new BaseAPIRequestparam<Map<String, Object>>();
			requestparam.setData(map);

			String httpUrl = CachePropertyData.getValueByKey("kanke_manager_url") + "MallProApi/shipments";
			String str = HttpUtil.sendHttpPostJson(httpUrl, requestparam.toJSONString());
			if (str != null) {
				BaseAPIRequestparam<String> responseMap = new BaseAPIRequestparam<String>(str, String.class);
				ResponseStateInfo stateInfo = responseMap.getState();
				if (stateInfo.getCode() != stateInfo.CODE_SUCCESS) {
					logger.error("Send express msg error.code=" + stateInfo.getCode()+",orderNo="+orderExpress.getOrderNo());
				}
			}
		} catch (Exception e) {
			logger.error("Send express msg error.msg=" + e.getMessage()+",orderNo="+orderExpress.getOrderNo(),e);
		}
		return 1;
	}

	@Override
	public OrderExpressDTO getOrderExpressInfoByOrderNo(String orderNo) {
		OrderExpressExample example = new OrderExpressExample();
		com.gy.kanke.store.domain.OrderExpressExample.Criteria criteria = example.createCriteria();
		criteria.andOrderNoEqualTo(orderNo);
		List<OrderExpress> orderExpress = orderExpressMapper.selectByExample(example);

		OrderExpress express = null;
		OrderExpressDTO dto = null;
		if (orderExpress != null && !orderExpress.isEmpty()) {
			express = orderExpress.get(0);
			dto = new OrderExpressDTO();
			BeanUtils.copyProperties(express, dto);
		}

		return dto;
	}

}