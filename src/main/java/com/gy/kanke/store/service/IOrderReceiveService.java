package com.gy.kanke.store.service;

import com.gy.kanke.store.dto.OrderReceiveDTO;

public interface IOrderReceiveService {
	OrderReceiveDTO getOrderReceiveByOrderNo(String orderNO);
}
