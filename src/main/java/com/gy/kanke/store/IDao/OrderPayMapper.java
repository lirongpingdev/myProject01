package com.gy.kanke.store.IDao;

import com.gy.kanke.store.domain.OrderPay;
import com.gy.kanke.store.domain.OrderPayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderPayMapper {
    int countByExample(OrderPayExample example);

    int deleteByExample(OrderPayExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrderPay record);

    int insertSelective(OrderPay record);

    List<OrderPay> selectByExample(OrderPayExample example);

    OrderPay selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderPay record, @Param("example") OrderPayExample example);

    int updateByExample(@Param("record") OrderPay record, @Param("example") OrderPayExample example);

    int updateByPrimaryKeySelective(OrderPay record);

    int updateByPrimaryKey(OrderPay record);
}