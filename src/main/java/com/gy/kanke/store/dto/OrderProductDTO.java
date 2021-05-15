package com.gy.kanke.store.dto;

import java.math.BigDecimal;
import java.util.Date;

public class OrderProductDTO {
    private String id;

    private String orderNo;

    private String merchantId;

    private String merchantName;

    private String proId;

    private String logoUrl;

    private String shortTitle;

    private String longTitle;

    private String proDesc;

    private String normContent;

    private String normKeyValue;

    private String creator;

    private Date createTime;

    private String lastUpdateId;

    private Date lastUpdateTime;

    private BigDecimal price;

    private Integer mustNeedPrice;

    private BigDecimal loosPinMoney;

    private Integer mustNeedMoney;

    private BigDecimal totalGoldcoin;

    private Integer mustNeedGoldcoin;

    private BigDecimal charityCoin;

    private Integer mustNeedCoin;

    private BigDecimal postPrice;

    private Integer buyCount;

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

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId == null ? null : merchantId.trim();
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName == null ? null : merchantName.trim();
    }

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId == null ? null : proId.trim();
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl == null ? null : logoUrl.trim();
    }

    public String getShortTitle() {
        return shortTitle;
    }

    public void setShortTitle(String shortTitle) {
        this.shortTitle = shortTitle == null ? null : shortTitle.trim();
    }

    public String getLongTitle() {
        return longTitle;
    }

    public void setLongTitle(String longTitle) {
        this.longTitle = longTitle == null ? null : longTitle.trim();
    }

    public String getProDesc() {
        return proDesc;
    }

    public void setProDesc(String proDesc) {
        this.proDesc = proDesc == null ? null : proDesc.trim();
    }

    public String getNormContent() {
        return normContent;
    }

    public void setNormContent(String normContent) {
        this.normContent = normContent == null ? null : normContent.trim();
    }

    public String getNormKeyValue() {
        return normKeyValue;
    }

    public void setNormKeyValue(String normKeyValue) {
        this.normKeyValue = normKeyValue == null ? null : normKeyValue.trim();
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

    public Integer getMustNeedPrice() {
        return mustNeedPrice;
    }

    public void setMustNeedPrice(Integer mustNeedPrice) {
        this.mustNeedPrice = mustNeedPrice;
    }

    public BigDecimal getLoosPinMoney() {
        return loosPinMoney;
    }

    public void setLoosPinMoney(BigDecimal loosPinMoney) {
        this.loosPinMoney = loosPinMoney;
    }

    public Integer getMustNeedMoney() {
        return mustNeedMoney;
    }

    public void setMustNeedMoney(Integer mustNeedMoney) {
        this.mustNeedMoney = mustNeedMoney;
    }

    public BigDecimal getTotalGoldcoin() {
        return totalGoldcoin;
    }

    public void setTotalGoldcoin(BigDecimal totalGoldcoin) {
        this.totalGoldcoin = totalGoldcoin;
    }

    public Integer getMustNeedGoldcoin() {
        return mustNeedGoldcoin;
    }

    public void setMustNeedGoldcoin(Integer mustNeedGoldcoin) {
        this.mustNeedGoldcoin = mustNeedGoldcoin;
    }

    public BigDecimal getCharityCoin() {
        return charityCoin;
    }

    public void setCharityCoin(BigDecimal charityCoin) {
        this.charityCoin = charityCoin;
    }

    public Integer getMustNeedCoin() {
        return mustNeedCoin;
    }

    public void setMustNeedCoin(Integer mustNeedCoin) {
        this.mustNeedCoin = mustNeedCoin;
    }

    public BigDecimal getPostPrice() {
        return postPrice;
    }

    public void setPostPrice(BigDecimal postPrice) {
        this.postPrice = postPrice;
    }

    public Integer getBuyCount() {
        return buyCount;
    }

    public void setBuyCount(Integer buyCount) {
        this.buyCount = buyCount;
    }
}