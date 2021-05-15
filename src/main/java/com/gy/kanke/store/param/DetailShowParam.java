package com.gy.kanke.store.param;

import java.util.ArrayList;
import java.util.List;

import com.gy.kanke.store.domain.MallPro;

/**
 * 商品信息修改入参
 * @author Administrator
 *
 */
public class DetailShowParam {
	private MallPro mallPro;
	List<proNormValueParam> porVal=new ArrayList<proNormValueParam>();
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
