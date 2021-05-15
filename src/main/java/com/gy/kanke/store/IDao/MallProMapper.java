package com.gy.kanke.store.IDao;

import com.gy.kanke.store.domain.MallPro;
import com.gy.kanke.store.domain.MallProExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MallProMapper {
    int countByExample(MallProExample example);

    int deleteByExample(MallProExample example);

    int deleteByPrimaryKey(String id);

    int insert(MallPro record);

    int insertSelective(MallPro record);

    List<MallPro> selectByExampleWithBLOBs(MallProExample example);

    List<MallPro> selectByExample(MallProExample example);

    MallPro selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MallPro record, @Param("example") MallProExample example);

    int updateByExampleWithBLOBs(@Param("record") MallPro record, @Param("example") MallProExample example);

    int updateByExample(@Param("record") MallPro record, @Param("example") MallProExample example);

    int updateByPrimaryKeySelective(MallPro record);

    int updateByPrimaryKeyWithBLOBs(MallPro record);

    int updateByPrimaryKey(MallPro record);
}