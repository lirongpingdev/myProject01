package com.gy.kanke.store.common;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import com.alibaba.fastjson.JSON;

public class CommonMethod {
	public static <T> T EntityConvert(Object obj, Class type) {
		String jsons = JSON.toJSONString(obj);
		return (T) JSON.parseObject(jsons, type);
	}
	
	public static List ListMapConvertEntityList(List<Map<String, Object>> list, Class type) {
		String jsons = JSON.toJSONString(list);
		return JSON.parseArray(jsons, type);
	}
	
	public static Date getStartDateByMonth(int year, int month) {
		String dstr = getDateStrByFormat(year, month, 1) + " 00:00:00";
		Date dd = DateUtils.getFormatDateStr(dstr, "yyyy-MM-dd HH:mm:ss");
		return dd;
	}
	
	public static Date getEndDateByMonth(int year, int month) {
		month += 1;
		if(month == 13) {
			year += 1;
			month = 1;
		}
		String dstr = getDateStrByFormat(year, month, 1) + " 23:59:59";
		Date dd = DateUtils.getFormatDateStr(dstr, "yyyy-MM-dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(dd.getTime());
		cal.add(Calendar.DAY_OF_MONTH, -1);
		return cal.getTime();
	}
	
	public static String getDateStrByFormat(int year, int month, int day) {
		String result = year + "-";
		if(month < 10) {
			result += "0" + month;
		} else {
			result += month;
		}
		result += "-";
		if(day < 10) {
			result += "0" + day;
		} else {
			result += day;
		}
		return result;
	}
	
	public static List ListToList(List list, Class type) {
		String jsons = JSON.toJSONString(list);
		return JSON.parseArray(jsons, type);
	}
	
	public static String getCookieValue(HttpServletRequest request, String key) {
		if(request.getCookies() == null) {
			return null;
		}
		for(Cookie cc : request.getCookies()) {
			if(cc.getName().toLowerCase().equals(key)) {
				return cc.getValue();
			}
		}
		return "";
	}
}