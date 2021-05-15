package com.gy.kanke.store.common;

public class ResponseEntity {
	// 状态 (0:失败 1:成功)
	private int status;
	// 错误消息
	private String message;
	
	//总记录数
	private int totalCount;
	
	//总页数
	private int totalPage;
	
	// 返回数据
	private Object data;

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

}