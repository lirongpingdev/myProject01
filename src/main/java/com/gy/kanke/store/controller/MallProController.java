package com.gy.kanke.store.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.RequestResponseBodyMethodProcessor;

import com.alibaba.fastjson.JSON;
import com.gy.kanke.store.Util.ResponseUtil;
import com.gy.kanke.store.common.BaseAPIRequestparam;
import com.gy.kanke.store.common.ResponseEntity;
import com.gy.kanke.store.domain.MallPro;
import com.gy.kanke.store.dto.ApiProListDTO;
import com.gy.kanke.store.dto.DetailShowDTO;
import com.gy.kanke.store.dto.MallProDTO;
import com.gy.kanke.store.param.ApiProListParam;
import com.gy.kanke.store.param.MallProParam;
import com.gy.kanke.store.param.ProStandardParam;
import com.gy.kanke.store.param.ProStandardUpdParam;
import com.gy.kanke.store.param.SelListApiDTO;
import com.gy.kanke.store.service.MallProService;
import com.gy.portal.bizDomain.UserInfo;
import com.mysql.jdbc.ResultSetInternalMethods;

/**
 * 商品
 * 
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/mallPro")
public class MallProController {
	@Autowired
	private MallProService mallProService;

	/**
	 * 商品列表
	 * @param param
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/selList")
	public String selList(MallProParam param, Model model) {

		List<MallProDTO> dtos = mallProService.selList(param);
		model.addAttribute("dtos", dtos);
		
		if(param.getState()==null||param.getState()<0){
			param.setState(0);
		}
		
		model.addAttribute("paramData", param);

		return "commodity/commodityInfor";

	}
	/**
	 * 商品列表接口(供运营管理调用)
	 * 该方法暂时不用
	 * @param param
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/kankeSelListApi")
	@ResponseBody
	public BaseAPIRequestparam kankeSelListApi(HttpServletRequest request) {
		try {
			BaseAPIRequestparam<MallProParam> params=new BaseAPIRequestparam<MallProParam>(request,MallProParam.class);
			MallProParam param=params.getData();
			return  mallProService.kankeSelListApi(param);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseUtil.getSuccessResponseBean("操作失败，请稍后再试");
		}
		
	}
	/**
	 * 上架、下架、取消(审核中)
	 * @param param
	 * @param model
	 */
	@RequestMapping(value = "/operationState")
	@ResponseBody
	public ResponseEntity operationState(String proId,Integer state,HttpServletRequest request) {
		UserInfo info=	com.gy.portal.common.UserHelper.getLoginUserInfo(request);
		return mallProService.operationState(proId,state,info.getAccount());
	}
	/**
	 * 商品软删除
	 * @param param
	 * @param model
	 */
	@RequestMapping(value = "/proDel")
	@ResponseBody
	public ResponseEntity proDel(String proId,HttpServletRequest request) {
		UserInfo info=	com.gy.portal.common.UserHelper.getLoginUserInfo(request);
		return mallProService.proDel(proId,info.getAccount());
	}
	/**
	 * 商品审核接口(同步)
	 * 该接口被调用
	 * 需验证秘钥
	 * @param param
	 * @param model
	 */
	@RequestMapping(value = "/updAuditState")
	@ResponseBody
	public String updAuditState(String proId,Integer state) {
		//这里做秘钥验证
		return mallProService.updAuditState(proId,state);
	}
	
	/**
	 * 商品列表(对运营接口调用)
	 * 该接口被调用
	 * 需验证秘钥
	 * @param param
	 * @param model
	 */
	@RequestMapping(value = "/apiProList")
	@ResponseBody
	public List<ApiProListDTO> apiProList(ApiProListParam param) {
		//这里做秘钥验证
		return mallProService.apiProList(param);
	}
	
	/**
	 * 添加商品到缓存中
	 * @param param
	 * @param model
	 */
	@RequestMapping(value = "/addCachePro")
	@ResponseBody
	public ResponseEntity addCachePro(MallPro param) {
		//这里做秘钥验证
		return mallProService.addCachePro(param);
	}
	
	/**
	 * 保存商品和规格价格等
	 * @param param
	 * @param model
	 */
	@RequestMapping(value = "/isnertProStandard")
	@ResponseBody
	public ResponseEntity isnertProStandard(ProStandardParam param,HttpServletRequest request) {
		UserInfo info=	com.gy.portal.common.UserHelper.getLoginUserInfo(request);
		param.setInfo(info);
		return mallProService.isnertProStandard(param);
	}

	/**
	 * 商品修改
	 * @param param
	 * @param model
	 */
	@RequestMapping(value = "/updProStandard")
	@ResponseBody
	public ResponseEntity updProStandard(ProStandardUpdParam param) {
		return mallProService.updProStandard(param);
	}
	
	/**
	 * 商品编辑数据展示
	 * 
	 * @param param 商品id
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/detailEditShow")
	public String detailEditShow(String proId, Model model) {
		DetailShowDTO detailShowDTO=mallProService.detailEditShow(proId);
		model.addAttribute("data", detailShowDTO);
		return "commodity/commodityDetail";

	}
	
	/**
	 * 商品详情页面
	 * 
	 * @param param 商品id
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/commodityDetailShow")
	public String commodityDetailShow(String proId, Model model) {
		DetailShowDTO detailShowDTO=mallProService.commodityDetailShow(proId);
		model.addAttribute("data", detailShowDTO);
		return "commodity/commodityDetailShow";

	}
}
