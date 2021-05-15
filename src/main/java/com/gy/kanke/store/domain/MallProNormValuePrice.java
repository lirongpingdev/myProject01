package com.gy.kanke.store.domain;

import java.math.BigDecimal;
import java.util.Date;

public class MallProNormValuePrice {
    private String id;

    private String proId;

    private String mormKeys;

    private BigDecimal settlementPrice;

    private Integer stockpile;

    private String creator;

    private Date createTime;

    private String lastUpdateId;

    private Date lastUpdateTime;

    private BigDecimal price;

    private BigDecimal originalprice;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId == null ? null : proId.trim();
    }

    public String getMormKeys() {
        return mormKeys;
    }

    public void setMormKeys(String mormKeys) {
        this.mormKeys = mormKeys == null ? null : mormKeys.trim();
    }

    public BigDecimal getSettlementPrice() {
        return settlementPrice;
    }

    public void setSettlementPrice(BigDecimal settlementPrice) {
        this.settlementPrice = settlementPrice;
    }

    public Integer getStockpile() {
        return stockpile;
    }

    public void setStockpile(Integer stockpile) {
        this.stockpile = stockpile;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getLastUpdateId() {
        return lastUpdateId;
    }

    public void setLastUpdateId(String lastUpdateId) {
        this.lastUpdateId = lastUpdateId == null ? null : lastUpdateId.trim();
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getOriginalprice() {
        return originalprice;
    }

    public void setOriginalprice(BigDecimal originalprice) {
        this.originalprice = originalprice;
    }
}