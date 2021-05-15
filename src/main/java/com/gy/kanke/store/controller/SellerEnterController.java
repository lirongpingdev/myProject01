package com.gy.kanke.store.controller;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gy.kanke.store.Util.CheckParameterUtil;
import com.gy.kanke.store.Util.DateUtil;
import com.gy.kanke.store.Util.ResponseUtil;
import com.gy.kanke.store.common.BaseAPIRequestparam;
import com.gy.kanke.store.common.ResponseBean;
import com.gy.kanke.store.common.ResponseEntity;
import com.gy.kanke.store.constant.SysConstant;
import com.gy.kanke.store.domain.SellerInfo;
import com.gy.kanke.store.dto.SellerInfoDTO;
import com.gy.kanke.store.service.SellerService;
import com.gy.portal.bizDomain.UserInfo;

@Controller
@RequestMapping("/seller")
public class SellerEnterController {

	private Logger logger = org.slf4j.LoggerFactory.getLogger(SellerEnterController.class);
	
	@Autowired
	private SellerService sellerService;

	@RequestMapping(value = "/baseInfo", method = RequestMethod.GET)
	// @ResponseBody
	public String baseInfo(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		model.addAttribute("UUDI", id);
		UserInfo user = com.gy.portal.common.UserHelper.getLoginUserInfo(request);

		model.addAttribute("account", user.getAccount());

		return "enter/enterBaseInfo";
	}

