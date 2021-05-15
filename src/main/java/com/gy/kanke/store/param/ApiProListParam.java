package com.gy.kanke.store.param;

public class ApiProListParam {
	// 开始日期
	private String startDate;
	// 结束日期
	private String endDate;
	// 商品状态：1:审核中 2:已上架 3:已下架 4:审核不通过
	private Integer state;

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}
}
