package com.gy.kanke.store.common;

import com.alibaba.fastjson.JSON;

public class CommonWeb {
	 
	public static String ReturnJson(int status, String message, Object data) {
		ResponseEntity res = new ResponseEntity();
		res.setStatus(status);
		res.setMessage(message);
		res.setData(data);
		String jsonStr = JSON.toJSONString(res);
		return jsonStr;
	}
	public static ResponseEntity ReturnJsonObject(int status, String message, Object data) {
		ResponseEntity res = new ResponseEntity();
		res.setStatus(status);
		res.setMessage(message);
		res.setData(data);
		return res;
	}
}