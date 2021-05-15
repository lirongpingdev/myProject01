package com.gy.kanke.store.IDao;

import com.gy.kanke.store.domain.AuditRecords;
import com.gy.kanke.store.domain.AuditRecordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuditRecordsMapper {
    int countByExample(AuditRecordsExample example);

    int deleteByExample(AuditRecordsExample example);

    int insert(AuditRecords record);

    int insertSelective(AuditRecords record);

    List<AuditRecords> selectByExample(AuditRecordsExample example);

    int updateByExampleSelective(@Param("record") AuditRecords record, @Param("example") AuditRecordsExample example);

    int updateByExample(@Param("record") AuditRecords record, @Param("example") AuditRecordsExample example);
}