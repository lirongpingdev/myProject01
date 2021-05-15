package com.gy.kanke.store.param;

public class PagerParam {
	private int page = 1; // 当前页
	private int pageSize = 10; // 页大小
	private int totalCount; // 总条数
	private int totalPage; // 共页页

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
		this.totalPage = (getTotalCount() % getPageSize() == 0 ? getTotalCount() / getPageSize() : getTotalCount() / getPageSize() + 1);
		return this.totalPage;
	}
}
