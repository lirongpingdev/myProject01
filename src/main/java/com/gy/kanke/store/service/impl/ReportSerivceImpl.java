package com.gy.kanke.store.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gy.kanke.store.IDao.OrderManageMapper;
import com.gy.kanke.store.IDao.TranMoneyDetailsMapper;
import com.gy.kanke.store.IDao.TransactionMoneyMapper;
import com.gy.kanke.store.Util.DateUtil;
import com.gy.kanke.store.common.ResponseBean;
import com.gy.kanke.store.common.ResponseEntity;
import com.gy.kanke.store.domain.TranMoneyDetails;
import com.gy.kanke.store.domain.TranMoneyDetailsExample;
import com.gy.kanke.store.domain.TransactionMoney;
import com.gy.kanke.store.domain.TransactionMoneyExample;
import com.gy.kanke.store.dto.TranMoneyDetailsDTO;
import com.gy.kanke.store.dto.TransactionMoneyDTO;
import com.gy.kanke.store.param.PagerParam;
import com.gy.kanke.store.service.ReportService;

@Service("reportSerivceImpl")
public class ReportSerivceImpl implements ReportService {

	@Autowired
	private TransactionMoneyMapper transactionMoneyMapper;
	
	@Autowired
	private TranMoneyDetailsMapper tranMoneyDetailsMapper;

	@Autowired
	private OrderManageMapper orderManageMapper;
	
	@Override
	public ResponseEntity transactionMoneyBy(TransactionMoneyDTO tranDTO) {

		ResponseEntity response = new ResponseEntity();
		
		TransactionMoneyExample example = new TransactionMoneyExample();
		com.gy.kanke.store.domain.TransactionMoneyExample.Criteria criteria = example.createCriteria();
		if (tranDTO.getAccoutNo() != null && !"".equals(tranDTO.getAccoutNo().trim())) {
			criteria.andAccoutNoEqualTo(tranDTO.getAccoutNo());
		}

		if (tranDTO.getConfirmStatus() != null) {
			criteria.andConfirmStatusEqualTo(tranDTO.getConfirmStatus());
		}

		if (tranDTO.getSettleStatus() != null) {
			criteria.andSettleStatusEqualTo(tranDTO.getSettleStatus());
		}

		int count = transactionMoneyMapper.countByExample(example);
		response.setTotalCount(count);
		
		PagerParam page = new PagerParam();
		page.setTotalCount(count);
		page.setPageSize(tranDTO.getPageSize());
		page.setPage(tranDTO.getPage());
		example.setLimitEnd(page.getPageSize());
		example.setLimitStart(page.getStart());

		List<TransactionMoney> selectByExample = transactionMoneyMapper.selectByExample(example);
		List<TransactionMoneyDTO> transactionMoneyList = new ArrayList<TransactionMoneyDTO>();

		for (TransactionMoney tran : selectByExample) {
			transactionMoneyList.add(getDtoBaen(tran));
		}

		response.setTotalPage(page.getTotalPage());
		response.setData(transactionMoneyList);
		
		return response;
	}

	private TransactionMoneyDTO getDtoBaen(TransactionMoney tran) {
		TransactionMoneyDTO dto = new TransactionMoneyDTO();
		dto.setId(tran.getId());
		dto.setAccoutNo(tran.getAccoutNo());
		dto.setBeginTime(tran.getBeginTime());
		dto.setEndTimeStr(DateUtil.getDateStr(tran.getEndTime()));
		dto.setBeginTimeStr(DateUtil.getDateStr(tran.getBeginTime()));
		dto.setOrderQty(tran.getOrderQty());
		dto.setNeedPay(tran.getNeedPay());
		dto.setSalesAmt(tran.getSalesAmt());
		dto.setConfirmStatus(tran.getConfirmStatus());
		dto.setSettleStatus(tran.getSettleStatus());
		return dto;
	}

	@Override
	public TransactionMoneyDTO getTransactionMoneyById(String id, String accountNo) {
		TransactionMoney tran = transactionMoneyMapper.selectByPrimaryKey(id);
		if(tran==null){
			return null;
		}
		return getDtoBaen(tran);
	}

