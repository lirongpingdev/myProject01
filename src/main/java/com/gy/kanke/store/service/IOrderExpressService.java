package com.gy.kanke.store.service;

import com.gy.kanke.store.domain.OrderExpress;
import com.gy.kanke.store.dto.OrderExpressDTO;

public interface IOrderExpressService {

	int addOrderExpressInfo(OrderExpress orderExpress);

	OrderExpressDTO getOrderExpressInfoByOrderNo(String orderNo);

}
