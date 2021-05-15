package com.gy.kanke.store.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gy.kanke.store.IDao.OrderProductMapper;
import com.gy.kanke.store.domain.OrderProduct;
import com.gy.kanke.store.domain.OrderProductExample;
import com.gy.kanke.store.dto.OrderProductDTO;
import com.gy.kanke.store.service.IOrderProductService;

@Service("orderProductSerivceImpl")
public class OrderProductSerivceImpl implements IOrderProductService {

	@Autowired
	private OrderProductMapper orderProductMapper;	
	
	@Override
	public List<OrderProductDTO> getOrderProductInfo(String orderNO) {

		OrderProductExample example = new OrderProductExample();
		com.gy.kanke.store.domain.OrderProductExample.Criteria criteria = example.createCriteria();
		criteria.andOrderNoEqualTo(orderNO);
		
		List<OrderProduct> products= orderProductMapper.selectByExample(example);
		
		List<OrderProductDTO> dtoList = new ArrayList<OrderProductDTO>();
		OrderProductDTO dto = null;
		for(OrderProduct product :products){
			dto = new OrderProductDTO();
			BeanUtils.copyProperties(product, dto);
			dtoList.add(dto);
		}
		return dtoList;
	}

}