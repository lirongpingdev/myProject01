package com.gy.kanke.store.param;

import java.util.ArrayList;
import java.util.List;

import com.gy.kanke.store.domain.MallPro;
import com.gy.portal.bizDomain.UserInfo;

public class ProStandardUpdParam {
	private UserInfo info;
	private String normName;
	List<proNormValueParam> porVal=new ArrayList<proNormValueParam>();
	private MallPro pro;
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
	public MallPro getPro() {
		return pro;
	}
	public void setPro(MallPro pro) {
		this.pro = pro;
	}
	
	
}
