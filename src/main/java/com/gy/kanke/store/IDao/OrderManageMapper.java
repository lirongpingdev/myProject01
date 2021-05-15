package com.gy.kanke.store.IDao;

import java.util.List;
import java.util.Map;

import com.gy.kanke.store.domain.Order;
import com.gy.kanke.store.dto.OrderDTO;
import com.gy.kanke.store.dto.TranMoneyDetailsDTO;

public interface OrderManageMapper {

    List<OrderDTO> getOrderList(Map<String,Object> map);
    
    List<TranMoneyDetailsDTO> getTranMoneyDetailsByOrder(Map<String,Object> map);
    
    int updateOrderInfo(Order order);
    
    void updateConfirmSendGoodsState(Map<String,Object> map);
    
}