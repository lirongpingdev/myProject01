package com.gy.kanke.store.common;

public class ResponseBean<T> {
	
	//总记录数
	private int totalCount;
	
	// 返回数据
	private T datas;

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public T getDatas() {
		return datas;
	}

	public void setDatas(T datas) {
		this.datas = datas;
	}
}