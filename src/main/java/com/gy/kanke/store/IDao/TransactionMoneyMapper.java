package com.gy.kanke.store.IDao;

import com.gy.kanke.store.domain.TransactionMoney;
import com.gy.kanke.store.domain.TransactionMoneyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TransactionMoneyMapper {
    int countByExample(TransactionMoneyExample example);

    int deleteByExample(TransactionMoneyExample example);

    int deleteByPrimaryKey(String id);

    int insert(TransactionMoney record);

    int insertSelective(TransactionMoney record);

    List<TransactionMoney> selectByExample(TransactionMoneyExample example);

    TransactionMoney selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TransactionMoney record, @Param("example") TransactionMoneyExample example);

    int updateByExample(@Param("record") TransactionMoney record, @Param("example") TransactionMoneyExample example);

    int updateByPrimaryKeySelective(TransactionMoney record);

    int updateByPrimaryKey(TransactionMoney record);
}