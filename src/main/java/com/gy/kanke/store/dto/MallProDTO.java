package com.gy.kanke.store.dto;

import java.util.Date;

import com.gy.kanke.store.common.DateUtils;

public class MallProDTO {

	private String members_pro_id;
	private String id;
	// 商品缩略图
	private String picturesShow;
	// 商品名称
	private String shortTitle;
	/// 已售总量
	private int soldCount = 0;
	// 总库存
	private int totalInventory = 0;
	// 发布时间
	private Date createTime;
	private String createTimeStr;
	// 状态
	private Integer state;
	private String stateStr;

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreateTimeStr() {
		if (this.createTime != null) {
			return DateUtils.getStringDate(this.createTime);
		}
		return createTimeStr;
	}

	public void setCreateTimeStr(String createTimeStr) {
		this.createTimeStr = createTimeStr;
	}

	public void setStateStr(String stateStr) {
		this.stateStr = stateStr;
	}

	public String getStateStr() {
		// 1:审核中 2:已上架 3:已下架 4:审核不通过
		if (this.state == null || this.state <= 0) {
			return "";
		} else if (this.state == 1) {
			return "审核中";
		} else if (this.state == 2) {
			return "已上架";
		} else if (this.state == 3) {
			return "已下架";
		} else if (this.state == 4) {
			return "审核不通过";
		}
		return stateStr;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPicturesShow() {
		return picturesShow;
	}

	public void setPicturesShow(String picturesShow) {
		this.picturesShow = picturesShow;
	}

	public String getShortTitle() {
		return shortTitle;
	}

	public void setShortTitle(String shortTitle) {
		this.shortTitle = shortTitle;
	}

	public int getSoldCount() {
		return soldCount;
	}

	public void setSoldCount(int soldCount) {
		this.soldCount = soldCount;
	}

	public int getTotalInventory() {
		return totalInventory;
	}

	public void setTotalInventory(int totalInventory) {
		this.totalInventory = totalInventory;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getMembers_pro_id() {
		return members_pro_id;
	}

	public void setMembers_pro_id(String members_pro_id) {
		this.members_pro_id = members_pro_id;
	}

}