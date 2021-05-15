package com.gy.kanke.store.service;

import com.gy.kanke.store.dto.OrderPayDTO;

public interface IOrderPayService {
	
	OrderPayDTO getOrderPayByOrderNo(String orderNo);
}
