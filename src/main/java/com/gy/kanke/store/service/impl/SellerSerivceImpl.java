package com.gy.kanke.store.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gy.kanke.store.IDao.SellerInfoMapper;
import com.gy.kanke.store.Util.DateUtil;
import com.gy.kanke.store.common.PageInfo;
import com.gy.kanke.store.common.ResponseBean;
import com.gy.kanke.store.domain.SellerInfo;
import com.gy.kanke.store.domain.SellerInfoExample;
import com.gy.kanke.store.dto.SellerInfoDTO;
import com.gy.kanke.store.service.SellerService;
import com.gy.portal.bizDomain.UserInfo;

@Service("sellerSerivceImpl")
public class SellerSerivceImpl implements SellerService {

	@Autowired
	private SellerInfoMapper sellerInfoMapper;

	@Override
	public SellerInfo getAccountState(UserInfo user) {

		SellerInfo result = null;
		SellerInfoExample example = new SellerInfoExample();
		com.gy.kanke.store.domain.SellerInfoExample.Criteria criteria = example.createCriteria();
		if (user.getAccount() != null) {
			criteria.andAccountEqualTo(user.getAccount().trim());
		}

		List<SellerInfo> sellers = sellerInfoMapper.selectByExample(example);
		// 1:待审核，2:审核通过，3:审核不通过
		if (sellers != null && !sellers.isEmpty()) {
			result = sellers.get(0);
		}

		return result;
	}

	@Override
	public int addSellerInfo(SellerInfo sellerInfo) {
		return sellerInfoMapper.insert(sellerInfo);
	}

	@Override
	public int updateSellerInfo(SellerInfo sellerInfo) {
		return sellerInfoMapper.updateByPrimaryKeySelective(sellerInfo);
	}

	@Override
	public SellerInfo getSellerInfo(SellerInfo sellerInfo) {

		SellerInfo seller = null;
		SellerInfoExample example = new SellerInfoExample();
		com.gy.kanke.store.domain.SellerInfoExample.Criteria criteria = example.createCriteria();
		if (sellerInfo.getAccount() != null && !"".equalsIgnoreCase(sellerInfo.getAccount().trim())) {
			criteria.andAccountEqualTo(sellerInfo.getAccount().trim());
		}

		if (sellerInfo.getId() != null && !"".equals(sellerInfo.getId().trim())) {
			criteria.andIdEqualTo(sellerInfo.getId().trim());
		}

		List<SellerInfo> sellers = sellerInfoMapper.selectByExample(example);
		if (sellers != null && !sellers.isEmpty()) {
			seller = sellers.get(0);
		}
		
		return seller;
	}

	@Override
	public int updateSellerStatus(SellerInfoDTO dto) {

		SellerInfo sellerInfo = new SellerInfo();
		sellerInfo.setAccount(dto.getAccount());
		
		SellerInfo seller = getSellerInfo(sellerInfo);
		seller.setNotPassReason(dto.getNotPassReason());
		seller.setStatus(dto.getStatus());
		
		return sellerInfoMapper.updateByPrimaryKeySelective(seller);
	}

	@Override
	public ResponseBean<List<SellerInfoDTO>> getSellerList(SellerInfoDTO dto) {
		
		ResponseBean<List<SellerInfoDTO>> response = new ResponseBean<List<SellerInfoDTO>>();
		
		SellerInfoExample example = new SellerInfoExample();
		com.gy.kanke.store.domain.SellerInfoExample.Criteria criteria = example.createCriteria();
		if (dto.getAccount() != null && !"".equals(dto.getAccount().trim())) {
			criteria.andAccountEqualTo(dto.getAccount());
		}

		if (dto.getBeginTimeStr() != null && !"".equals(dto.getBeginTimeStr().trim())) {
			criteria.andBeginTimeGreaterThanOrEqualTo(DateUtil.str2Date(dto.getBeginTimeStr().trim()));
		}
		
		if(dto.getEndTimeStr()!=null && !"".equals(dto.getEndTimeStr().trim())){
			criteria.andEndTimeLessThanOrEqualTo(DateUtil.str2Date(dto.getEndTimeStr().trim()));
		}
		
		//representativeName
		if(dto.getRepresentativeName()!=null && !"".equals(dto.getRepresentativeName().trim())){
			criteria.andRepresentativeNameLike(dto.getRepresentativeName().trim());
		}
		
		//status
		if(dto.getStatus()!=null && dto.getStatus()!=0){
			criteria.andStatusEqualTo(dto.getStatus());
		}

		int count = sellerInfoMapper.countByExample(example);
		response.setTotalCount(count);
		PageInfo page= new PageInfo();
		page.setPageSize(dto.getPageSize());
		page.setTotalCount(count);
		page.setPage(dto.getPage());
		
		List<SellerInfo> sellers = sellerInfoMapper.selectByExample(example);
		
		List<SellerInfoDTO> sellerList = null;
		if (sellers != null && !sellers.isEmpty()) {
			sellerList = new ArrayList<SellerInfoDTO>();
			SellerInfoDTO sellerDTO = null;
			for (SellerInfo seller : sellers) {
				sellerDTO = new SellerInfoDTO();
				BeanUtils.copyProperties(seller, sellerDTO);
				sellerDTO.setBeginTimeStr(DateUtil.getDateStr(seller.getBeginTime()));
				sellerDTO.setEndTimeStr(DateUtil.getDateStr(seller.getEndTime()));
				sellerList.add(sellerDTO);
			}
		}
		response.setDatas(sellerList);
		return response;
	}

}