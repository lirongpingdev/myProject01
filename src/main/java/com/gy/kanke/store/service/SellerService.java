package com.gy.kanke.store.service;

import java.util.List;

import com.gy.kanke.store.common.ResponseBean;
import com.gy.kanke.store.domain.SellerInfo;
import com.gy.kanke.store.dto.SellerInfoDTO;
import com.gy.portal.bizDomain.UserInfo;

public interface SellerService {
	SellerInfo getAccountState(UserInfo user);
	
	int  addSellerInfo(SellerInfo sellerInfo);
	
	int  updateSellerInfo(SellerInfo sellerInfo);	
	
	SellerInfo  getSellerInfo(SellerInfo sellerInfo);	
	
	int  updateSellerStatus(SellerInfoDTO sellerInfo);
	
	ResponseBean<List<SellerInfoDTO>>  getSellerList(SellerInfoDTO sellerInfo);
	
}
