package com.gy.kanke.store.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gy.kanke.store.cache.CachePropertyData;

@Controller
@RequestMapping("/CacheManage")
public class CacheManageController {
	@RequestMapping("/Reload")
	@ResponseBody
	public String Reload(String cacheName) {		
		switch(cacheName) {
			case "CachePropertyData" : new CachePropertyData().LoadCache(); break;
		}
		return "ok";
	}
}