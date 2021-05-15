package com.gy.kanke.store.param;

import java.util.ArrayList;
import java.util.List;

import com.gy.kanke.store.domain.MallPro;
import com.gy.portal.bizDomain.UserInfo;

/*
 * 商品规格入参
 */
public class ProStandardParam {

	private UserInfo info;
	private String normName;
	List<proNormValueParam> porVal=new ArrayList<proNormValueParam>();
	
	public UserInfo getInfo() {
		return info;
	}
	public void setInfo(UserInfo info) {
		this.info = info;
	}
	public String getNormName() {
		return normName;
	}
	public void setNormName(String normName) {
		this.normName = normName;
	}
	public List<proNormValueParam> getPorVal() {
		return porVal;
	}
	public void setPorVal(List<proNormValueParam> porVal) {
		this.porVal = porVal;
	}
	
	
}
