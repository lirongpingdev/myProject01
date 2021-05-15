package com.gy.kanke.store.IDao;

import com.gy.kanke.store.domain.MallProNorm;
import com.gy.kanke.store.domain.MallProNormExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MallProNormMapper {
    int countByExample(MallProNormExample example);

    int deleteByExample(MallProNormExample example);

    int deleteByPrimaryKey(String id);

    int insert(MallProNorm record);

    int insertSelective(MallProNorm record);

    List<MallProNorm> selectByExample(MallProNormExample example);

    MallProNorm selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MallProNorm record, @Param("example") MallProNormExample example);

    int updateByExample(@Param("record") MallProNorm record, @Param("example") MallProNormExample example);

    int updateByPrimaryKeySelective(MallProNorm record);

    int updateByPrimaryKey(MallProNorm record);
}