package com.gy.kanke.store.IDao;

import com.gy.kanke.store.domain.OrderProduct;
import com.gy.kanke.store.domain.OrderProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderProductMapper {
    int countByExample(OrderProductExample example);

    int deleteByExample(OrderProductExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrderProduct record);

    int insertSelective(OrderProduct record);

    List<OrderProduct> selectByExample(OrderProductExample example);

    OrderProduct selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderProduct record, @Param("example") OrderProductExample example);

    int updateByExample(@Param("record") OrderProduct record, @Param("example") OrderProductExample example);

    int updateByPrimaryKeySelective(OrderProduct record);

    int updateByPrimaryKey(OrderProduct record);
}