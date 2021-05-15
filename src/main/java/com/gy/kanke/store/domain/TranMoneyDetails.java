package com.gy.kanke.store.domain;

import java.math.BigDecimal;
import java.util.Date;

public class TranMoneyDetails {
    private String id;

    private String orderNo;

    private String accoutNo;

    private Date orderTime;

    private BigDecimal totalAmt;

    private BigDecimal postAmt;

    private BigDecimal realAmt;

    private Integer orderState;

    private String customerName;

    private String customerPhone;

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

    public String getAccoutNo() {
        return accoutNo;
    }

    public void setAccoutNo(String accoutNo) {
        this.accoutNo = accoutNo == null ? null : accoutNo.trim();
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public BigDecimal getTotalAmt() {
        return totalAmt;
    }

    public void setTotalAmt(BigDecimal totalAmt) {
        this.totalAmt = totalAmt;
    }

    public BigDecimal getPostAmt() {
        return postAmt;
    }

    public void setPostAmt(BigDecimal postAmt) {
        this.postAmt = postAmt;
    }

    public BigDecimal getRealAmt() {
        return realAmt;
    }

    public void setRealAmt(BigDecimal realAmt) {
        this.realAmt = realAmt;
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone == null ? null : customerPhone.trim();
    }
}