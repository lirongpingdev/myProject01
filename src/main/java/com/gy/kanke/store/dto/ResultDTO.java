package com.gy.kanke.store.dto;

public class ResultDTO<T> {
	/**
	 * 状态 (0:失败 1:成功)
	 */
	private int status;
	
	/**
	 * 错误消息
	 */
	private String message;
	
	/**
	 * 返回数据
	 */
	private T data;

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

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
