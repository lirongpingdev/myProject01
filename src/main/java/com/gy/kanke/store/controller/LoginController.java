package com.gy.kanke.store.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gy.kanke.store.common.ResponseEntity;
import com.gy.portal.bizDomain.UserInfo;

@Controller
@RequestMapping("/login")
public class LoginController {

	private Logger logger = org.slf4j.LoggerFactory.getLogger(LoginController.class);
	
	/**
	 * 获取登录用户信息
	 * 
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/getLoginUser")
	@ResponseBody
	public ResponseEntity getLoginUser(HttpServletRequest request) {
		
		ResponseEntity response = new ResponseEntity();
		String account = null;
		try {
			UserInfo ui = com.gy.portal.common.UserHelper.getLoginUserInfo(request);
			response.setData(ui);
			response.setStatus(0);
			response.setMessage("OK");
		} catch (Throwable e) {
			logger.error("Login error,account="+account,e);
			response.setStatus(1);
			response.setMessage("Login error,account="+account+"smg="+e.getMessage());
		}
		return response;
	}
	
	/**
	 * 退出
	 * 
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/loginOut")
	@ResponseBody
	public ResponseEntity loginOut(HttpServletRequest request) {
		
		ResponseEntity response = new ResponseEntity();
		String account = null;
		try {
			UserInfo ui = com.gy.portal.common.UserHelper.getLoginUserInfo(request);
			account = ui.getAccount();
			com.gy.portal.common.UserHelper.UserLogOut(request, 2);
			response.setStatus(0);
			response.setMessage("OK");
		} catch (Throwable e) {
			logger.error("Login out error,account="+account,e);
			response.setStatus(1);
			response.setMessage("Login out error,account="+account+"smg="+e.getMessage());
		}
		return response;
	}
	
}