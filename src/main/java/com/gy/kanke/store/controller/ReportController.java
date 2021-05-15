package com.gy.kanke.store.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gy.kanke.store.Util.ResponseUtil;
import com.gy.kanke.store.common.BaseAPIRequestparam;
import com.gy.kanke.store.common.ResponseBean;
import com.gy.kanke.store.common.ResponseEntity;
import com.gy.kanke.store.dto.TranMoneyDetailsDTO;
import com.gy.kanke.store.dto.TransactionMoneyDTO;
import com.gy.kanke.store.service.ReportService;

@Controller
@RequestMapping("/report")
public class ReportController {

	@Autowired
	private ReportService reportService;

	// 交易款项
	@RequestMapping(value = "/transactionMoney", method = RequestMethod.GET)
	public String transactionMoney(HttpServletRequest request, Model model) {
		return "report/transactionMoney";
	}

	// 交易款项
	@RequestMapping(value = "/transactionMoneyBy", method = { RequestMethod.POST })
	@ResponseBody
	public ResponseEntity transactionMoneyBy(HttpServletRequest request,
			TransactionMoneyDTO tranDTO) {
		ResponseEntity result = new ResponseEntity();
		try {
			// 选全部不限条件
			if (tranDTO.getConfirmStatus() != null && tranDTO.getConfirmStatus() == 4) {
				tranDTO.setConfirmStatus(null);
			}
			// 选全部不限条件
			if (tranDTO.getSettleStatus() != null && tranDTO.getSettleStatus() == 3) {
				tranDTO.setSettleStatus(null);
			}
			result = reportService.transactionMoneyBy(tranDTO);
			result.setStatus(0);
			result.setMessage("OK");
		} catch (Throwable e) {
			result.setStatus(1);
			result.setMessage(e.getMessage());
		}
		return result;
	}

	// 商家确认
	@RequestMapping(value = "/sellerConfirmTable", method = RequestMethod.GET)
	public String sellerConfirmTable(HttpServletRequest request, Model model) {

		String accountNo = request.getParameter("accoutNo");
		String id = request.getParameter("id");
		model.addAttribute("accoutNo", accountNo);
		model.addAttribute("accountId", id);
		return "report/sellerConfirmTable";
	}

	@RequestMapping(value = "/updateConfirm", method = { RequestMethod.POST })
	@ResponseBody
	public ResponseEntity updateConfirm(HttpServletRequest request, TransactionMoneyDTO dto) {

		ResponseEntity result = new ResponseEntity();
		try {
			reportService.updateConfirm(dto);
			result.setData(null);
			result.setStatus(0);
			result.setMessage("OK");
		} catch (Throwable e) {
			result.setStatus(1);
			result.setMessage(e.getMessage());
		}
		return result;

	}

	// 商品销售报表
	@RequestMapping(value = "/goodsSelesTable")
	// @RequestMapping(value = "/aaaaa", method = RequestMethod.GET)
	public String companyInfo(HttpServletRequest request, Model model) {

		return "report/goodsSelesTable";
	}

	// 交易统计明细
	@RequestMapping(value = "/toTransactioDnetails", method = RequestMethod.GET)
	public String toTransactioDnetails(HttpServletRequest request, Model model) {
		String accountNo = request.getParameter("accoutNo");
		String accountId = request.getParameter("id");
		model.addAttribute("accoutNo", accountNo);
		model.addAttribute("accountId", accountId);
		return "report/transactionDetails";
	}

