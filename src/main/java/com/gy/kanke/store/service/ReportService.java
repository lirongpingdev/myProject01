package com.gy.kanke.store.service;

import java.util.List;

import com.gy.kanke.store.common.ResponseBean;
import com.gy.kanke.store.common.ResponseEntity;
import com.gy.kanke.store.dto.TranMoneyDetailsDTO;
import com.gy.kanke.store.dto.TransactionMoneyDTO;

public interface ReportService {
	
	//交易款项列表
	ResponseEntity transactionMoneyBy(TransactionMoneyDTO tranDTO);
	
	//交易款项列表
	ResponseBean<List<TransactionMoneyDTO>> tranMoneyList(TransactionMoneyDTO tranDTO);
	
	void createTranMoney();
	
	void confirmSendGoodsState();
	
	//交易款项明细
	ResponseEntity getTransactionMoneyDetails(TranMoneyDetailsDTO tranDTO);
	
	ResponseBean<List<TranMoneyDetailsDTO>> getTranMoneyDetailList(TranMoneyDetailsDTO tranDTO);
	
	//交易款项
	TransactionMoneyDTO getTransactionMoneyById(String id, String accountNo);

	//商家确认
	void updateConfirm(TransactionMoneyDTO tranDTO);
}
