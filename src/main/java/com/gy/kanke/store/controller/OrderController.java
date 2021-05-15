package com.gy.kanke.store.controller;

import java.math.BigDecimal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gy.kanke.store.Util.DateUtil;
import com.gy.kanke.store.Util.ResponseUtil;
import com.gy.kanke.store.common.BaseAPIRequestparam;
import com.gy.kanke.store.common.ResponseEntity;
import com.gy.kanke.store.domain.Order;
import com.gy.kanke.store.domain.SellerInfo;
import com.gy.kanke.store.dto.OrderDTO;
import com.gy.kanke.store.dto.OrderInfoSyncDTO;
import com.gy.kanke.store.dto.OrderProductDTO;
import com.gy.kanke.store.dto.OrderReceiveDTO;
import com.gy.kanke.store.service.IOrderExpressService;
import com.gy.kanke.store.service.IOrderPayService;
import com.gy.kanke.store.service.IOrderProductService;
import com.gy.kanke.store.service.IOrderReceiveService;
import com.gy.kanke.store.service.IOrderService;
import com.gy.kanke.store.service.SellerService;
import com.gy.portal.bizDomain.UserInfo;

@Controller
@RequestMapping("/order")
public class OrderController {

	private Logger logger = org.slf4j.LoggerFactory.getLogger(OrderController.class);
	
	@Autowired
	private IOrderService orderService;
	
	@Autowired
	private IOrderProductService orderProductService;

	@Autowired
	private SellerService sellerService;
	
	@Autowired
	private IOrderPayService orderPayService;
	
	@Autowired
	private IOrderReceiveService orderReceiveService;
	
	@Autowired
	private IOrderExpressService orderExpressService;
	
	/**
	 * 登录以后直接进订单中心,如果没有入驻进入驻页面
	 * 
	 * @param request
	 * @param model
	 * @param order
	 * @return
	 */
	@RequestMapping(value = "/orderInfo")
	public String getOrderInfo(HttpServletRequest request, Model model) {
		String toPage = "";
		try {
			UserInfo user = com.gy.portal.common.UserHelper.getLoginUserInfo(request);
			// 0:未入驻 , 1:待审核，2:审核通过，3:审核不通过
			SellerInfo sellerInfo = sellerService.getAccountState(user);
			if (sellerInfo == null) {
				return "enter/enterBaseInfo";
			}

			int state = sellerInfo.getStatus();
			if (state == 0) {
				toPage = "enter/enterBaseInfo";
			} else if (state == 1) {
				toPage = "enter/waitingCheck";
			} else if (state == 2) {
				toPage = "order/orderInfo";
			} else if (state == 3) {
				toPage = "enter/checkFaiure";
				model.addAttribute("notPassReason", sellerInfo.getNotPassReason());
			}
		} catch (Throwable e) {
			logger.error("To order page error.", e);
		}
		return toPage;
	}
	
	@RequestMapping(value = "/getOrderInfo")
	@ResponseBody
	public Order getOrderInfo(HttpServletRequest request, Model model, String no) {
		Order order = null;
		try {
			order = orderService.getOrderInfo(no);
		} catch (Throwable e) {
			logger.error("To order page error.", e);
		}
		return order;
	}

	@RequestMapping(value = "/getNMothDate/{month}")
	@ResponseBody
	public ResponseEntity getNMonthDate(HttpServletRequest request,@PathVariable("month") int month) {
		ResponseEntity response = new ResponseEntity();
		try{
			response.setData(DateUtil.getDateRangeInMonth(month));
			response.setStatus(0);
			response.setMessage("OK");
		}catch(Throwable e){
			e.printStackTrace();
			response.setStatus(1);
			response.setMessage(e.getMessage());
		}
		return response;
	}
	
	@RequestMapping(value = "/addOrderInfo")
	@ResponseBody
	public int addOrderInfo(HttpServletRequest request, Model model, Order order) {
		return orderService.addOrderInfo(order);
	}

	@RequestMapping(value = "/getOrderList",method = { RequestMethod.POST })
	@ResponseBody
	public ResponseEntity getOrderList(HttpServletRequest request, OrderDTO dto) {
		
		ResponseEntity response = new ResponseEntity();
		try{
			UserInfo user = com.gy.portal.common.UserHelper.getLoginUserInfo(request);
			dto.setAccount(user.getAccount());
			response = orderService.getOrderList(dto);
			response.setStatus(0);
			response.setMessage("OK");
		}catch(Throwable e){
			response.setStatus(1);
			response.setMessage(e.getMessage());
		}
		return response;
	}

