package com.gy.kanke.store.Util;

import java.util.Map;

import com.gy.kanke.store.common.BaseAPIRequestparam;
import com.gy.kanke.store.common.ResponseStateInfo;

public class ResponseUtil {

	public static <T> String getSuccessResult(T data){
		BaseAPIRequestparam<T> response = new BaseAPIRequestparam<T>();
		response.setData(data);
		ResponseStateInfo state = new ResponseStateInfo();
		state.setCode(ResponseStateInfo.CODE_SUCCESS);
		state.setMsg("Success");
		response.setState(state);
		return response.toJSONString();
	}
	
	public static String getFailResult(String message){
		BaseAPIRequestparam<Map<String,Object>> response = new BaseAPIRequestparam<Map<String,Object>>();
		ResponseStateInfo state = new ResponseStateInfo();
		state.setCode(ResponseStateInfo.CODE_FAIL);
		state.setMsg(message);
		response.setState(state);
		return response.toJSONString();
	}

	
	public static <T> BaseAPIRequestparam<T> getFailResponseBean(String message){
		BaseAPIRequestparam<T> response = new BaseAPIRequestparam<T>();
		ResponseStateInfo state = new ResponseStateInfo();
		state.setCode(ResponseStateInfo.CODE_FAIL);
		state.setMsg(message);
		response.setState(state);
		response.setToken();
		return response;
	}
	
	public static <T> BaseAPIRequestparam<T> getSuccessResponseBean(T data){
		BaseAPIRequestparam<T> response = new BaseAPIRequestparam<T>();
		response.setData(data);
		ResponseStateInfo state = new ResponseStateInfo();
		state.setCode(ResponseStateInfo.CODE_SUCCESS);
		state.setMsg("Success");
		response.setState(state);
		response.setToken();
		return response;
	}
	
}
