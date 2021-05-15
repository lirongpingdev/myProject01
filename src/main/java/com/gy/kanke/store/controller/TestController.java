package com.gy.kanke.store.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gy.kanke.store.common.CommonMethod;
import com.gy.kanke.store.common.DateUtils;
import com.gy.portal.bizDomain.UserInfo;

@Controller
@RequestMapping("/test")
public class TestController {	
	@RequestMapping(value = "/index")
	@ResponseBody
    public String index(HttpServletRequest request,Model model, String no) {
		String sessionId = request.getSession().getId();
		boolean islogin = com.gy.portal.common.UserHelper.IsLogin(request);
		UserInfo ui = com.gy.portal.common.UserHelper.getLoginUserInfo(request);
		String result = "sessionId:" + sessionId;
		result += " <br/>portaljjsid:" + CommonMethod.getCookieValue(request, "portaljjsid");
		result += " <br/>isLogin:" + islogin;
		return result;
    }
	
	@RequestMapping(value = "/getDateTime")
	@ResponseBody
    public String getDateTime(HttpServletRequest request,Model model, String no) {
		return DateUtils.getStringDate();
    }
}