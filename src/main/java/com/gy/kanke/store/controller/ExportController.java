package com.gy.kanke.store.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/donwload")
public class ExportController {

	private Logger logger = org.slf4j.LoggerFactory.getLogger(ExportController.class);

	@RequestMapping("/orderInfo")
	public void orderInfo(HttpServletResponse response, String txtContent, String txtName) throws Exception {
		String content = txtContent;
		content = content.replace("<th>操作</th>", "");
		content = content.replace("查看详请", "");
		content = content.replace("立即发货", "");
		
		String fileName = txtName;
		InputStream is = new ByteArrayInputStream(content.getBytes());
		response.reset();
		response.setContentType("application/vnd.ms-excel;charset=utf-8");
		response.setHeader("Content-Disposition", "attachment;filename="
				+ new String((fileName + ".xls").getBytes(), "iso-8859-1"));
		ServletOutputStream out = response.getOutputStream();
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		try {
			bis = new BufferedInputStream(is);
			bos = new BufferedOutputStream(out);
			byte[] buff = new byte[2048];
			int bytesRead;
			while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
				bos.write(buff, 0, bytesRead);
			}
		} catch (Exception e) {
			logger.error("Export order info error,msg="+e.getMessage(),e);
		} finally {
			if (bis != null) {
				bis.close();
			}
			if (bos != null) {
				bos.close();
			}
		}
	}
	
	@RequestMapping("/tranMoney")
	public void tranMoney(HttpServletResponse response, String txtContent, String txtName) throws Exception {
		String content = txtContent;
		String fileName = txtName;
		
		content = content.replace("<th>操作</th>", "");
		content = content.replace("立即确认", "");
		content = content.replace("查看明细", "");
		
		InputStream is = new ByteArrayInputStream(content.getBytes());
		response.reset();
		response.setContentType("application/vnd.ms-excel;charset=utf-8");
		response.setHeader("Content-Disposition", "attachment;filename="
				+ new String((fileName + ".xls").getBytes(), "iso-8859-1"));
		ServletOutputStream out = response.getOutputStream();
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		try {
			bis = new BufferedInputStream(is);
			bos = new BufferedOutputStream(out);
			byte[] buff = new byte[2048];
			int bytesRead;
			while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
				bos.write(buff, 0, bytesRead);
			}
		} catch (Exception e) {
			logger.error("Export order info error,msg="+e.getMessage(),e);
		} finally {
			if (bis != null) {
				bis.close();
			}
			if (bos != null) {
				bos.close();
			}
		}
	}
	
}