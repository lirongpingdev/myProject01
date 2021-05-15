package com.gy.kanke.store.service;

import java.util.List;

import com.gy.kanke.store.common.BaseAPIRequestparam;
import com.gy.kanke.store.common.ResponseEntity;
import com.gy.kanke.store.domain.MallPro;
import com.gy.kanke.store.dto.ApiProListDTO;
import com.gy.kanke.store.dto.DetailShowDTO;
import com.gy.kanke.store.dto.MallProDTO;
import com.gy.kanke.store.dto.commodityDetailDTO;
import com.gy.kanke.store.param.ApiProListParam;
import com.gy.kanke.store.param.MallProParam;
import com.gy.kanke.store.param.ProStandardParam;
import com.gy.kanke.store.param.ProStandardUpdParam;


public interface MallProService {
	List<MallProDTO> selList(MallProParam param);

	String updAuditState(String proId,Integer state);

	ResponseEntity operationState(String proId, Integer state,String account);

	ResponseEntity addCachePro(MallPro param);

	ResponseEntity isnertProStandard(ProStandardParam param);

	ResponseEntity updProStandard(ProStandardUpdParam param);

	DetailShowDTO detailEditShow(String proId);

	List<ApiProListDTO> apiProList(ApiProListParam param);

	DetailShowDTO commodityDetailShow(String proId);

	ResponseEntity proDel(String proId,String account);

	BaseAPIRequestparam kankeSelListApi(MallProParam param);

	commodityDetailDTO commodityDetail(String proId);

	BaseAPIRequestparam commodityAuditSucceedUpd(String proId, Integer state);

}
