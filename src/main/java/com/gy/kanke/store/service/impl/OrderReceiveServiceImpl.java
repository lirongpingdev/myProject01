package com.gy.kanke.store.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gy.kanke.store.IDao.OrderReceiveMapper;
import com.gy.kanke.store.Util.DateUtil;
import com.gy.kanke.store.domain.Order;
import com.gy.kanke.store.domain.OrderPay;
import com.gy.kanke.store.domain.OrderPayExample;
import com.gy.kanke.store.domain.OrderReceive;
import com.gy.kanke.store.domain.OrderReceiveExample;
import com.gy.kanke.store.dto.OrderDTO;
import com.gy.kanke.store.dto.OrderReceiveDTO;
import com.gy.kanke.store.service.IOrderReceiveService;

@Service("orderReceiveServiceImpl")
public class OrderReceiveServiceImpl implements IOrderReceiveService {

	
	@Autowired
	private OrderReceiveMapper orderReceiveMapper;

	@Override
	public OrderReceiveDTO getOrderReceiveByOrderNo(String orderNO) {
		OrderReceiveExample example = new OrderReceiveExample();
		com.gy.kanke.store.domain.OrderReceiveExample.Criteria criteria = example.createCriteria();
		criteria.andOrderNoEqualTo(orderNO);
		List<OrderReceive> receives = orderReceiveMapper.selectByExample(example);
		OrderReceiveDTO dto = new OrderReceiveDTO();
		OrderReceive orderReceive = null;
		if (receives != null && !receives.isEmpty()) {
			orderReceive = receives.get(0);
			BeanUtils.copyProperties(orderReceive, dto);
		}
		return dto;
	}

}