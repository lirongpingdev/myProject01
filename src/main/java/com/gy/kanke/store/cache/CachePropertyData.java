package com.gy.kanke.store.cache;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.gy.kanke.store.common.SpringContextHolder;
import com.gy.kanke.store.domain.StoreProperty;
import com.gy.kanke.store.domain.StorePropertyExample;
import com.gy.kanke.store.service.impl.DataMapperServiceImpl;

public class CachePropertyData {
private static Map<String, StoreProperty> PropertyListByKey = null;
	
	public static StoreProperty getPropertyListByKey(String key) {
		if(PropertyListByKey == null) {
			LoadCacheData();
		}
		StoreProperty result = PropertyListByKey.get(key);
		if(result == null) {
			DataMapperServiceImpl userDataOP = SpringContextHolder.getBean("dataMapperServiceImpl");
			StoreProperty reItem = userDataOP.getStorePropertyMapper().selectByPrimaryKey(key);
			if(reItem != null) {
				result = reItem;
				PropertyListByKey.put(key, result);
			}
		}
		return result;
	}
	
	public static void ReLoadCache() {
		LoadCacheData();
	}
	
	public static String getValueByKey(String key) {
		StoreProperty item = getPropertyListByKey(key);
		if(item != null) {
			return item.getProValue();
		} else {
			return null;
		}
	}
	
	private static void LoadCacheData() {
		PropertyListByKey = new HashMap<String, StoreProperty>();
		DataMapperServiceImpl userDataOP = SpringContextHolder.getBean("dataMapperServiceImpl");
		StorePropertyExample example = new StorePropertyExample();
		StorePropertyExample.Criteria cri = example.createCriteria();
		cri.andStatusEqualTo(false);
		List<StoreProperty> list = userDataOP.getStorePropertyMapper().selectByExample(example);
		for(StoreProperty item : list) {
			PropertyListByKey.put(item.getProKey(), item);
		}
	}
	
	public void LoadCache() {
		LoadCacheData();
	}
}