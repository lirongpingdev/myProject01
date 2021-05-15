package com.gy.kanke.store.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gy.kanke.store.IDao.StorePropertyMapper;

@Service("dataMapperServiceImpl")
public class DataMapperServiceImpl {	
	@Autowired
	private StorePropertyMapper storePropertyMapper;
	
	public StorePropertyMapper getStorePropertyMapper() {
		return storePropertyMapper;
	}
}