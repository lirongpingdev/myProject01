package com.gy.kanke.store.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gy.kanke.store.IDao.OrderPayMapper;
import com.gy.kanke.store.domain.OrderPay;
import com.gy.kanke.store.domain.OrderPayExample;
import com.gy.kanke.store.dto.OrderPayDTO;
import com.gy.kanke.store.service.IOrderPayService;

@Service("orderPaySerivceImpl")
public class OrderPaySerivceImpl implements IOrderPayService {
	
	@Autowired
	private OrderPayMapper orderPayMapper;
	
	@Override
	public OrderPayDTO getOrderPayByOrderNo(String orderNo) {
		OrderPayDTO dto = new OrderPayDTO();
		OrderPayExample example = new OrderPayExample();
		com.gy.kanke.store.domain.OrderPayExample.Criteria criteria = example.createCriteria();
		criteria.andOrderNoEqualTo(orderNo);
		List<OrderPay> pays = orderPayMapper.selectByExample(example);
		OrderPay pay=null;
		if (pays != null && !pays.isEmpty()) {
			dto = new OrderPayDTO();
			pay = pays.get(0);
			BeanUtils.copyProperties(pay, dto);
		}
		return dto;
	}

}