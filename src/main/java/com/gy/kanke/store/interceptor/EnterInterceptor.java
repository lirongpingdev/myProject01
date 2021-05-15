package com.gy.kanke.store.interceptor;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.gy.kanke.store.domain.SellerInfo;
import com.gy.kanke.store.service.SellerService;
import com.gy.portal.bizDomain.UserInfo;

public class EnterInterceptor extends HandlerInterceptorAdapter {

	private List<String> ignoreURL = Collections.emptyList();
	private String sysUrl = null;
	
	@Autowired
	private SellerService sellerService;

	public List<String> getIgnoreURL() {
		return ignoreURL;
	}

	public void setIgnoreURL(List<String> ignoreURL) {
		this.ignoreURL = ignoreURL;
	}

	public String getSysUrl() {
		return sysUrl;
	}

	public void setSysUrl(String sysUrl) {
		this.sysUrl = sysUrl;
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		//忽略的URL
		if (this.IsIgnoreURL(request)) {
			return true;
		}
		
		UserInfo user = com.gy.portal.common.UserHelper.getLoginUserInfo(request);

		SellerInfo sellerInfo = sellerService.getAccountState(user);

		if (sellerInfo == null ) {
			response.sendRedirect(this.getSysUrl() + "seller/baseInfo");
			return false;
		}
		
		if(sellerInfo.getStatus()==0){
			response.sendRedirect(this.getSysUrl() + "seller/baseInfo");
			return false;
		}
		
		if(sellerInfo.getStatus()==1){
			response.sendRedirect(this.getSysUrl() + "seller/waitingCheck");
			return false;
		}
		
		if(sellerInfo.getStatus()==1){
			request.setAttribute("notPassReason", sellerInfo.getNotPassReason());
			response.sendRedirect(this.getSysUrl() + "seller/checkFaiure");
			return false;
		}
		
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		super.afterCompletion(request, response, handler, ex);
	}

	@Override
	public void afterConcurrentHandlingStarted(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		super.afterConcurrentHandlingStarted(request, response, handler);
	}

	private boolean IsIgnoreURL(HttpServletRequest request) {
		if (this.getIgnoreURL() != null && this.getIgnoreURL().size() > 0) {
			String url = request.getRequestURI().toLowerCase();
			Iterator<String> arg3 = this.getIgnoreURL().iterator();
			while (arg3.hasNext()) {
				String item = (String) arg3.next();
				if (item.toLowerCase().equals(url)) {
					return true;
				}
			}
			return false;
		} else {
			return false;
		}
	}
	
}
