package com.gy.kanke.store.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gy.kanke.store.Util.ResponseUtil;
import com.gy.kanke.store.common.BaseAPIRequestparam;
import com.gy.kanke.store.dto.ApiProListDTO;
import com.gy.kanke.store.dto.commodityDetailDTO;
import com.gy.kanke.store.param.ApiProListParam;
import com.gy.kanke.store.param.MallProParam;
import com.gy.kanke.store.service.MallProService;

/**
 * 商品(被调用接口)
 * 
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/mallProApi")
public class MallProApiController {
	@Autowired
	private MallProService mallProService;

	/**
	 * 商品列表接口(供运营管理调用) 该方法暂时不用
	 * 
	 * @param param
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/kankeSelListApi")
	@ResponseBody
	public BaseAPIRequestparam kankeSelListApi(HttpServletRequest request) {
		try {
			BaseAPIRequestparam<MallProParam> params = new BaseAPIRequestparam<MallProParam>(request, MallProParam.class);
			MallProParam param = params.getData();
			return mallProService.kankeSelListApi(param);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseUtil.getSuccessResponseBean("操作失败，请稍后再试");
		}

	}

	/**
	 * 商品审核接口(同步) 该接口被调用 需验证秘钥
	 * 
	 * @param param
	 * @param model
	 */
	@RequestMapping(value = "/updAuditState")
	@ResponseBody
	public String updAuditState(String proId, Integer state) {
		// 这里做秘钥验证
		return mallProService.updAuditState(proId, state);
	}

	/**
	 * 商品列表(对运营接口调用) 该接口被调用 需验证秘钥
	 * 
	 * @param param
	 * @param model
	 */
	@RequestMapping(value = "/apiProList")
	@ResponseBody
	public List<ApiProListDTO> apiProList(ApiProListParam param) {
		// 这里做秘钥验证
		return mallProService.apiProList(param);
	}

	/**
	 * 商品详情页面（被调：用于审核初始化）
	 * 
	 * @param param
	 *            商品id
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/commodityDetail")
	@ResponseBody
	public BaseAPIRequestparam commodityDetail(HttpServletRequest request) {

		try {
			
			BaseAPIRequestparam<Map<String, Object>> requestparam = new BaseAPIRequestparam<>(request, Map.class);
			Map<String, Object> map = requestparam.getData();
			String proId = map.get("proId").toString();
			commodityDetailDTO commodityDetailDTO = mallProService.commodityDetail(proId);
			
			return ResponseUtil.getSuccessResponseBean(commodityDetailDTO);
			
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseUtil.getFailResponseBean("操作失败，请稍后再试");
		}

	}
	
	/**
	 * 运营平台，审核之后要更新商家版商品状态
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/commodityASUpd")
	@ResponseBody
	public BaseAPIRequestparam commodityAuditSucceedUpd(HttpServletRequest request) {

		try {
			
			BaseAPIRequestparam<Map<String, Object>> requestparam=new BaseAPIRequestparam<Map<String, Object>>(request,Map.class);
			Map<String, Object> data=requestparam.getData();
			String proId=data.get("proId").toString();
			Integer state=Integer.parseInt(data.get("state").toString());
			
			//更新商品状态
			return mallProService.commodityAuditSucceedUpd(proId,state);
			
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseUtil.getFailResponseBean("操作失败，请稍后再试");
		}

	}
	
	
	
}
