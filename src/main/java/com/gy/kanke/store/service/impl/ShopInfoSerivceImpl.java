package com.gy.kanke.store.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gy.kanke.store.IDao.ShopInfoMapper;
import com.gy.kanke.store.domain.ShopInfo;
import com.gy.kanke.store.domain.ShopInfoExample;
import com.gy.kanke.store.service.ShopInfoService;

@Service("shopInfoSerivceImpl")
public class ShopInfoSerivceImpl implements ShopInfoService {

	
	@Autowired
	private ShopInfoMapper shopInfoMapper;
	
	@Override
	public int addShopInfo(ShopInfo shopInfo) {
		
		return shopInfoMapper.insertSelective(shopInfo);
	}

	@Override
	public int updateShopInfo(ShopInfo shopInfo) {
		
		return shopInfoMapper.updateByPrimaryKeySelective(shopInfo);
	}

	@Override
	public ShopInfo getShopInfo(ShopInfo shopInfo) {
		
		ShopInfo shop = null;
		ShopInfoExample example = new ShopInfoExample();
		com.gy.kanke.store.domain.ShopInfoExample.Criteria criteria = example.createCriteria();
		if (shopInfo.getAccount() != null && !"".equalsIgnoreCase(shopInfo.getAccount().trim())) {
			criteria.andAccountEqualTo(shopInfo.getAccount().trim());
		}
		if (shopInfo.getId() != null && !"".equals(shopInfo.getId().trim())) {
			criteria.andIdEqualTo(shopInfo.getId().trim());
		}

		List<ShopInfo> sellers = shopInfoMapper.selectByExample(example);
		
		if (sellers != null && !sellers.isEmpty()) {
			shop = sellers.get(0);
		}
		
		return shop;
	}

	

}