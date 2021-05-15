package com.gy.kanke.store.IDao;

import com.gy.kanke.store.domain.TranMoneyDetails;
import com.gy.kanke.store.domain.TranMoneyDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TranMoneyDetailsMapper {
    int countByExample(TranMoneyDetailsExample example);

    int deleteByExample(TranMoneyDetailsExample example);

    int deleteByPrimaryKey(String id);

    int insert(TranMoneyDetails record);

    int insertSelective(TranMoneyDetails record);

    List<TranMoneyDetails> selectByExample(TranMoneyDetailsExample example);

    TranMoneyDetails selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TranMoneyDetails record, @Param("example") TranMoneyDetailsExample example);

    int updateByExample(@Param("record") TranMoneyDetails record, @Param("example") TranMoneyDetailsExample example);

    int updateByPrimaryKeySelective(TranMoneyDetails record);

    int updateByPrimaryKey(TranMoneyDetails record);
}