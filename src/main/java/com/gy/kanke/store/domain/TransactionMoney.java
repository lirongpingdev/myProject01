package com.gy.kanke.store.domain;

import java.math.BigDecimal;
import java.util.Date;

public class TransactionMoney {
    private String id;

    private String userId;

    private Date beginTime;

    private Date endTime;

    private String accoutNo;

    private Integer orderQty;

    private BigDecimal needPay;

    private BigDecimal salesAmt;

    private Integer confirmStatus;

    private Integer settleStatus;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getAccoutNo() {
        return accoutNo;
    }

    public void setAccoutNo(String accoutNo) {
        this.accoutNo = accoutNo == null ? null : accoutNo.trim();
    }

    public Integer getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(Integer orderQty) {
        this.orderQty = orderQty;
    }

    public BigDecimal getNeedPay() {
        return needPay;
    }

    public void setNeedPay(BigDecimal needPay) {
        this.needPay = needPay;
    }

    public BigDecimal getSalesAmt() {
        return salesAmt;
    }

    public void setSalesAmt(BigDecimal salesAmt) {
        this.salesAmt = salesAmt;
    }

    public Integer getConfirmStatus() {
        return confirmStatus;
    }

    public void setConfirmStatus(Integer confirmStatus) {
        this.confirmStatus = confirmStatus;
    }

    public Integer getSettleStatus() {
        return settleStatus;
    }

    public void setSettleStatus(Integer settleStatus) {
        this.settleStatus = settleStatus;
    }
}