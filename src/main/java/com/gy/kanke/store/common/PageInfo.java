package com.gy.kanke.store.common;

public class PageInfo {
	
	private int page = 1; // 当前页
	
	private int pageSize = 10; // 每页多少行
	
	private int totalCount; // 共多少行
	
	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		if (page < 1) {
			page = 1;
		}
		this.page = page;
	}

	public int getStart() {
		return getPage() > 0 ? (this.getPage()-1) * pageSize : 0;
	}

	public int getEnd() {
		return pageSize;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		if (pageSize < 1) {
			pageSize = 10;
		}
		this.pageSize = pageSize;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getTotalPage() {
		this.totalCount = (getTotalCount() % getPageSize() == 0 ? getTotalCount() / getPageSize()
				: getTotalCount() / getPageSize() + 1);
		return this.totalCount;
	}
}
