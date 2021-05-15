package com.gy.kanke.store.common;

public class ResponseStateInfo {
	/**
	 * 成功返回码
	 * */
	public static final int CODE_SUCCESS=0;
	
	/**
	 * 失败返回码
	 * */
	public static final int CODE_FAIL=1;
	
	/**
	 * 响应码 0：成功  1:失败
	 * */
	public int code;
	
	/**
	 * 响应消息(状态消息，非业务数据)
	 * */
	private String msg;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
