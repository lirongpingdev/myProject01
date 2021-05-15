package com.gy.kanke.store.IDao;

import com.gy.kanke.store.domain.OrderReceive;
import com.gy.kanke.store.domain.OrderReceiveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderReceiveMapper {
    int countByExample(OrderReceiveExample example);

    int deleteByExample(OrderReceiveExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrderReceive record);

    int insertSelective(OrderReceive record);

    List<OrderReceive> selectByExample(OrderReceiveExample example);

    OrderReceive selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderReceive record, @Param("example") OrderReceiveExample example);

    int updateByExample(@Param("record") OrderReceive record, @Param("example") OrderReceiveExample example);

    int updateByPrimaryKeySelective(OrderReceive record);

    int updateByPrimaryKey(OrderReceive record);
}