package com.gy.kanke.store.common;

/**
 * 看客秘钥http通信加密
 * @author Administrator
 *
 */
public class HttpSecretKey {

	private String token;
	private static String systemIdentify="kanke_store_00001";
	public static String getToken(String keyId) {
		return MD5.MD5(keyId + systemIdentify + MD5.MD5(systemIdentify));
	}
	public static  String getSystemIdentify() {
		return systemIdentify;
	}
	
	/**
	 * param.put("token", MD5.MD5(user.getAccount() + id + MD5.MD5(id)));
	 * param.put("systemIdentify", id);
	 */
	
}
