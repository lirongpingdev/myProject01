package com.gy.kanke.store.param;

public class Pager {
	private int curPage = 1; // 当前页
	private int pageSize = 10; // 每页多少行
	private int totalRow; // 共多少行
	private int totalPage; // 共多少页

	public int getCurPage() {
		return curPage;
	}

	public void setCurPage(int curPage) {
		if (curPage < 1) {
			curPage = 1;
		}
		this.curPage = curPage;
	}

	public int getStart() {
		return getCurPage() > 0 ? (this.getCurPage()-1) * pageSize : 0;
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

	public int getTotalRow() {
		return totalRow;
	}

	public void setTotalRow(int totalRow) {
		this.totalRow = totalRow;
	}

	public int getTotalPage() {
		this.totalPage = (getTotalRow() % getPageSize() == 0 ? getTotalRow() / getPageSize()
				: getTotalRow() / getPageSize() + 1);
		return this.totalPage;
	}
}
