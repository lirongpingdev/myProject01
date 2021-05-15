package com.gy.kanke.store.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {
	public static final String OPTYPE = "WINDOW";

	/**
	 * 获取现在时间
	 * 
	 * @return 返回时间类型 yyyy-MM-dd HH:mm:ss
	 */
	public static Date getNowDate() throws ParseException {
		Date currentTime = new Date(System.currentTimeMillis());
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateString = formatter.format(currentTime);
		Date date = formatter.parse(dateString);
		return date;
	}

	/**
	 * 
	 * @return yyyy-MM-dd 获取现在时间
	 * @return返回短时间格式 yyyy-MM-dd
	 */
	public static Date getNowDateShort() {
		Date currentTime = new Date(System.currentTimeMillis());
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String dateString = formatter.format(currentTime);
		Date currentTime_2 = null;
		try {
			currentTime_2 = formatter.parse(dateString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return currentTime_2;
	}

	/**
	 * 获取现在时间
	 * 
	 * @return返回字符串格式 yyyy-MM-dd HH:mm:ss
	 */
	public static String getStringDate() {
		Date currentTime = new Date(System.currentTimeMillis());
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateString = formatter.format(currentTime);
		return dateString;
	}

	public static String getStringDate(Date date) {
		Date currentTime = date;
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateString = formatter.format(currentTime);
		return dateString;
	}

	/**
	 * 获取现在时间
	 * 
	 * @return 返回短时间字符串格式yyyy-MM-dd
	 */
	public static String getStringDateShort() {
		Date currentTime = new Date(System.currentTimeMillis());
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String dateString = formatter.format(currentTime);
		return dateString;
	}

	/**
	 * 获取当前月份
	 * 
	 * @return 返回短时间字符串格式yyyy-MM
	 */
	public static String getStringNowMonth() {
		Date currentTime = new Date(System.currentTimeMillis());
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM");
		String dateString = formatter.format(currentTime);
		return dateString;
	}

	/**
	 * 获取当前月的上月
	 * 
	 * @return 返回短时间字符串格式yyyy-MM
	 */
	public static String getStringLastMonth() {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.MONTH, -1);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM");
		return format.format(c.getTime());
	}

	/**
	 * 获取某年某月的最后一天
	 * 
	 * @param dayStr
	 *            yyyy-MM
	 * @return String
	 */
	public static String getLastDayOfMonth(String dayStr) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, Integer.parseInt(dayStr.split("-")[0]));
		cal.set(Calendar.MONTH, Integer.parseInt(dayStr.split("-")[1]) - 1);
		cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DATE));
		return new SimpleDateFormat("yyyy-MM-dd ").format(cal.getTime());
	}

	/**
	 * 获取某年某月的第一天
	 * 
	 * @param dayStr
	 *            yyyy-MM
	 * @return String
	 */
	public static String getFirstDayOfMonth(String dayStr) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, Integer.parseInt(dayStr.split("-")[0]));
		cal.set(Calendar.MONTH, Integer.parseInt(dayStr.split("-")[1]) - 1);
		cal.set(Calendar.DAY_OF_MONTH, cal.getMinimum(Calendar.DATE));
		return new SimpleDateFormat("yyyy-MM-dd ").format(cal.getTime());
	}

	/**
	 * 提取一个月中的最后一天
	 * 
	 * @param day
	 * @return
	 */
	public static Date getLastDate(long day) {
		Date date = new Date(System.currentTimeMillis());
		long date_3_hm = date.getTime() - 3600000 * 34 * day;
		Date date_3_hm_date = new Date(date_3_hm);
		return date_3_hm_date;
	}

	/**
	 * 将长时间格式字符串转换为时间 yyyy-MM-dd HH:mm:ss
	 * 
	 * @param strDate
	 * @return
	 */
	public static Date strToDateLong(String strDate) throws Exception {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date strtodate = null;
		strtodate = formatter.parse(strDate);
		return strtodate;
	}

	/**
	 * 将长时间格式字符串转换为时间 yyyy-MM-dd HH:mm:ss
	 * 
	 * @param strDate
	 * @return
	 */
	public static Date strToSimpleDate(String strDate) throws Exception {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date strtodate = null;
		strtodate = formatter.parse(strDate);
		return strtodate;
	}

	/**
	 * 将长时间格式时间转换为字符串 yyyy-MM-dd HH:mm:ss
	 * 
	 * @param dateDate
	 * @return
	 */
	public static String dateToStrLong(java.util.Date dateDate) {
		if (dateDate == null) {
			return null;
		}
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateString = formatter.format(dateDate);
		return dateString;
	}

	public static void setTimeZone() {
		/*
		 * if ("WINDOW".equals(OPTYPE)) { TimeZone tz =
		 * TimeZone.getTimeZone("ETC/GMT-8"); TimeZone.setDefault(tz); }
		 */
	}

	/**
	 * 得到现在时间
	 * 
	 * @return String 字符串 yyyyMMddHHmmss毫秒
	 */
	public static String getStringTodayB() {
		return getStringTodayA() + Calendar.getInstance().get(Calendar.MILLISECOND);
	}

	/**
	 * 获取昨天日期 返回字符串 yyyy-MM-dd
	 * 
	 * @return String
	 */
	public static String getStringYesterDay() {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -1);
		return new SimpleDateFormat("yyyy-MM-dd ").format(cal.getTime());
	}

	/**
	 * 得到现在时间
	 * 
	 * @return 字符串 yyyyMMdd HH:mm:ss
	 */
	public static String getStringTodayA() {
		Date currentTime = new Date(System.currentTimeMillis());
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
		String dateString = formatter.format(currentTime);
		return dateString;
	}

	/**
	 * 得到现在时间
	 * 
	 * @return 字符串 yyyyMMddHH
	 */
	public static String getStringTodayHour() {
		Date currentTime = new Date(System.currentTimeMillis());
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHH");
		String dateString = formatter.format(currentTime);
		return dateString;
	}

	/**
	 * 得到现在时间
	 * 
	 * @return 字符串 yyyyMMdd
	 */
	public static String getStringTodayShort() {
		Date currentTime = new Date(System.currentTimeMillis());
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		String dateString = formatter.format(currentTime);
		return dateString;
	}

	/**
	 * 获取任意时间后num天的时间
	 * 
	 * @param date
	 *            java.util.Date
	 * @param num
	 * @return
	 */
	public static Date nextDate(Date date, int num) {
		Calendar cla = Calendar.getInstance();
		cla.setTime(date);
		cla.add(Calendar.DAY_OF_YEAR, num);
		return cla.getTime();
	}

	public static Date getDateBefore(Date d, int day) {
		Calendar now = Calendar.getInstance();
		now.setTime(d);
		now.set(Calendar.DATE, now.get(Calendar.DATE) - day);
		return now.getTime();
	}
 

	/**
	 * 
	 * getPrimaryKey 获取一个主键
	 * 
	 * @param @return
	 * @return String
	 * @Exception 异常对象
	 */
	public static String getPrimaryKey() {
		int i = (int) (Math.random() * 10000);
		return getStringTodayShort() + i;
	}

	/**
	 * 格式化时间
	 * 
	 * @return 字符串 yyyy/MM/dd
	 */
	public static String getFormatDateStr(Date date, String pattern) {
		if (date == null)
			throw new IllegalArgumentException("date is null");
		if (pattern == null)
			throw new IllegalArgumentException("pattern is null");
		SimpleDateFormat formatter = new SimpleDateFormat(pattern);
		return formatter.format(date);
	}
	/**
	 * 格式化时间
	 * 
	 * @return 字符串 yyyy/MM/dd
	 */
	public static Date getFormatDateStr(String dateStr, String pattern) {
		SimpleDateFormat formatter = new SimpleDateFormat(pattern);
		try {
			return formatter.parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
		 
	}

	/**
	 * 获取当前时间的后N天
	 * 
	 * @return Date
	 */
	public static Date getEnd(int day) {
		Date date = null;
		date = getNowDateShort();
		Calendar cla = Calendar.getInstance();
		cla.setTime(date);
		cla.add(Calendar.DAY_OF_YEAR, day);
		return cla.getTime();
	}

	/**
	 * 获取当前时间的前N天,返回格式 2016-08-08 00:00:00
	 * 
	 * @return Date
	 */
	public static Date getBegin(int day) {
		Date date = null;
		date = getNowDateShort();
		Calendar now = Calendar.getInstance();
		now.setTime(date);
		now.set(Calendar.DATE, now.get(Calendar.DATE) - day);
		return now.getTime();
	}

	public static void main(String[] args) {

		System.out.println("---------------------");
		Date e=getDateBefore(new Date(), 3);
		System.out.println(getFormatDateStr(new Date(), "yyyy-MM-dd HH:mm:ss"));
		System.out.println(getFormatDateStr(e, "yyyy-MM-dd HH:mm:ss"));
		System.out.println("---------------------");
		// System.out.println(getFormatDateStr(todayStart.getTime(),
		// "yyyy-MM-dd HH:mm:ss"));
		// System.out.println(getFormatDateStr(new Date(getStartTime()),
		// "yyyy-MM-dd HH:mm:ss"));
		// System.out.println(getFormatDateStr(new Date(getEndTime()),
		// "yyyy-MM-dd HH:mm:ss"));
		// try {
		// SystemOut.println(getFormatDateStr(getNowDateShort(),
		// "yyyy-MM-dd HH:mm:ss"));
		// SystemOut.println(dateToStrLong(getBegin(1)));
		// SystemOut.println(dateToStrLong(getEnd(1)));
		// SystemOut.println( );
		// } catch ( Exception e) {
		// SystemOut.PrintExceptionStackTrace(e);
		// }
		
		//测试
		String getStartTime=getFormatDateStr(new Date(), "yyyy-MM-dd")+" 00:00:00";
		Date d1=getFormatDateStr(getStartTime,"yyyy-MM-dd HH:mm:ss");
	    System.out.println(getFormatDateStr(d1,"yyyy-MM-dd HH:mm:ss"));;
	    String getEndTime=getFormatDateStr(new Date(), "yyyy-MM-dd")+" 23:59:59";
	    Date d2=getFormatDateStr(getEndTime,"yyyy-MM-dd HH:mm:ss");
	    System.out.println(getFormatDateStr(d2,"yyyy-MM-dd HH:mm:ss"));;
	    
	    System.out.println("-------------****--------------");
	    
	    
			Date d;
			try {
				d = DateUtils.strToDateLong("2107-02-05");
				System.out.println(getStringDate(d));
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		 
	}

	public static Long getStartTime() {
//		Calendar todayStart = Calendar.getInstance();
//		todayStart.setTime(new Date());
//		todayStart.set(Calendar.HOUR, 0);
//		todayStart.set(Calendar.MINUTE, 0);
//		todayStart.set(Calendar.SECOND, 0);
//		todayStart.set(Calendar.MILLISECOND, 0);
//		return todayStart.getTime().getTime();
		String getStartTime=getFormatDateStr(new Date(), "yyyy-MM-dd")+" 00:00:00";
	    return getFormatDateStr(getStartTime,"yyyy-MM-dd HH:mm:ss").getTime();
	    
	}

	public static Long getEndTime() {
//		Calendar todayEnd = Calendar.getInstance();
//		todayEnd.set(Calendar.HOUR, 23);
//		todayEnd.set(Calendar.MINUTE, 59);
//		todayEnd.set(Calendar.SECOND, 59);
//		todayEnd.set(Calendar.MILLISECOND, 999);
//		return todayEnd.getTime().getTime();
		String getEndTime=getFormatDateStr(new Date(), "yyyy-MM-dd")+" 23:59:59";
	    return getFormatDateStr(getEndTime,"yyyy-MM-dd HH:mm:ss").getTime();
	}

}