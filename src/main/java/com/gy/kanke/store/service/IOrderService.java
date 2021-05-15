package com.gy.kanke.store.service;

import com.gy.kanke.store.common.ResponseEntity;
import com.gy.kanke.store.domain.Order;
import com.gy.kanke.store.dto.OrderDTO;
import com.gy.kanke.store.dto.OrderInfoSyncDTO;

public interface IOrderService {
	
	Order getOrderInfo(String orderNO);
	
	OrderDTO getOrderInfoByOrderNo(String orderNO);

	ResponseEntity getOrderList(OrderDTO dto);
	
	int updateOrderInfo(OrderDTO dto);
	
	int syncOrderInfo(OrderInfoSyncDTO dto);
	
	int addOrderInfo(Order order);
}
