package com.gy.kanke.store.IDao;

import java.util.List;
import java.util.Map;

import com.gy.kanke.store.domain.CommonEntity;

public interface CommonMapper {
	List<Map<String, Object>> SelectSql(CommonEntity entity);
	
	int ExecuteSql(CommonEntity entity);
}