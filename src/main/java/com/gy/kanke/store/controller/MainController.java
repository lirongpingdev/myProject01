package com.gy.kanke.store.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gy.kanke.store.domain.SellerInfo;
import com.gy.kanke.store.service.SellerService;
import com.gy.portal.bizDomain.UserInfo;

@Controller
@RequestMapping("/main")
public class MainController {

	private Logger logger = org.slf4j.LoggerFactory.getLogger(MainController.class);

	@Autowired
	private SellerService sellerService;
	
	/**
	 * 登录以后直接进订单中心,如果没有入驻进入驻页面
	 * 
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/index")
	public String toIndex(HttpServletRequest request, Model model) {
		String toPage = "";
		try {
			UserInfo user = com.gy.portal.common.UserHelper.getLoginUserInfo(request);
			// 0:未入驻 , 1:待审核，2:审核通过，3:审核不通过
			SellerInfo sellerInfo = sellerService.getAccountState(user);
			if (sellerInfo == null) {
				return "enter/enterBaseInfo";
			}

			int state = sellerInfo.getStatus();
			if (state == 0) {
				toPage = "enter/enterBaseInfo";
			} else if (state == 1) {
				toPage = "enter/waitingCheck";
			} else if (state == 2) {
				toPage = "order/orderInfo";
			} else if (state == 3) {
				toPage = "enter/checkFaiure";
				model.addAttribute("notPassReason", sellerInfo.getNotPassReason());
			}
		} catch (Throwable e) {
			logger.error("To index page error.", e);
		}
		return toPage;
	}
	
}