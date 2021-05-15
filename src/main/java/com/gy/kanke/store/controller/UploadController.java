package com.gy.kanke.store.controller;


import javax.resource.spi.RetryableUnavailableException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.gy.kanke.store.Util.SFTPUtils;
import com.jcraft.jsch.ChannelSftp;

/**
 * 商品管理
 * 
 * @author cgn
 *
 */
@Controller
@RequestMapping(value = "/uploadFile")
public class UploadController {
	private Logger log = LoggerFactory.getLogger(UploadController.class);

	/**
	 * 富文本文件上传
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/upload")
	@ResponseBody
	public fileEntity upload(HttpServletRequest request, HttpServletResponse resp) {
		try {
			MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
			
			// 获得上传的文件
			MultipartFile mFile = multipartRequest.getFile("Filedata");
			log.info("upload file fileName::{}", null != mFile ? mFile.getOriginalFilename():"");
			ChannelSftp sftp = SFTPUtils.getInstance();
			String filePath = SFTPUtils.upload(mFile.getInputStream(), sftp, mFile.getOriginalFilename());
			fileEntity entity=new fileEntity();
			entity.setState("SUCCESS");
			entity.setUrl("http://120.77.40.10/ad/pro_files/"+filePath);
			//return "{\"state\":\"SUCCESS\",\"url\":\"http://120.77.40.10/ad/pro_files/"+filePath+"\"}";
			return entity;
		} catch (Exception e) {
			log.error("upload file error :{}",e.getLocalizedMessage());
			log.error("upload file error !!",e);
		}
		fileEntity entity=new fileEntity();
		entity.setState("error");
		entity.setUrl("");
		//return "{\"state\":\"error\",\"url\":\"\"}";
		return entity;
	}
class fileEntity{
	private String state;
	private String url;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
}
}