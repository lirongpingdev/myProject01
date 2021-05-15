package com.gy.kanke.store.domain;

import java.util.Date;

public class StoreProperty {
    private String proKey;

    private String proValue;

    private String description;

    private String proType;

    private Boolean status;

    private Date createDate;

    private Date updateDate;

    public String getProKey() {
        return proKey;
    }

    public void setProKey(String proKey) {
        this.proKey = proKey == null ? null : proKey.trim();
    }

    public String getProValue() {
        return proValue;
    }

    public void setProValue(String proValue) {
        this.proValue = proValue == null ? null : proValue.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getProType() {
        return proType;
    }

    public void setProType(String proType) {
        this.proType = proType == null ? null : proType.trim();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}