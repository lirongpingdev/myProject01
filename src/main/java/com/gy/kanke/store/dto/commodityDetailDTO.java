package com.gy.kanke.store.dto;

import java.util.ArrayList;
import java.util.List;

import com.gy.kanke.store.domain.MallPro;
import com.gy.kanke.store.domain.MallProNorm;
import com.gy.kanke.store.domain.MallProNormValue;
import com.gy.kanke.store.domain.MallProNormValuePrice;

/**
 * 用户运营平台调用商家版商品信息展示
 * @author Administrator
 *
 */
public class commodityDetailDTO {
	private MallPro mallPro;
	private List<MallProNorm> proNorms=new ArrayList<>();
	private List<MallProNormValue> mallProNormValues=new ArrayList<>();
	private List<MallProNormValuePrice>  normValuePrices=new  ArrayList<>();
	public MallPro getMallPro() {
		return mallPro;
	}
	public void setMallPro(MallPro mallPro) {
		this.mallPro = mallPro;
	}
	public List<MallProNorm> getProNorms() {
		return proNorms;
	}
	public void setProNorms(List<MallProNorm> proNorms) {
		this.proNorms = proNorms;
	}
	public List<MallProNormValue> getMallProNormValues() {
		return mallProNormValues;
	}
	public void setMallProNormValues(List<MallProNormValue> mallProNormValues) {
		this.mallProNormValues = mallProNormValues;
	}
	public List<MallProNormValuePrice> getNormValuePrices() {
		return normValuePrices;
	}
	public void setNormValuePrices(List<MallProNormValuePrice> normValuePrices) {
		this.normValuePrices = normValuePrices;
	}
}
