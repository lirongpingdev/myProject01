package com.gy.kanke.store.domain;

import java.math.BigDecimal;
import java.util.Date;

public class MallPro {
    private String id;

    private String merchantId;

    private String shortTitle;

    private String longTitle;

    private Integer prefectureId;

    private String proDesc;

    private String logoUrl;

    private Integer state;

    private BigDecimal postPrice;

    private Integer postPriceModel;

    private String creator;

    private Date createTime;

    private String lastUpdateId;

    private Date lastUpdateTime;

    private Date putawayTime;

    private String anagerId;

    private Date auditTime;

    private Integer deleteState;

    private String picturesShow;

    private String imgOne;

    private String imgTwo;

    private String imgThree;

    private String imgFour;

    private String imgFive;

    private Integer synchronous;

    private String detailContent;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId == null ? null : merchantId.trim();
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

    public Integer getPrefectureId() {
        return prefectureId;
    }

    public void setPrefectureId(Integer prefectureId) {
        this.prefectureId = prefectureId;
    }

    public String getProDesc() {
        return proDesc;
    }

    public void setProDesc(String proDesc) {
        this.proDesc = proDesc == null ? null : proDesc.trim();
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl == null ? null : logoUrl.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public BigDecimal getPostPrice() {
        return postPrice;
    }

    public void setPostPrice(BigDecimal postPrice) {
        this.postPrice = postPrice;
    }

    public Integer getPostPriceModel() {
        return postPriceModel;
    }

    public void setPostPriceModel(Integer postPriceModel) {
        this.postPriceModel = postPriceModel;
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

    public Date getPutawayTime() {
        return putawayTime;
    }

    public void setPutawayTime(Date putawayTime) {
        this.putawayTime = putawayTime;
    }

    public String getAnagerId() {
        return anagerId;
    }

    public void setAnagerId(String anagerId) {
        this.anagerId = anagerId == null ? null : anagerId.trim();
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public Integer getDeleteState() {
        return deleteState;
    }

    public void setDeleteState(Integer deleteState) {
        this.deleteState = deleteState;
    }

    public String getPicturesShow() {
        return picturesShow;
    }

    public void setPicturesShow(String picturesShow) {
        this.picturesShow = picturesShow == null ? null : picturesShow.trim();
    }

    public String getImgOne() {
        return imgOne;
    }

    public void setImgOne(String imgOne) {
        this.imgOne = imgOne == null ? null : imgOne.trim();
    }

    public String getImgTwo() {
        return imgTwo;
    }

    public void setImgTwo(String imgTwo) {
        this.imgTwo = imgTwo == null ? null : imgTwo.trim();
    }

    public String getImgThree() {
        return imgThree;
    }

    public void setImgThree(String imgThree) {
        this.imgThree = imgThree == null ? null : imgThree.trim();
    }

    public String getImgFour() {
        return imgFour;
    }

    public void setImgFour(String imgFour) {
        this.imgFour = imgFour == null ? null : imgFour.trim();
    }

    public String getImgFive() {
        return imgFive;
    }

    public void setImgFive(String imgFive) {
        this.imgFive = imgFive == null ? null : imgFive.trim();
    }

    public Integer getSynchronous() {
        return synchronous;
    }

    public void setSynchronous(Integer synchronous) {
        this.synchronous = synchronous;
    }

    public String getDetailContent() {
        return detailContent;
    }

    public void setDetailContent(String detailContent) {
        this.detailContent = detailContent == null ? null : detailContent.trim();
    }
}