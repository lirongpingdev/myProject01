package com.gy.kanke.store.dto;

import java.math.BigDecimal;
import java.util.Date;

public class OrderPayDTO {
    private String id;

    private String orderNo;

    private BigDecimal price;

    private BigDecimal loosPinMoney;

    private BigDecimal totalGoldcoin;

    private BigDecimal charityCoin;

    private String transNo;

    private Integer state;

    private Date payTime;

    private String creator;

    private Date createTime;

    private String lastUpdateId;

    private Date lastUpdateTime;

    private BigDecimal postPrice;

    private String oldOrderNo;

    private String kankeTransNo;

    private BigDecimal settlementPrice;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getLoosPinMoney() {
        return loosPinMoney;
    }

    public void setLoosPinMoney(BigDecimal loosPinMoney) {
        this.loosPinMoney = loosPinMoney;
    }

    public BigDecimal getTotalGoldcoin() {
        return totalGoldcoin;
    }

    public void setTotalGoldcoin(BigDecimal totalGoldcoin) {
        this.totalGoldcoin = totalGoldcoin;
    }

    public BigDecimal getCharityCoin() {
        return charityCoin;
    }

    public void setCharityCoin(BigDecimal charityCoin) {
        this.charityCoin = charityCoin;
    }

    public String getTransNo() {
        return transNo;
    }

    public void setTransNo(String transNo) {
        this.transNo = transNo == null ? null : transNo.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
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

    public BigDecimal getPostPrice() {
        return postPrice;
    }

    public void setPostPrice(BigDecimal postPrice) {
        this.postPrice = postPrice;
    }

    public String getOldOrderNo() {
        return oldOrderNo;
    }

    public void setOldOrderNo(String oldOrderNo) {
        this.oldOrderNo = oldOrderNo == null ? null : oldOrderNo.trim();
    }

    public String getKankeTransNo() {
        return kankeTransNo;
    }

    public void setKankeTransNo(String kankeTransNo) {
        this.kankeTransNo = kankeTransNo == null ? null : kankeTransNo.trim();
    }

    public BigDecimal getSettlementPrice() {
        return settlementPrice;
    }

    public void setSettlementPrice(BigDecimal settlementPrice) {
        this.settlementPrice = settlementPrice;
    }
}