	@Override
	public ResponseEntity getTransactionMoneyDetails(TranMoneyDetailsDTO tranDTO) {

		ResponseEntity response = new ResponseEntity();
		TranMoneyDetailsExample example = new TranMoneyDetailsExample();
		com.gy.kanke.store.domain.TranMoneyDetailsExample.Criteria criteria = example.createCriteria();
		
		if (tranDTO.getAccoutNo() != null && !"".equals(tranDTO.getAccoutNo().trim())) {
			criteria.andAccoutNoEqualTo(tranDTO.getAccoutNo());
		}
		
		int count = tranMoneyDetailsMapper.countByExample(example);
		response.setTotalCount(count);
		PagerParam page = new PagerParam();
		page.setTotalCount(count);
		page.setPageSize(tranDTO.getPageSize());
		page.setPage(tranDTO.getPage());
		response.setTotalPage(page.getTotalPage());
		example.setLimitEnd(page.getEnd());
		example.setLimitStart(page.getStart());
		
		List<TranMoneyDetails> selectByExample = tranMoneyDetailsMapper.selectByExample(example);
		List<TranMoneyDetailsDTO> tranDetails = new ArrayList<TranMoneyDetailsDTO>();

		for (TranMoneyDetails tran : selectByExample) {
			tranDetails.add(getTranDetailsDTO(tran));
		}
		
		response.setData(tranDetails);
		return response;
	}

	private TranMoneyDetailsDTO getTranDetailsDTO(TranMoneyDetails tran) {
		TranMoneyDetailsDTO dto = new TranMoneyDetailsDTO();
		dto.setId(tran.getId());
		dto.setAccoutNo(tran.getAccoutNo());
		dto.setOrderNo(tran.getOrderNo());
		dto.setOrderTimeStr(DateUtil.getDateStr(tran.getOrderTime()));
		dto.setTotalAmt(tran.getTotalAmt());
		dto.setPostAmt(tran.getPostAmt());
		dto.setRealAmt(tran.getRealAmt());
		dto.setOrderState(tran.getOrderState());
		dto.setCustomerName(tran.getCustomerName());
		dto.setCustomerPhone(tran.getCustomerPhone());
		return dto;
	}

	@Override
	public void updateConfirm(TransactionMoneyDTO tranDTO) {
		TransactionMoney record = new TransactionMoney();
		if(tranDTO.getId()!=null && !"".equals(tranDTO.getId().trim())){
			record.setId(tranDTO.getId());
		}
		
		if(tranDTO.getUserId()!=null && !"".equals(tranDTO.getUserId().trim())){
			record.setUserId(tranDTO.getUserId());
		}
		
		if(tranDTO.getConfirmStatus()!=null){
			record.setConfirmStatus(tranDTO.getConfirmStatus());
		}
		
		if(tranDTO.getSettleStatus()!=null){
			record.setSettleStatus(tranDTO.getSettleStatus());
		}
		
		transactionMoneyMapper.updateByPrimaryKeySelective(record);
		
	}

	@Override
	public void createTranMoney() {
		
		Date date = new Date();
		String startDate = DateUtil.getFirstDayOfMonth(date);
		String endDate = DateUtil.getLastDayOfMonth(date);
		
		Map<String,Object> map =new HashMap<String,Object>();
		map.put("startDate", startDate);
		map.put("endDate", endDate);
		
		 List<TranMoneyDetailsDTO> tranMoneyDetailList = orderManageMapper.getTranMoneyDetailsByOrder(map);
		 if(tranMoneyDetailList!=null && !tranMoneyDetailList.isEmpty()){
			 TranMoneyDetails tranMoneyDetail= null;
			 TransactionMoney transactionMoney = null;
			 Map<String,TransactionMoney> tranMoneyMap = new HashMap<String,TransactionMoney>();
			 String accoutNo=null;
			 for(TranMoneyDetailsDTO dto :tranMoneyDetailList){
				 tranMoneyDetail = new TranMoneyDetails();
				if (tranMoneyMap.containsKey(dto.getUserId())) {
					transactionMoney = tranMoneyMap.get(dto.getUserId());
					accoutNo = transactionMoney.getAccoutNo();
					transactionMoney.setOrderQty(transactionMoney.getOrderQty()+1);
					transactionMoney.setSalesAmt(transactionMoney.getSalesAmt().add(dto.getTotalAmt()));
					transactionMoney.setNeedPay(transactionMoney.getNeedPay().add(dto.getTotalAmt()));
				}else{
					transactionMoney = new TransactionMoney();
					accoutNo = UUID.randomUUID().toString();
					transactionMoney.setUserId(dto.getUserId());
					transactionMoney.setId(accoutNo);
					transactionMoney.setAccoutNo(accoutNo);
					transactionMoney.setOrderQty(1);
					transactionMoney.setSalesAmt(dto.getTotalAmt());
					transactionMoney.setNeedPay(dto.getTotalAmt());
					transactionMoney.setBeginTime(new Date());
					transactionMoney.setEndTime(new Date());
					transactionMoney.setConfirmStatus(1);
					transactionMoney.setSettleStatus(1);
					tranMoneyMap.put(dto.getUserId(), transactionMoney);
				}
				//明细
				tranMoneyDetail.setId(UUID.randomUUID().toString());
				tranMoneyDetail.setAccoutNo(accoutNo);
				tranMoneyDetail.setOrderNo(dto.getOrderNo());
				tranMoneyDetail.setOrderState(dto.getOrderState());
				tranMoneyDetail.setCustomerName(dto.getCustomerName());
				tranMoneyDetail.setCustomerPhone(dto.getCustomerPhone());
				tranMoneyDetail.setTotalAmt(dto.getTotalAmt());
				tranMoneyDetail.setRealAmt(dto.getTotalAmt());
				tranMoneyDetail.setPostAmt(dto.getPostAmt());
				tranMoneyDetailsMapper.insert(tranMoneyDetail);
			 }

			 //款项报表入库
			for (Entry<String, TransactionMoney> entry : tranMoneyMap.entrySet()) {
				transactionMoneyMapper.insert(entry.getValue());
			}
		 }

	}

