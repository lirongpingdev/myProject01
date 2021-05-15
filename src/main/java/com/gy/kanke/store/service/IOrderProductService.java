package com.gy.kanke.store.service;

import java.util.List;

import com.gy.kanke.store.dto.OrderProductDTO;

public interface IOrderProductService {
	
	List<OrderProductDTO> getOrderProductInfo(String orderNO);

}