	// 交易统计明细
	@RequestMapping(value = "/getTranMoney", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity getTranMoney(HttpServletRequest request, TranMoneyDetailsDTO dto) {
		ResponseEntity response = new ResponseEntity();
		try {
			TransactionMoneyDTO tranMoneyDTO = reportService.getTransactionMoneyById(dto.getId(), dto.getAccoutNo());
			response.setData(tranMoneyDTO);
			response.setStatus(0);
			response.setMessage("OK");
		} catch (Throwable e) {
			e.printStackTrace();
			response.setStatus(1);
			response.setMessage(e.getMessage());
		}
		return response;
	}

	// 交易统计列表
	@RequestMapping(value = "/tranMoneyDetailsBy", method = { RequestMethod.POST })
	@ResponseBody
	public ResponseEntity tranMoneyDetailsBy(HttpServletRequest request,
			TranMoneyDetailsDTO tranDto) {
		ResponseEntity result = new ResponseEntity();
		try {
			result = reportService.getTransactionMoneyDetails(tranDto);
			result.setStatus(0);
			result.setMessage("OK");
		} catch (Throwable e) {
			e.printStackTrace();
			result.setStatus(1);
			result.setMessage(e.getMessage());
		}
		return result;
	}

	// 交易款项报表明细
	@RequestMapping(value = "/tranMoneyDetailList", method = { RequestMethod.POST })
	@ResponseBody
	public BaseAPIRequestparam<ResponseBean<List<TranMoneyDetailsDTO>>> tranMoneyDetailList(HttpServletRequest request) {
		BaseAPIRequestparam<ResponseBean<List<TranMoneyDetailsDTO>>> responseBean = null;
		try {
			BaseAPIRequestparam<TranMoneyDetailsDTO> param = new BaseAPIRequestparam<TranMoneyDetailsDTO>(request,
					TranMoneyDetailsDTO.class);
			TranMoneyDetailsDTO dto = param.getData();
			if (dto.getAccoutNo() == null || "".equals(dto.getAccoutNo().trim())) {
				return ResponseUtil.getFailResponseBean("The accoutNo is empty.");
			}
			ResponseBean<List<TranMoneyDetailsDTO>> response = reportService.getTranMoneyDetailList(dto);
			responseBean = ResponseUtil.getSuccessResponseBean(response);
		} catch (Throwable e) {
			responseBean = ResponseUtil.getFailResponseBean(e.getMessage());
		}
		return responseBean;
	}
		
	// 交易款项报表财务审核(入参：单条ID,结算状态(1:未结算，2：已结算))
	@RequestMapping(value = "/checkTranMoney", method = { RequestMethod.POST })
	@ResponseBody
	public BaseAPIRequestparam<ResponseBean<TransactionMoneyDTO>> checkTranMoney(HttpServletRequest request) {
		BaseAPIRequestparam<ResponseBean<TransactionMoneyDTO>> responseBean = null;
		try {
			ResponseBean<TransactionMoneyDTO> response = new ResponseBean<TransactionMoneyDTO>();
			BaseAPIRequestparam<TransactionMoneyDTO> param = new BaseAPIRequestparam<TransactionMoneyDTO>(request,
					TransactionMoneyDTO.class);
			TransactionMoneyDTO dto = param.getData();
			if(dto.getId()==null || "".equals(dto.getId().trim())){
				return ResponseUtil.getFailResponseBean("The id is empty.");
			}
			
			reportService.updateConfirm(dto);
			responseBean = ResponseUtil.getSuccessResponseBean(response);
		} catch (Throwable e) {
			responseBean = ResponseUtil.getFailResponseBean(e.getMessage());
		}
		return responseBean;
	}

	// 交易款项
	@RequestMapping(value = "/tranMoneyList", method = { RequestMethod.POST })
	@ResponseBody
	public BaseAPIRequestparam<ResponseBean<List<TransactionMoneyDTO>>> tranMoneyList(HttpServletRequest request) {
		
		BaseAPIRequestparam<ResponseBean<List<TransactionMoneyDTO>>> responseBean = null;
		
		try {
			
			BaseAPIRequestparam<TransactionMoneyDTO> param = new BaseAPIRequestparam<TransactionMoneyDTO>(request,TransactionMoneyDTO.class);
			
			TransactionMoneyDTO tranDTO = param.getData();
			
			// 选全部不限条件
			if (tranDTO.getConfirmStatus() != null && tranDTO.getConfirmStatus() == 4) {
				tranDTO.setConfirmStatus(null);
			}
			// 选全部不限条件
			if (tranDTO.getSettleStatus() != null && tranDTO.getSettleStatus() == 3) {
				tranDTO.setSettleStatus(null);
			}
			ResponseBean<List<TransactionMoneyDTO>> responseDTO = reportService.tranMoneyList(tranDTO);
			
			responseBean = ResponseUtil.getSuccessResponseBean(responseDTO);
		} catch (Throwable e) {
			responseBean = ResponseUtil.getFailResponseBean(e.getMessage());
		}
		return responseBean;
	}

}