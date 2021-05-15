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

import com.gy.kanke.store.common.ResponseEntity;
import com.gy.kanke.store.domain.OrderExpress;
import com.gy.kanke.store.dto.OrderExpressDTO;
import com.gy.kanke.store.service.IOrderExpressService;
import com.gy.portal.bizDomain.UserInfo;

@Controller
@RequestMapping("/express")
public class OrderExpressController {

	@Autowired
	private IOrderExpressService orderExpressService;
	
	@RequestMapping(value = "/addExpressInfo", method = { RequestMethod.POST })
	@ResponseBody
	public ResponseEntity addExpressInfo(HttpServletRequest request, Model model, OrderExpressDTO dto) {

		ResponseEntity response = new ResponseEntity();
		try {
			UserInfo user = com.gy.portal.common.UserHelper.getLoginUserInfo(request);
			
			OrderExpress orderExpress= new OrderExpress();
			
			BeanUtils.copyProperties(dto, orderExpress);
			
			orderExpress.setCreator(user.getAccount());
			orderExpress.setCreateTime(new Date());
			orderExpress.setRecordTime(new Date());
			orderExpress.setId(UUID.randomUUID().toString());

			orderExpressService.addOrderExpressInfo(orderExpress);
			
			response.setData(null);
			response.setMessage("OK");
			response.setStatus(0);

		} catch (Throwable e) {
			response.setMessage(e.getMessage());
			response.setStatus(1);
		}

		return response;

	}

}