package com.gy.kanke.store.IDao;

import com.gy.kanke.store.domain.MallProNormValue;
import com.gy.kanke.store.domain.MallProNormValueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MallProNormValueMapper {
    int countByExample(MallProNormValueExample example);

    int deleteByExample(MallProNormValueExample example);

    int deleteByPrimaryKey(String id);

    int insert(MallProNormValue record);

    int insertSelective(MallProNormValue record);

    List<MallProNormValue> selectByExample(MallProNormValueExample example);

    MallProNormValue selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MallProNormValue record, @Param("example") MallProNormValueExample example);

    int updateByExample(@Param("record") MallProNormValue record, @Param("example") MallProNormValueExample example);

    int updateByPrimaryKeySelective(MallProNormValue record);

    int updateByPrimaryKey(MallProNormValue record);
}