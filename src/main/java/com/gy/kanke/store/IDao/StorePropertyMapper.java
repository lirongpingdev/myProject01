package com.gy.kanke.store.IDao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gy.kanke.store.domain.StoreProperty;
import com.gy.kanke.store.domain.StorePropertyExample;

public interface StorePropertyMapper {
    int countByExample(StorePropertyExample example);

    int deleteByExample(StorePropertyExample example);

    int deleteByPrimaryKey(String proKey);

    int insert(StoreProperty record);

    int insertSelective(StoreProperty record);

    List<StoreProperty> selectByExample(StorePropertyExample example);

    StoreProperty selectByPrimaryKey(String proKey);

    int updateByExampleSelective(@Param("record") StoreProperty record, @Param("example") StorePropertyExample example);

    int updateByExample(@Param("record") StoreProperty record, @Param("example") StorePropertyExample example);

    int updateByPrimaryKeySelective(StoreProperty record);

    int updateByPrimaryKey(StoreProperty record);
}