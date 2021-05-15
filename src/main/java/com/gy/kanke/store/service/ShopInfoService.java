package com.gy.kanke.store.service;

import com.gy.kanke.store.domain.ShopInfo;

public interface ShopInfoService {
	
	int  addShopInfo(ShopInfo shopInfo);
	
	int  updateShopInfo(ShopInfo shopInfo);			
	
	ShopInfo  getShopInfo(ShopInfo shopInfo);	
	
}