	@Override
	public ResponseBean<List<TranMoneyDetailsDTO>> getTranMoneyDetailList(TranMoneyDetailsDTO dto) {

		ResponseBean<List<TranMoneyDetailsDTO>> response = new ResponseBean<List<TranMoneyDetailsDTO>>();
		TranMoneyDetailsExample example = new TranMoneyDetailsExample();
		com.gy.kanke.store.domain.TranMoneyDetailsExample.Criteria criteria = example.createCriteria();

		if (dto.getAccoutNo() != null && !"".equals(dto.getAccoutNo().trim())) {
			criteria.andAccoutNoEqualTo(dto.getAccoutNo());
		}

		int count = tranMoneyDetailsMapper.countByExample(example);
		response.setTotalCount(count);
		PagerParam page = new PagerParam();
		page.setPage(dto.getPage());
		page.setPageSize(dto.getPageSize());
		example.setLimitEnd(page.getEnd());
		example.setLimitStart(page.getStart());

		List<TranMoneyDetails> selectByExample = tranMoneyDetailsMapper.selectByExample(example);
		List<TranMoneyDetailsDTO> tranDetails = new ArrayList<TranMoneyDetailsDTO>();

		for (TranMoneyDetails tran : selectByExample) {
			tranDetails.add(getTranDetailsDTO(tran));
		}

		response.setDatas(tranDetails);
		return response;
	}

	@Override
	public ResponseBean<List<TransactionMoneyDTO>> tranMoneyList(TransactionMoneyDTO tranDTO) {

		ResponseBean<List<TransactionMoneyDTO>> response = new ResponseBean<List<TransactionMoneyDTO>>();
		
		TransactionMoneyExample example = new TransactionMoneyExample();
		com.gy.kanke.store.domain.TransactionMoneyExample.Criteria criteria = example.createCriteria();
		if (tranDTO.getAccoutNo() != null && !"".equals(tranDTO.getAccoutNo().trim())) {
			criteria.andAccoutNoEqualTo(tranDTO.getAccoutNo());
		}

		if (tranDTO.getConfirmStatus() != null) {
			criteria.andConfirmStatusEqualTo(tranDTO.getConfirmStatus());
		}

		if (tranDTO.getSettleStatus() != null) {
			criteria.andSettleStatusEqualTo(tranDTO.getSettleStatus());
		}

		int count = transactionMoneyMapper.countByExample(example);
		response.setTotalCount(count);
		
		PagerParam page = new PagerParam();
		page.setTotalCount(count);
		page.setPageSize(tranDTO.getPageSize());
		page.setPage(tranDTO.getPage());
		example.setLimitEnd(page.getEnd());
		example.setLimitStart(page.getStart());

		List<TransactionMoney> selectByExample = transactionMoneyMapper.selectByExample(example);
		List<TransactionMoneyDTO> transactionMoneyList = new ArrayList<TransactionMoneyDTO>();

		for (TransactionMoney tran : selectByExample) {
			transactionMoneyList.add(getDtoBaen(tran));
		}
		response.setDatas(transactionMoneyList);
		
		return response;
	}

	@Override
	public void confirmSendGoodsState() {
		
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("nDateStr", DateUtil.getNDateBeforeStr(new Date(), 15));
		map.put("sendGoodsState", 3);
		orderManageMapper.updateConfirmSendGoodsState(map);
		
	}

}