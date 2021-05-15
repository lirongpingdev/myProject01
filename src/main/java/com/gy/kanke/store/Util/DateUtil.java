package com.gy.kanke.store.Util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

public class DateUtil {
	/**
	* 日期转换成字符串
	* @param date 
	* @return str
	*/
	public static String getDateStr(Date date) {
	  if(date==null){
		  return null;
	  }
	   SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	   String str = format.format(date);
	   return str;
	} 
	
	/**
	* 日期转换成字符串
	* @param date 
	* @return str
	*/
	public static String getDateStrYYYYMMDD(Date date) {
	  
	   SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	   String str = format.format(date);
	   return str;
	}
	
	/**
	 * 获取前时间开始N个月后的时间，返回String
	 * @param n
	 * @return
	 */
	public static String getNMonthDateStr(int n,Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, n);
		return sdf.format(calendar.getTime());
	}
	
	/**
	 * 获取前时间开始N个月后的时间,返回Date
	 * @param n
	 * @return
	 */
	public static Date getNMonthDate(int n,Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, n);
		System.out.println(calendar.getTime());
		return calendar.getTime();
	}
	
	/**
	 * 获取前时间开始N个月后的时间,返回Date
	 * @param n
	 * @return
	 */
	public static Date str2Date(String dateStr) {
		
		if(dateStr ==null || "".equals(dateStr.trim())){
			return null;
		}
		
	    Date date =null;
		try {
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			date = sdf.parse(dateStr);
			
		} catch (Exception e) {
			
		}  
	    
		return date;
	}
	 
	/**
	 * 获取前时间开始N个月后的时间,返回Date
	 * @param n
	 * @return
	 */
	public static Date str2DateYYYYMMDD(String dateStr) {
		
		if(dateStr ==null || "".equals(dateStr.trim())){
			return null;
		}
		
	    Date date =null;
		try {
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			date = sdf.parse(dateStr);
			
		} catch (Exception e) {
			
		}  
	    
		return date;
	}
	
	/**
     * 当月第一天
     * @return
     */
	public static String getFirstDay() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        Date theDate = calendar.getTime();
        
        GregorianCalendar gcLast = (GregorianCalendar) Calendar.getInstance();
        gcLast.setTime(theDate);
        gcLast.set(Calendar.DAY_OF_MONTH, 1);
        String day_first = df.format(gcLast.getTime());
        StringBuffer str = new StringBuffer().append(day_first).append(" 00:00:00");
        return str.toString();

    }
    
    /**
     * 当月最后一天
     * @return
     */
	public static String getLastDay() {
        
    	// 获取Calendar  
        Calendar calendar = Calendar.getInstance();  
        // 设置时间,当前时间不用设置  
        // calendar.setTime(new Date());  
        // 设置日期为本月最大日期  
        calendar.set(Calendar.DATE, calendar.getActualMaximum(Calendar.DATE));  
          
        // 打印  
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
        return df.format(calendar.getTime())+" 23:59:59";
        
    } 
	
	/**
     * 上个月第一天
     * @param date
     * @return
     */
	public static String getFirstDayOfMonth(Date date) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, -1);
        Date theDate = calendar.getTime();
        
        //上个月第一天
        GregorianCalendar gcLast = (GregorianCalendar) Calendar.getInstance();
        gcLast.setTime(theDate);
        gcLast.set(Calendar.DAY_OF_MONTH, 1);
        String day_first = df.format(gcLast.getTime());
        StringBuffer str = new StringBuffer().append(day_first).append(" 00:00:00");
        day_first = str.toString();

        return day_first;
        
    }
    
	/**
     * 上个月最后一天
     * @param date
     * @return
     */
	public static String getLastDayOfMonth(Date date) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, -1);
        //上个月最后一天
        calendar.add(Calendar.MONTH, 1);    //加一个月
        calendar.set(Calendar.DATE, 1);        //设置为该月第一天
        calendar.add(Calendar.DATE, -1);    //再减一天即为上个月最后一天
        String day_last = df.format(calendar.getTime());
        StringBuffer endStr = new StringBuffer().append(day_last).append(" 23:59:59");
        day_last = endStr.toString();

        return day_last;
    }
	
	/**
	 * 获取最近N月的时间
	 * @param monthCount
	 * @return
	 */
	public static Map<String,String> getDateRangeInMonth(int monthCount){
		Map<String,String> map = new HashMap<String,String>();
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MONTH, cal.get(Calendar.MONTH)-monthCount);
		map.put("beginDate", getDateStrYYYYMMDD(cal.getTime()));
		cal.set(Calendar.MONTH, cal.get(Calendar.MONTH)+monthCount);
		map.put("endDate", getDateStrYYYYMMDD(cal.getTime()));
		return map;
	}
	
	/**
	 * 得到几天前的时间
	 * 
	 * @param date
	 * @param nday
	 * @return
	 */
	public static String getNDateBeforeStr(Date date, int nday) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.DATE, calendar.get(Calendar.DATE) - nday);

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return format.format(calendar.getTime());
	}
	
}
