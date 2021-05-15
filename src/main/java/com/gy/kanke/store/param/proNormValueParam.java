package com.gy.kanke.store.param;

import java.math.BigDecimal;

/**
 * 添加规格
 * @author Administrator
 *
 */
public class proNormValueParam {

	//型号id
	private String id;
	//型号
	private String proTypeName;
	//售价
	private BigDecimal  sellingPrice; 
	//原价
	private BigDecimal originalPrice;
	//库存
	private int repertory;
	public String getProTypeName() {
		return proTypeName;
	}
	public void setProTypeName(String proTypeName) {
		this.proTypeName = proTypeName;
	}
	public BigDecimal getSellingPrice() {
		return sellingPrice;
	}
	public void setSellingPrice(BigDecimal sellingPrice) {
		this.sellingPrice = sellingPrice;
	}
	public BigDecimal getOriginalPrice() {
		return originalPrice;
	}
	public void setOriginalPrice(BigDecimal originalPrice) {
		this.originalPrice = originalPrice;
	}
	public int getRepertory() {
		return repertory;
	}
	public void setRepertory(int repertory) {
		this.repertory = repertory;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
}
