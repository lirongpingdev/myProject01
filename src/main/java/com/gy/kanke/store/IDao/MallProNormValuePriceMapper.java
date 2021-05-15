package com.gy.kanke.store.IDao;

import com.gy.kanke.store.domain.MallProNormValuePrice;
import com.gy.kanke.store.domain.MallProNormValuePriceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MallProNormValuePriceMapper {
    int countByExample(MallProNormValuePriceExample example);

    int deleteByExample(MallProNormValuePriceExample example);

    int deleteByPrimaryKey(String id);

    int insert(MallProNormValuePrice record);

    int insertSelective(MallProNormValuePrice record);

    List<MallProNormValuePrice> selectByExample(MallProNormValuePriceExample example);

    MallProNormValuePrice selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MallProNormValuePrice record, @Param("example") MallProNormValuePriceExample example);

    int updateByExample(@Param("record") MallProNormValuePrice record, @Param("example") MallProNormValuePriceExample example);

    int updateByPrimaryKeySelective(MallProNormValuePrice record);

    int updateByPrimaryKey(MallProNormValuePrice record);
}