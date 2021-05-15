package com.gy.kanke.store.IDao;

import com.gy.kanke.store.domain.OrderExpress;
import com.gy.kanke.store.domain.OrderExpressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderExpressMapper {
    int countByExample(OrderExpressExample example);

    int deleteByExample(OrderExpressExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrderExpress record);

    int insertSelective(OrderExpress record);

    List<OrderExpress> selectByExample(OrderExpressExample example);

    OrderExpress selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderExpress record, @Param("example") OrderExpressExample example);

    int updateByExample(@Param("record") OrderExpress record, @Param("example") OrderExpressExample example);

    int updateByPrimaryKeySelective(OrderExpress record);

    int updateByPrimaryKey(OrderExpress record);
}