	@RequestMapping(value = "/orderSendState")
	public String getOrderSendState(HttpServletRequest request, Model model) {

		String state = request.getParameter("state");
		String orderNo = request.getParameter("orderNo");
		/*
		 * 1.待付款：支付状态取（定单已生成未支付） 2.待发货：当支付状态处于已成功支付 3.待收货：处于未发货和已发货时 4.交易成功：
		 * 5.交易关闭：
		 */
		String toPage="";
		if ("1".equals(state)) {
			setOrderPruductInfo(request, model, orderNo);
			toPage = "order/waitingPay";
		} else if ("2".equals(state)) {
			setOrderPruductInfo(request, model, orderNo);
			model.addAttribute("orderPay", orderPayService.getOrderPayByOrderNo(orderNo));
			toPage = "order/waitingSend";
		} else if ("3".equals(state)) {
			setOrderPruductInfo(request, model, orderNo);
			model.addAttribute("orderPay", orderPayService.getOrderPayByOrderNo(orderNo));
			model.addAttribute("orderExpress", orderExpressService.getOrderExpressInfoByOrderNo(orderNo));
			toPage = "order/waitingReceive";
		} else if ("4".equals(state)) {
			setOrderPruductInfo(request, model, orderNo);
			model.addAttribute("orderPay", orderPayService.getOrderPayByOrderNo(orderNo));
			model.addAttribute("orderExpress", orderExpressService.getOrderExpressInfoByOrderNo(orderNo));
			toPage = "order/orderSuccess";
		} else if ("5".equals(state)) {
			setOrderPruductInfo(request, model, orderNo);
			toPage = "order/orderClose";
		} else {
			toPage = "order/orderInfo";
		}
		return toPage;
	}

	private void setOrderPruductInfo(HttpServletRequest request, Model model, String orderNo) {
		List<OrderProductDTO> orderProducts = orderProductService.getOrderProductInfo(orderNo);
		BigDecimal totalPrice = new BigDecimal(0); 
		BigDecimal totalPostPrice = new BigDecimal(0); 
		if(orderProducts!=null && !orderProducts.isEmpty()){
			for(OrderProductDTO p: orderProducts){
				totalPrice = totalPrice.add(p.getPrice());
				totalPostPrice = totalPostPrice.add(p.getPostPrice());
			}
		}
		
		UserInfo user = com.gy.portal.common.UserHelper.getLoginUserInfo(request);
		model.addAttribute("account", user.getAccount());
		model.addAttribute("productsTotalPrice", totalPrice);
		model.addAttribute("productsTotalPostPrice", totalPostPrice);
		model.addAttribute("orderProducts", orderProducts);
		OrderReceiveDTO orderReceiveDTO = orderReceiveService.getOrderReceiveByOrderNo(orderNo);
		model.addAttribute("orderReceiveDTO", orderReceiveDTO);
		OrderDTO order = orderService.getOrderInfoByOrderNo(orderNo);
		model.addAttribute("order", order);
	}
	
	/**
	 * 修改订单状态接口
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/updateOrderInfo", method = { RequestMethod.POST })
	@ResponseBody
	public BaseAPIRequestparam<Object> updateOrderInfo(HttpServletRequest request) {
		BaseAPIRequestparam<Object> responseBean = null;
		try {
			BaseAPIRequestparam<OrderDTO> param = new BaseAPIRequestparam<OrderDTO>(request, OrderDTO.class);
			OrderDTO dto = param.getData();
			orderService.updateOrderInfo(dto);
			responseBean = ResponseUtil.getSuccessResponseBean(null);
		} catch (Throwable e) {
			responseBean = ResponseUtil.getFailResponseBean(e.getMessage());
		}
		return responseBean;
	}
	
	/**
	 * 订单信息同步
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/syncOrderInfo", method = { RequestMethod.POST })
	@ResponseBody
	public BaseAPIRequestparam<Object> syncOrderInfo(HttpServletRequest request) {
		BaseAPIRequestparam<Object> responseBean = null;
		try {
			BaseAPIRequestparam<OrderInfoSyncDTO> param = new BaseAPIRequestparam<OrderInfoSyncDTO>(request, OrderInfoSyncDTO.class);
			OrderInfoSyncDTO dto = param.getData();
			orderService.syncOrderInfo(dto);
			responseBean = ResponseUtil.getSuccessResponseBean(null);
		} catch (Throwable e) {
			logger.error("syncOrderInfo error,msg=" + e,e);
			e.printStackTrace();
			responseBean = ResponseUtil.getFailResponseBean(e.getMessage());
		}
		return responseBean;
	}
	
}