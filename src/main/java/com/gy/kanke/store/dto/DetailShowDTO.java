package com.gy.kanke.store.dto;

import java.util.ArrayList;
import java.util.List;

import com.gy.kanke.store.domain.MallPro;
import com.gy.kanke.store.param.proNormValueParam;

/**
 * 商品详情展示
 * @author Administrator
 *
 */
public class DetailShowDTO {
	private String normName;
	private MallPro mallPro;
	List<proNormValueParam> porVal=new ArrayList<proNormValueParam>();
	
	
	public String getNormName() {
		return normName;
	}
	public void setNormName(String normName) {
		this.normName = normName;
	}
	public MallPro getMallPro() {
		return mallPro;
	}
	public void setMallPro(MallPro mallPro) {
		this.mallPro = mallPro;
	}
	public List<proNormValueParam> getPorVal() {
		return porVal;
	}
	public void setPorVal(List<proNormValueParam> porVal) {
		this.porVal = porVal;
	}
	
	
	
	 
}
