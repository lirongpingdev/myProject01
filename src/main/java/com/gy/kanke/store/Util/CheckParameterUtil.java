package com.gy.kanke.store.Util;

import javax.servlet.http.HttpServletRequest;

import com.gy.portal.bizDomain.UserInfo;

public class CheckParameterUtil {

	public static boolean checkUserLogin(HttpServletRequest request) {

		boolean islogin = com.gy.portal.common.UserHelper.IsLogin(request);
		if (!islogin) {
			return false;
		}

		UserInfo user = com.gy.portal.common.UserHelper.getLoginUserInfo(request);
		if (user == null) {
			return false;
		}
		return true;
	}

}
