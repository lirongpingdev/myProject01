package com.gy.kanke.store.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.gy.kanke.store.param.PagerParam;

public class OrderDTO extends PagerParam {
	private String id;

	private String account;
	
	private String parentOrderNo;
	
	// 订单编号
	private String orderNo;

	private String expressName;

	private String expressNo;

	private Integer orderState;
	
	private String orderStateStr;

	private Integer sendGoodsState;

	private Integer confirmSendGoodsState;

	private Integer payState;

	private Integer payType;

	private Integer evaluateState;

	private Integer evaluateType;

	private String transNo;

	private String creator;

	private Date createTime;
	
	private String createTimeStr;

	private String beginTime;

	private String endTime;

	private String lastUpdateId;

	private Date lastUpdateTime;
	
	private String lastUpdateTimeStr;

	private Date confirmReceiveTime;
	
	private String confirmReceiveTimeStr;

	private Integer months;

	// 客户姓名
	private String customerName;

	// 客户电话
	private String customerPhone;

	// 价格
	private BigDecimal price;

	// 邮费
	private BigDecimal postPrice;

	// 实付金额
	private BigDecimal needPay;

	// 会员下单 时间
	private Date memberCreateTime;
	
	private String memberCreateTimeStr;

	// 支付时间
	private Date payTime;
	
	private String payTimeStr;

	// 发货状态
	private Integer sendState;

	public String getLastUpdateTimeStr() {
		return lastUpdateTimeStr;
	}

	public void setLastUpdateTimeStr(String lastUpdateTimeStr) {
		this.lastUpdateTimeStr = lastUpdateTimeStr;
	}

	public String getCreateTimeStr() {
		return createTimeStr;
	}

	public void setCreateTimeStr(String createTimeStr) {
		this.createTimeStr = createTimeStr;
	}

	public String getPayTimeStr() {
		return payTimeStr;
	}

	public void setPayTimeStr(String payTimeStr) {
		this.payTimeStr = payTimeStr;
	}

	public String getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Integer getMonths() {
		return months;
	}

	public void setMonths(Integer months) {
		this.months = months;
	}

	public Integer getSendState() {
		return sendState;
	}

	public void setSendState(Integer sendState) {
		this.sendState = sendState;
	}

	public Date getPayTime() {
		return payTime;
	}

	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public BigDecimal getNeedPay() {
		return needPay;
	}

	public void setNeedPay(BigDecimal needPay) {
		this.needPay = needPay;
	}

	public BigDecimal getPostPrice() {
		return postPrice;
	}

	public void setPostPrice(BigDecimal postPrice) {
		this.postPrice = postPrice;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}
	
	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getParentOrderNo() {
		return parentOrderNo;
	}

	public void setParentOrderNo(String parentOrderNo) {
		this.parentOrderNo = parentOrderNo == null ? null : parentOrderNo.trim();
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo == null ? null : orderNo.trim();
	}

	public String getExpressName() {
		return expressName;
	}

	public void setExpressName(String expressName) {
		this.expressName = expressName == null ? null : expressName.trim();
	}

	public String getExpressNo() {
		return expressNo;
	}

	public void setExpressNo(String expressNo) {
		this.expressNo = expressNo == null ? null : expressNo.trim();
	}

	public Integer getOrderState() {
		return orderState;
	}

	public void setOrderState(Integer orderState) {
		this.orderState = orderState;
	}

	public Integer getSendGoodsState() {
		return sendGoodsState;
	}

	public void setSendGoodsState(Integer sendGoodsState) {
		this.sendGoodsState = sendGoodsState;
	}

	public Integer getConfirmSendGoodsState() {
		return confirmSendGoodsState;
	}

	public void setConfirmSendGoodsState(Integer confirmSendGoodsState) {
		this.confirmSendGoodsState = confirmSendGoodsState;
	}

	public Integer getPayState() {
		return payState;
	}

	public void setPayState(Integer payState) {
		this.payState = payState;
	}

	public Integer getPayType() {
		return payType;
	}

	public void setPayType(Integer payType) {
		this.payType = payType;
	}

	public Integer getEvaluateState() {
		return evaluateState;
	}

	public void setEvaluateState(Integer evaluateState) {
		this.evaluateState = evaluateState;
	}

	public Integer getEvaluateType() {
		return evaluateType;
	}

	public void setEvaluateType(Integer evaluateType) {
		this.evaluateType = evaluateType;
	}

	public String getTransNo() {
		return transNo;
	}

	public void setTransNo(String transNo) {
		this.transNo = transNo == null ? null : transNo.trim();
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

	public Date getConfirmReceiveTime() {
		return confirmReceiveTime;
	}

	public void setConfirmReceiveTime(Date confirmReceiveTime) {
		this.confirmReceiveTime = confirmReceiveTime;
	}

	public String getOrderStateStr() {
		return orderStateStr;
	}

	public void setOrderStateStr(String orderStateStr) {
		this.orderStateStr = orderStateStr;
	}

	public Date getMemberCreateTime() {
		return memberCreateTime;
	}

	public void setMemberCreateTime(Date memberCreateTime) {
		this.memberCreateTime = memberCreateTime;
	}

	public String getMemberCreateTimeStr() {
		return memberCreateTimeStr;
	}

	public void setMemberCreateTimeStr(String memberCreateTimeStr) {
		this.memberCreateTimeStr = memberCreateTimeStr;
	}

	public String getConfirmReceiveTimeStr() {
		return confirmReceiveTimeStr;
	}

	public void setConfirmReceiveTimeStr(String confirmReceiveTimeStr) {
		this.confirmReceiveTimeStr = confirmReceiveTimeStr;
	}
	
}