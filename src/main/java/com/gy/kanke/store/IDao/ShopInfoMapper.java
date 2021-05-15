package com.gy.kanke.store.IDao;

import com.gy.kanke.store.domain.ShopInfo;
import com.gy.kanke.store.domain.ShopInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopInfoMapper {
    int countByExample(ShopInfoExample example);

    int deleteByExample(ShopInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(ShopInfo record);

    int insertSelective(ShopInfo record);

    List<ShopInfo> selectByExample(ShopInfoExample example);

    ShopInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ShopInfo record, @Param("example") ShopInfoExample example);

    int updateByExample(@Param("record") ShopInfo record, @Param("example") ShopInfoExample example);

    int updateByPrimaryKeySelective(ShopInfo record);

    int updateByPrimaryKey(ShopInfo record);
}