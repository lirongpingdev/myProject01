package com.gy.kanke.store.domain;

import java.util.Date;

public class AuditRecords {
    private String id;

    private String auditType;

    private String auditObjectId;

    private String auditManagerId;

    private String auditManagerName;

    private Integer auditState;

    private String auditResult;

    private Date auditTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getAuditType() {
        return auditType;
    }

    public void setAuditType(String auditType) {
        this.auditType = auditType == null ? null : auditType.trim();
    }

    public String getAuditObjectId() {
        return auditObjectId;
    }

    public void setAuditObjectId(String auditObjectId) {
        this.auditObjectId = auditObjectId == null ? null : auditObjectId.trim();
    }

    public String getAuditManagerId() {
        return auditManagerId;
    }

    public void setAuditManagerId(String auditManagerId) {
        this.auditManagerId = auditManagerId == null ? null : auditManagerId.trim();
    }

    public String getAuditManagerName() {
        return auditManagerName;
    }

    public void setAuditManagerName(String auditManagerName) {
        this.auditManagerName = auditManagerName == null ? null : auditManagerName.trim();
    }

    public Integer getAuditState() {
        return auditState;
    }

    public void setAuditState(Integer auditState) {
        this.auditState = auditState;
    }

    public String getAuditResult() {
        return auditResult;
    }

    public void setAuditResult(String auditResult) {
        this.auditResult = auditResult == null ? null : auditResult.trim();
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }
}