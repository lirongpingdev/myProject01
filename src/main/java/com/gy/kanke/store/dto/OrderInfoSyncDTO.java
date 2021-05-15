package com.gy.kanke.store.dto;

import java.util.List;

public class OrderInfoSyncDTO {
	
	private OrderDTO order;
	
	private OrderPayDTO orderPay;
	
	private OrderExpressDTO express;
	
	private OrderReceiveDTO receive;
	
	private List<OrderProductDTO> orderProducts;

	public OrderDTO getOrder() {
		return order;
	}

	public void setOrder(OrderDTO order) {
		this.order = order;
	}

	public OrderPayDTO getOrderPay() {
		return orderPay;
	}

	public void setOrderPay(OrderPayDTO orderPay) {
		this.orderPay = orderPay;
	}

	public OrderExpressDTO getExpress() {
		return express;
	}

	public void setExpress(OrderExpressDTO express) {
		this.express = express;
	}

	public OrderReceiveDTO getReceive() {
		return receive;
	}

	public void setReceive(OrderReceiveDTO receive) {
		this.receive = receive;
	}

	public List<OrderProductDTO> getOrderProducts() {
		return orderProducts;
	}

	public void setOrderProducts(List<OrderProductDTO> orderProducts) {
		this.orderProducts = orderProducts;
	}

}