	@RequestMapping(value = "/loadBaseInfo", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity loadBaseInfo(HttpServletRequest request, Model model) {

		ResponseEntity response = new ResponseEntity();
		try {
			if(!CheckParameterUtil.checkUserLogin(request)){
				response.setMessage("The user is not login.");
				response.setStatus(SysConstant.error_1);
				logger.error("The user is not login.");
				return response;
			}
			
			UserInfo user = com.gy.portal.common.UserHelper.getLoginUserInfo(request);
			
			SellerInfo seller = new SellerInfo();
			seller.setAccount(user.getAccount());
			
			String id = request.getParameter("id");
			if (id != null && !"".equals(id.trim())) {
				seller.setId(id);
			}
			SellerInfo sellerInfo = sellerService.getSellerInfo(seller);
			response.setData(sellerInfo);
			response.setMessage("OK");
			response.setStatus(0);

		} catch (Throwable e) {
			logger.error("Load base Info error.",e);
			response.setMessage(e.getMessage());
			response.setStatus(SysConstant.error_9999);
		}

		return response;
	}

	/**
	 * 商家明细
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/getSellerDetail",  method = { RequestMethod.POST })
	@ResponseBody
	public BaseAPIRequestparam<ResponseBean<SellerInfoDTO>> getSellerDetail(HttpServletRequest request) {

		BaseAPIRequestparam<ResponseBean<SellerInfoDTO>> successResponseBean = null;
		SellerInfoDTO dto = null;
		try {
			ResponseBean<SellerInfoDTO> response = new ResponseBean<SellerInfoDTO>();
			
			BaseAPIRequestparam<SellerInfoDTO> param = new BaseAPIRequestparam<SellerInfoDTO>(request,
					SellerInfoDTO.class);
			dto = param.getData();
			
			SellerInfo seller = new SellerInfo();
			seller.setAccount(dto.getAccount());
			
			if (dto.getId() != null && !"".equals(dto.getId().trim())) {
				seller.setId(dto.getId());
			}
			SellerInfo sellerInfo = sellerService.getSellerInfo(seller);
			
			SellerInfoDTO resultDTO = new SellerInfoDTO();
			BeanUtils.copyProperties(sellerInfo, resultDTO);
			
			if (sellerInfo.getBeginTime() != null) {
				resultDTO.setBeginTimeStr(DateUtil.getDateStrYYYYMMDD(sellerInfo.getBeginTime()));
			}

			if (sellerInfo.getEndTime() != null) {
				resultDTO.setEndTimeStr(DateUtil.getDateStrYYYYMMDD(sellerInfo.getBeginTime()));
			}
			
			response.setDatas(resultDTO);
			successResponseBean = ResponseUtil.getSuccessResponseBean(response);
			
		} catch (Throwable e) {
			logger.error("Get seller detail error.account="+dto.getAccount(),e);
			successResponseBean = ResponseUtil.getFailResponseBean(e.getMessage());
		}

		return successResponseBean;
	}
	
	@RequestMapping(value = "/bankInfo")
	public String bankInfo(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		String account = request.getParameter("account");
		model.addAttribute("UUID", id);
		model.addAttribute("account", account);
		return "enter/enterBankInfo";
	}

	@RequestMapping(value = "/loadBanknfo", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity loadBanknfo(HttpServletRequest request, Model model) {

		ResponseEntity response = new ResponseEntity();
		try {
			
			if(!CheckParameterUtil.checkUserLogin(request)){
				response.setMessage("The user is not login.");
				response.setStatus(SysConstant.error_1);
				logger.error("The user is not login.");
				return response;
			}
			
			UserInfo user = com.gy.portal.common.UserHelper.getLoginUserInfo(request);
			SellerInfo seller = new SellerInfo();
			seller.setAccount(user.getAccount());
			SellerInfo sellerInfo = sellerService.getSellerInfo(seller);

			if (sellerInfo.getBeginTime() != null) {
				sellerInfo.setBeginTimeStr(DateUtil.getDateStrYYYYMMDD(sellerInfo.getBeginTime()));
			}

			if (sellerInfo.getEndTime() != null) {
				sellerInfo.setEndTimeStr(DateUtil.getDateStrYYYYMMDD(sellerInfo.getBeginTime()));
			}
			
			response.setData(sellerInfo);
			response.setMessage("OK");
			response.setStatus(0);

		} catch (Throwable e) {
			logger.error("Load bank info error.",e);
			response.setMessage(e.getMessage());
			response.setStatus(SysConstant.error_9999);
		}

		return response;
	}

	@RequestMapping(value = "/waitingCheck")
	public String waitingInfo(HttpServletRequest request, Model model) {
		return "enter/waitingCheck";
	}

	@RequestMapping(value = "/addBaseInfo", method = { RequestMethod.POST })
	@ResponseBody
	public ResponseEntity addBaseInfo(HttpServletRequest request, Model model, SellerInfoDTO dto) {

		ResponseEntity response = new ResponseEntity();
		try {
			
			if(!CheckParameterUtil.checkUserLogin(request)){
				response.setMessage("The user is not login.");
				response.setStatus(SysConstant.error_1);
				logger.error("The user is not login.");
				return response;
			}
			
			UserInfo user = com.gy.portal.common.UserHelper.getLoginUserInfo(request);

			SellerInfo sellerInfo = new SellerInfo();

			BeanUtils.copyProperties(dto, sellerInfo);

			sellerInfo.setAccount(user.getAccount());

			if (sellerInfo.getBeginTimeStr() != null && !"".equals(sellerInfo.getBeginTimeStr().trim())) {
				sellerInfo.setBeginTime(DateUtil.str2DateYYYYMMDD(sellerInfo.getBeginTimeStr()));
			}

			if (sellerInfo.getEndTimeStr() != null && !"".equals(sellerInfo.getBeginTimeStr().trim())) {
				sellerInfo.setEndTime(DateUtil.str2DateYYYYMMDD(sellerInfo.getBeginTimeStr()));
			}

			SellerInfo seller = sellerService.getSellerInfo(sellerInfo);
			if (seller != null) {
				sellerInfo.setId(seller.getId());
				sellerInfo.setLastUpdateBy(user.getAccount());
				sellerInfo.setLastUpdateTime(new Date());
				sellerService.updateSellerInfo(sellerInfo);
				response.setData(sellerInfo);
				return response;
			}

			String uuid = UUID.randomUUID().toString();
			sellerInfo.setId(uuid);
			sellerInfo.setCreateTime(new Date());
			model.addAttribute("UUID", uuid);
			sellerService.addSellerInfo(sellerInfo);

			response.setData(sellerInfo);
			response.setMessage("OK");
			response.setStatus(SysConstant.SUCCESS);

		} catch (Throwable e) {
			logger.error("Add base Info error.",e);
			response.setMessage(e.getMessage());
			response.setStatus(SysConstant.error_9999);
		}
		return response;
	}

	@RequestMapping(value = "/addBankInfo", method = { RequestMethod.POST })
	@ResponseBody
	public ResponseEntity addBankInfo(HttpServletRequest request, Model model, SellerInfo dto) {

		ResponseEntity response = new ResponseEntity();
		try {

			if(!CheckParameterUtil.checkUserLogin(request)){
				response.setMessage("The user is not login.");
				response.setStatus(SysConstant.error_1);
				logger.error("The user is not login.");
				return response;
			}
			
			UserInfo user = com.gy.portal.common.UserHelper.getLoginUserInfo(request);

			SellerInfo sellerInfo = new SellerInfo();
			BeanUtils.copyProperties(dto, sellerInfo);

			sellerInfo.setCreator(user.getAccount());
			// 结算周期
			sellerInfo.setBillingCycle(SysConstant.BILLING_CYCLE);
			// 结算类型(1:按天，2:按月)
			sellerInfo.setBillingType(2);
			sellerInfo.setStatus(SysConstant.STATUS_1);
			sellerInfo.setLastUpdateBy(user.getAccount());
			sellerInfo.setLastUpdateTime(new Date());
			sellerService.updateSellerInfo(sellerInfo);

			response.setData(sellerInfo);
			response.setMessage(SysConstant.MESSAGE);
			response.setStatus(SysConstant.SUCCESS);

		} catch (Throwable e) {
			logger.error("Add bank Info error.",e);
			response.setMessage(e.getMessage());
			response.setStatus(SysConstant.error_9999);
		}

		return response;
	}
	
	/**
	 * 商家审核
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/checkSeller", method = { RequestMethod.POST })
	@ResponseBody
	public BaseAPIRequestparam<Integer> checkSeller(HttpServletRequest request) {
		BaseAPIRequestparam<Integer> successResponseBean = null;
		SellerInfoDTO dto = null;
		try {
			BaseAPIRequestparam<SellerInfoDTO> param = new BaseAPIRequestparam<SellerInfoDTO>(request,
					SellerInfoDTO.class);
			dto = param.getData();
			sellerService.updateSellerStatus(dto);
			successResponseBean = ResponseUtil.getSuccessResponseBean(null);
		} catch (Throwable e) {
			logger.error("Check seller Info error.account"+dto.getAccount(),e);
			successResponseBean = ResponseUtil.getFailResponseBean(e.getMessage());
		}
		return successResponseBean;
	}

	/**
	 * 商家列表
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/getSellerList", method = { RequestMethod.POST })
	@ResponseBody
	public BaseAPIRequestparam<ResponseBean<List<SellerInfoDTO>>> getSellerList(HttpServletRequest request) {
		BaseAPIRequestparam<ResponseBean<List<SellerInfoDTO>>> successResponseBean = null;
		SellerInfoDTO dto = null;
		try {
			BaseAPIRequestparam<SellerInfoDTO> param = new BaseAPIRequestparam<SellerInfoDTO>(request,
					SellerInfoDTO.class);
			dto = param.getData();
			ResponseBean<List<SellerInfoDTO>> responseBean = sellerService.getSellerList(dto);
			successResponseBean = ResponseUtil.getSuccessResponseBean(responseBean);
		} catch (Throwable e) {
			logger.error("Get seller list error.account"+dto.getAccount(),e);
			successResponseBean = ResponseUtil.getFailResponseBean(e.getMessage());
		}
		return successResponseBean;
	}
	
}