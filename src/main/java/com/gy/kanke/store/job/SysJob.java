package com.gy.kanke.store.job;

import org.springframework.beans.factory.annotation.Autowired;

import com.gy.kanke.store.service.ReportService;

public class SysJob {

	@Autowired
	private ReportService reportService;
	
	/**
	 * 生成交易款项报表
	 */
	public void createTranMoney() {
		
		reportService.createTranMoney();
	}
	
	/**
	 * 定时执行发货15天以后的订单刷成收货状态(3 已确认收货)
	 */
	public void confirmSendGoodsState() {
		
		reportService.confirmSendGoodsState();
	}
}
