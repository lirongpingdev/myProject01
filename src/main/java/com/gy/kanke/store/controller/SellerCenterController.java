package com.gy.kanke.store.controller;

import java.util.Date;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gy.kanke.store.Util.DateUtil;
import com.gy.kanke.store.Util.ResponseUtil;
import com.gy.kanke.store.common.BaseAPIRequestparam;
import com.gy.kanke.store.common.ResponseBean;
import com.gy.kanke.store.common.ResponseEntity;
import com.gy.kanke.store.domain.SellerInfo;
import com.gy.kanke.store.domain.ShopInfo;
import com.gy.kanke.store.dto.ShopInfoDTO;
import com.gy.kanke.store.service.SellerService;
import com.gy.kanke.store.service.ShopInfoService;
import com.gy.portal.bizDomain.UserInfo;

@Controller
@RequestMapping("/sellerCenter")
public class SellerCenterController {	
	
	@Autowired
	private SellerService sellerService;
	
	@Autowired
	private ShopInfoService shopInfoService;
	
	@RequestMapping(value = "/shopInfo")
	//@RequestMapping(value = "/shopInfo", method = RequestMethod.GET)
    public String getSellerInfo(HttpServletRequest request,Model model) {
		
		return "sellerCenter/shopInfo";
    }
	
	@RequestMapping(value = "/loadShopInfo")
	@ResponseBody
    public ResponseEntity loadShopInfo(HttpServletRequest request,Model model) {
		
		ResponseEntity response = new ResponseEntity();
		try {
			String id = request.getParameter("id");
			
			UserInfo user = com.gy.portal.common.UserHelper.getLoginUserInfo(request);
			
			ShopInfo shop = new ShopInfo();
			shop.setAccount(user.getAccount());
			if (id != null && !"".equals(id.trim())) {
				shop.setId(id);
			}
			ShopInfo shopInfo = shopInfoService.getShopInfo(shop);
			
			response.setData(shopInfo);
			response.setMessage("OK");
			response.setStatus(0);

		} catch (Throwable e) {
			response.setMessage(e.getMessage());
			response.setStatus(1);
		}
		return response;
    }
	
	/**
	 * 店铺明细
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/getShopInfo")
	@ResponseBody
	public BaseAPIRequestparam<ResponseBean<ShopInfoDTO>> getShopInfo(HttpServletRequest request) {

		BaseAPIRequestparam<ResponseBean<ShopInfoDTO>> responseBean = null;
		try {

			BaseAPIRequestparam<ShopInfoDTO> param = new BaseAPIRequestparam<ShopInfoDTO>(request, ShopInfoDTO.class);
			ShopInfoDTO dto = param.getData();

			ShopInfo shop = new ShopInfo();
			shop.setAccount(dto.getAccount());
			if (dto.getId() != null && !"".equals(dto.getId().trim())) {
				shop.setId(dto.getId());
			}
			ShopInfo shopInfo = shopInfoService.getShopInfo(shop);

			ShopInfoDTO returnDTO = new ShopInfoDTO();

			BeanUtils.copyProperties(shopInfo, returnDTO);

			returnDTO.setCreateTimeStr(DateUtil.getDateStr(shopInfo.getCreateTime()));
			ResponseBean<ShopInfoDTO> response = new ResponseBean<ShopInfoDTO>();
			response.setDatas(returnDTO);
			responseBean = ResponseUtil.getSuccessResponseBean(response);

		} catch (Throwable e) {
			responseBean = ResponseUtil.getFailResponseBean(e.getMessage());
		}
		return responseBean;
	}
	
	@RequestMapping(value = "/addShopInfo", method = { RequestMethod.POST })
	@ResponseBody
	public ResponseEntity addShopInfo(HttpServletRequest request, Model model, ShopInfo shopInfo) {

		ResponseEntity response = new ResponseEntity();
		try {
			UserInfo user = com.gy.portal.common.UserHelper.getLoginUserInfo(request);
			shopInfo.setAccount(user.getAccount());
			
			ShopInfo shop = shopInfoService.getShopInfo(shopInfo);
			
			if (shop != null) {
				shopInfo.setId(shop.getId());
				
				shopInfoService.updateShopInfo(shopInfo);
				response.setData(shopInfo);
				return response;
			}

			String uuid = UUID.randomUUID().toString();
			shopInfo.setId(uuid);
			shopInfo.setCreateTime(new Date());
			
			shopInfoService.addShopInfo(shopInfo);

			response.setData(shopInfo);
			response.setMessage("OK");
			response.setStatus(0);

		} catch (Throwable e) {
			response.setMessage(e.getMessage());
			response.setStatus(1);
		}

		return response;

	}
	
	@RequestMapping(value = "/shopInfoEdit")
	//@RequestMapping(value = "/shopInfoEdit", method = RequestMethod.GET)
    public String shopInfoEdit(HttpServletRequest request,Model model) {
		
		return "sellerCenter/shopInfoEdit";
    }
	
	@RequestMapping(value = "/companyInfo")
    public String companyInfo(HttpServletRequest request,Model model) {
		
		return "sellerCenter/companyInfo";
    }
	
	@RequestMapping(value = "/loadCompanyInfo")
	@ResponseBody
    public ResponseEntity loadCompanyInfo(HttpServletRequest request,Model model) {
		
		ResponseEntity response = new ResponseEntity();
		try {
			String id = request.getParameter("id");
			UserInfo user = com.gy.portal.common.UserHelper.getLoginUserInfo(request);

			SellerInfo seller = new SellerInfo();
			seller.setAccount(user.getAccount());
			if (id != null && !"".equals(id.trim())) {
				seller.setId(id);
			}
			SellerInfo sellerInfo = sellerService.getSellerInfo(seller);

			if(sellerInfo.getBeginTime()!=null){
				sellerInfo.setBeginTimeStr(DateUtil.getDateStrYYYYMMDD(sellerInfo.getBeginTime()));
			}
			
			if(sellerInfo.getEndTime()!=null){
				sellerInfo.setEndTimeStr(DateUtil.getDateStrYYYYMMDD(sellerInfo.getBeginTime()));
			}
			
			response.setData(sellerInfo);
			response.setMessage("OK");
			response.setStatus(0);

		} catch (Throwable e) {
			response.setMessage(e.getMessage());
			response.setStatus(1);
		}

		return response;
		
    }
	
	@RequestMapping(value = "/addSellerInfo", method = RequestMethod.POST)
	public String addSellerInfo(HttpServletRequest request, Model model) {

		return "sellerCenter/companyInfo";
	}
}