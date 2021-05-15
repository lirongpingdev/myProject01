package com.gy.kanke.store.common;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import com.alibaba.fastjson.JSON;

public class BaseAPIRequestparam<T>{
	/**
	 * 请求发送时间
	 * */
	private String dateStr;
	/**
	 * token  获取方法: MD5(dateStr+MD5(data)+systemIdentify)
	 * */
	private String token;
	/**
	 * 系统标识
	 * */
	private String systemIdentify = "KK_GENERAL_SYSTEMIDENTIFY";
	
	
	private T data;
	
	private ResponseStateInfo state;
	
	private static final String ENCORDING = "UTF-8";
	
	
	public String getToken() {
		return token;
	}
	
	/**
	 * 该方法不建议使用，只提供给JSON框架调用
	 * */
	public void setToken(String token) {
		this.token = token;
	}
	
	public String getSystemIdentify() {
		return systemIdentify;
	}
	
	public String getDateStr() {
		return dateStr;
	}
	
	public void setDateStr(String dateStr) {
		this.dateStr = dateStr;
	}
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	
	public ResponseStateInfo getState() {
		return state;
	}

	public void setState(ResponseStateInfo state) {
		this.state = state;
	}

	/**
	 * 将响应报文转换为Object
	 * @throws Exception 
	 * */
	public BaseAPIRequestparam(String src,Class className) throws Exception{
		BaseAPIRequestparam obj = JSON.parseObject(src,this.getClass());
		this.dateStr = obj.getDateStr();
		this.state = obj.getState();
		String dataMD5 = "";
		if(obj.getData()!=null){
			this.data = (T)JSON.parseObject(obj.getData().toString(),className);
			dataMD5 = MD5.MD5(obj.getData().toString().trim(),ENCORDING);
		}
		this.token = MD5.MD5(obj.getDateStr()+dataMD5+obj.getSystemIdentify(),ENCORDING);
		if(obj.getToken()==null || !obj.getToken().equalsIgnoreCase(this.token)){
			throw new Exception("Token校验失败,响应报文为:"+src);
		}
	}
	
	/**
	 * 将响应报文转换为Object
	 * @throws Exception 
	 * */
	public BaseAPIRequestparam(HttpServletRequest request,Class className) throws Exception{
		String src = getRequestPostString(request);
		BaseAPIRequestparam obj = JSON.parseObject(src,this.getClass());
		this.dateStr = obj.getDateStr();
		this.state = obj.getState();
		String dataMD5 = "";
		if(obj.getData()!=null){
			this.data = (T)JSON.parseObject(obj.getData().toString(),className);
			dataMD5 = MD5.MD5(obj.getData().toString().trim(),ENCORDING);
		}
		this.token = MD5.MD5(obj.getDateStr()+dataMD5+obj.getSystemIdentify(),ENCORDING);
		if(obj.getToken()==null || !obj.getToken().equalsIgnoreCase(this.token)){
			//throw new Exception("Token校验失败,响应报文为:"+src);
		}
	}
	

	public BaseAPIRequestparam(){}
	
	/**
	 * 获取请求报文
	 * 即 将Object转换为JSON字符串
	 * */
	public String toJSONString(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd dd:mm:ss");
		String dataMD5 = "";
		if(this.getData()!=null){
			String dateJSON = JSON.toJSONString(this.getData()).trim();
			dataMD5 = MD5.MD5(dateJSON,ENCORDING);
		}
		this.dateStr = sdf.format(new Date());
		this.token=MD5.MD5(this.dateStr+dataMD5+this.systemIdentify,ENCORDING);
		return JSON.toJSONString(this);
	}
	
	/**
	 * 从request中读取post参数
	 * */
	public static String getRequestPostString(HttpServletRequest request)  
            throws IOException {
        int contentLength = request.getContentLength();  
        /*当无请求参数时，request.getContentLength()返回-1 */  
        if(contentLength<0){  
            return null;  
        }  
        byte buffer[] = new byte[contentLength];  
        for (int i = 0; i < contentLength;) {  
  
            int readlen = request.getInputStream().read(buffer, i,  
                    contentLength - i);  
            if (readlen == -1) {  
                break;  
            }  
            i += readlen;  
        }  
        String charEncoding = request.getCharacterEncoding();
        return new String(buffer, charEncoding);  
    } 
	
	public static void main(String[] args) throws Exception{
		//发起请求是
		/*TestUser s1 = new TestUser();
		s1.setId("test user Id 1");
		s1.setName("Test user Name1");
		s1.setPwd("Test pwd 1");
		
		TestUser s2 = new TestUser();
		s2.setId("test user Id 2");
		s2.setName("Test user Name2");
		s2.setPwd("Test pwd 2");
		
		DateTest test = new DateTest();
		test.setSs(Arrays.asList(new TestUser[]{s1,s2}));
		test.setAttribute1("att1");
		test.setAttribute1("att2");
		
		BaseAPIRequestparam<DateTest> param = new BaseAPIRequestparam<DateTest>();
		param.setData(test);
		System.out.println(param.toJSONString());
		
		
		//获取到 后
		String src = "{\"dateStr\":\"2017-04-27 27:13:27\",\"state\":{\"code\":1,\"msg\":\"1111\"},\"systemIdentify\":\"KK_GENERAL_SYSTEMIDENTIFY\",\"token\":\"55117b1146aa2c17bb54ef793002f7ef\"}";
		
		BaseAPIRequestparam<DateTest> param2 = new BaseAPIRequestparam<DateTest>(src,DateTest.class);
		
		System.out.println("----------------General param info----------------");
		System.out.println("dataStr = "+param2.getDateStr());
		System.out.println("dataToken = "+param2.getToken());
		
		System.out.println("----------------state info----------------");
		System.out.println("code = "+param2.getState().getCode());
		System.out.println("msg = "+param2.getState().getMsg());
		if(param2.getState().getCode() == ResponseStateInfo.CODE_SUCCESS){
			System.out.println("请求处理成功");
		}else{
			System.out.println("请求处理失败！失败信息是"+param2.getState().getMsg());
		}
		
		System.out.println("----------------Service Data info----------------");
		if(param2.getData()!=null){
			System.out.println("Data = "+param2.getData().getAttribute1());
			System.out.println("Data = "+param2.getData().getSs().get(0).getName());
		}*/
	}
	
	
	/**
	 * 获取请求报文
	 * 即 将Object转换为JSON字符串
	 * */
	public void setToken(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd dd:mm:ss");
		String dataMD5 = "";
		if(this.getData()!=null){
			String dateJSON = JSON.toJSONString(this.getData()).trim();
			dataMD5 = MD5.MD5(dateJSON,ENCORDING);
		}
		this.dateStr = sdf.format(new Date());
		this.token=MD5.MD5(this.dateStr+dataMD5+this.systemIdentify,ENCORDING);
	}
	
}
