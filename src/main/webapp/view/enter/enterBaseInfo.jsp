<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>商家入驻第一步</title>
    <link href="<%=path %>/css/base.css" rel="stylesheet" type="text/css">
	<link href="<%=path %>/css/style.css" rel="stylesheet" type="text/css">
	
	<script type="text/javascript" src="<%=path%>/js/jquery-1.9.1.min.js"></script>
	<script type="text/javascript" src="<%=path%>/js/sellerEnter.js"></script>
	<script type="text/javascript" src="<%=path%>/js/time/WdatePicker.js"></script>
	<script type="text/javascript">
	/*
	 * 检查一个字符串，只能包含数字
	 */
	function checkDigital(targetStr)
	{
	  var valid = "0123456789";
	  for (i = 0;i<=(targetStr.length-1);i++)
	  {
	    if (valid.indexOf(targetStr.charAt(i))<0)
	    {
	      return false;
	    }
	  }
	  return true;
	}
	
	//公司名称较验
	function checkCompanyName(){
		var len = getLength($("#companyName").val());
		if(len==0){
			$("#companyNameError").html("公司名称不能为空.");
			$("#companyName").focus();
			return false;
		}else if(len>50){
			$("#companyNameError").html("公司名称最长为50个字符.");
			$("#companyName").focus();
			return false;
		}else{
			$("#companyNameError").html("");
		}
		return true;
	}
	
	//营业执照
	function checklicenseNo(){
		var len = getLength($("#licenseNo").val());
		if(len==0){
			$("#licenseNoError").html("营业执照号不能为空.");
			$("#licenseNo").focus();
			return false;
		}else if(len!=15 && len!=18){
			$("#licenseNoError").html("营业执照为15或18位字符.");
			$("#licenseNo").focus();
			return false;
		}else{
			$("#licenseNoError").html("");
		}
		return true;
	}
	
	//法定代表人姓名
	function checkRepresentativeName(){
		var len = getLength($("#representativeName").val());
		if(len==0){
			$("#representativeNameError").html("法定代表人姓名不能为空.");
			$("#representativeName").focus();
			return false;
		}else if(len>10){
			$("#representativeNameError").html("法定代表人姓名最大长度为10个字符.");
			$("#representativeName").focus();
			return false;
		}else{
			$("#representativeNameError").html("");
		}
		//判断全是中文
		if(!checkChinese($("#representativeName").val())){
			$("#representativeNameError").html("法定代表人姓名必须全是中文.");
			$("#representativeName").focus();
			return false;
		}else{
			$("#representativeNameError").html("");
		}
		return true;
	}
	//身份证
	function checkIdcardNo(){
		var len = getLength($("#idcardNo").val());
		if(len==0){
			$("#idcardNoError").html("身份证不能为空.");
			$("#idcardNo").focus();
			return false;
		}else{
			$("#idcardNoError").html("");
		}
		return true;
	}
	
	//法人身份证电子版正面 
	function checkIdcardImg1(){
		var len = getLength($("#idcardImg1").val());
		if(len==0){
			$("#idcardImg1Error").html("身份证正面不能为空.");
			return false;
		}else{
			$("#idcardImg1Error").html("");
		}
		return true;
	}
	
	//法人身份证电子版反面
	function checkIdcardImg2(){
		var len = getLength($("#idcardImg2").val());
		if(len==0){
			$("#idcardImg2Error").html("身份证反面不能为空.");
			return false;
		}else{
			$("#idcardImg2Error").html("");
		}
		return true;
	}
	
	function checkLicenseAddress(){
		var len = getLength($("#licenseAddress").val());
		if(len==0){
			$("#licenseAddressError").html("详细地址不能为空.");
			$("#licenseAddress").focus();
			return false;
		}else if(len>50){
			$("#licenseAddressError").html("详细地址最长为100个字符.");
			$("#licenseAddress").focus();
			return false;
		}else{
			$("#licenseAddressError").html("");
		}
		return true;
	}
	
	function checkBeginTime(){
		var len = getLength($("#beginTime").val());
		if(len==0){
			$("#beginTimeError").html("开始时间不能为空.");
			return false;
		}else{
			$("#beginTimeError").html("");
		}
		return true;
	}
	
	function checkEndTime(){
		if($("#isLongTerm").is(":checked")){
			return true;
		}		
		var len = getLength($("#endTime").val());
		if(len==0){
			$("#endTimeError").html("开始时间不能为空.");
			return false;
		}else{
			$("#endTimeError").html("");
		}
		return true;
	}
	
	function checkTerm(){
		if($("#isLongTerm").is(":checked")){
			$("#endTimeDiv").hide();
		}else{
			$("#endTimeDiv").show();
		}
		//$("#termError").html("请选择合作期限.");
	}
	
	function checkRegisteredCapital(){
		var len = getLength($("#registeredCapital").val());
		if(len==0){
			$("#registeredCapitalError").html("注册资金不能为空.");
			$("#registeredCapital").focus();
			return false;
		}else{
			$("#registeredCapitalError").html("");
		}
		if(!checkDigital($("#registeredCapital").val())){
			$("#registeredCapitalError").html("注册资金全为数字.");
			return false;
		}else{
			$("#registeredCapitalError").html("");
		}
		return true;
	}
	
	function checkBusinessScope(){
		var len = getLength($("#businessScope").val());
		if(len==0){
			$("#businessScopeError").html("经营范围不能为空.");
			$("#businessScope").focus();
			return false;
		}else if(len>=4000){
			$("#businessScopeError").html("经营范围值应小于4000字符.");
			return false;
		}else{
			$("#businessScopeError").html("");
		}
		
		return true;
	}
	
	function checkLicenseImg(){
		var len = getLength($("#licenseImg").val());
		if(len==0){
			$("#licenseImgError").html("经营范围不能为空.");
			return false;
		}else{
			$("#licenseImgError").html("");
		}
		
		return true;
	}
	
	function checkForm(){
		if(!checkCompanyName()){
			return false;
		}
		
		if(!checklicenseNo()){
			return false;
		}
		
		if(!checkRepresentativeName()){
			return false;
		}
		
		if(!checkIdcardNo()){
			return false;
		}
		
		if(!checkIdcardImg1()){
			return false;
		}
		if(!checkIdcardImg2()){
			return false;
		}
		
		if(!checkLicenseAddress()){
			return false;
		}
		
		if(!checkEndTime()){
			return false;
		}
		if(!checkBeginTime()){
			return false;
		}
		
		if(!checkRegisteredCapital()){
			return false;
		}
		if(!checkBusinessScope()){
			return false;
		}
		
		addBaseInfo();
	}
	
	function addBaseInfo(){
			var param = {
					"companyName" : $("#companyName").val(),
					"licenseNo" : $("#licenseNo").val(),
					"representativeName" : $("#representativeName").val(),
					"idcardNo" : $("#idcardNo").val(),
					"licenseAddress" : $("#licenseAddress").val(),
					"beginTimeStr" : $("#beginTime").val(),
					"endTimeStr" : $("#endTime").val(),
					"registeredCapital" : $("#registeredCapital").val(),
					"idcardImg1" : $("#idcardImg1").val(),
					"idcardImg2" : $("#idcardImg2").val(),
					"licenseImg" : $("#licenseImg").val(),
					"businessScope" : $("#businessScope").val()
				}
			
			$.ajax({
				type : "post",
				url : "<%=path %>/seller/addBaseInfo",
		        dataType:"json",      
		        data:param,
		        success:function(dt){
		        	var status = dt.status;
		        	var seller = eval(dt.data);
					if(status==0){
						window.location.href="<%=path %>/seller/bankInfo?id="+seller.id+"&account="+seller.account;
					}else{
						alert("System error,Msg="+dt.message);
					}
		        }, 
		        error : function(data) {
		        	alert("Request error,Msg="+data.message);
				}
		     }); 
	}
	
	function querySellerEnterInfo(){
		$.ajax({
			type : "GET",
			url : "<%=path%>/seller/loadBaseInfo?id="+$("#id").val(),
	        dataType:"json",      
	        data:null,
	        success:function(dt){
	        	if(status!=0){
	        		alert("System error,Msg="+dt.message);
	        	}
	           	var seller = eval(dt.data);
	           	$("#companyName").val(seller.companyName);
	           	$("#licenseNo").val(seller.licenseNo);
	           	$("#representativeName").val(seller.representativeName);
	           	$("#idcardNo").val(seller.idcardNo);
	           	$("#licenseAddress").val(seller.licenseAddress);
	           	$("#beginTime").val(seller.beginTimeStr);
	           	$("#endTime").val(seller.endTimeStr);
	           	$("#registeredCapital").val(seller.registeredCapital);
	           	$("#businessScope").val(seller.businessScope);
	           	$("#idcardImg1_preview").html("<img src='"+seller.idcardImg1+"'>");
	           	$("#idcardImg1").val(seller.idcardImg1);
	           	$("#idcardImg2_preview").html("<img src='"+seller.idcardImg2+"'>");
	           	$("#idcardImg2").val(seller.idcardImg2);
	           	$("#licenseImg_preview").html("<img src='"+seller.licenseImg+"'>");
	           	$("#licenseImg").val(seller.licenseImg);
	        }, 
	        error : function(data) {
	        	alert("Request error,Msg="+data.message);
			}
	     });
	}
	
	function uploadPic(obj){
		$(obj).parent()[0].submit();
	}
	
	$(function(){
		querySellerEnterInfo();
	});
	
	</script>
</head>
<body style="background: #f0f0f0">
	
<div class="step_box">
   <ul>
     <li>
       <div class="step_icon1"></div>
       <div class="step_txt">
         <div class="step_num">第一步</div>
         <div class="step_infor">填写公司基本信息</div>
       </div>
     </li>
     <div class="step_jt1">></div>
     <li>
       <div class="step_icon2 select"></div>
       <div class="step_txt select">
         <div class="step_num">第二步</div>
         <div class="step_infor">填写税务/银行信息</div>
       </div>
     </li>
     <div class="step_jt2">></div>
    <li>
       <div class="step_icon3 select"></div>
       <div class="step_txt select">
         <div class="step_num">第三步</div>
         <div class="step_infor">等待审核</div>
       </div>
     </li>
   </ul>
</div>

<div class="en_box">
<%-- <form name="baseForm" id="baseForm" action="<%=path %>/seller/addBaseInfo" method="POST"> --%>
<input name="id" id="id" type="hidden" value="${UUID }"/> 
  <div class="en_con">
    <div class="en_in">
      <div class="en_txt"><em>*</em><span>公司名称：</span></div>
      <input type="text" id="companyName" name="companyName" onchange="checkCompanyName();" placeholder="需与营业执照上的企业名称一致">
      <span class="error_yellow" id="companyNameError"></span>
    </div>
    <div class="en_in">
      <div class="en_txt"><em>*</em><span>营业执照号：</span></div>
      <input type="text" id="licenseNo" name="licenseNo" onchange="checklicenseNo();" placeholder="请填写15位或18位营业执照注册号">
      <span class="error_yellow" id="licenseNoError"></span>
    </div>
    <div class="en_in">
      <div class="en_txt"><em>*</em><span>法定代表人姓名：</span></div>
      <input type="text" id="representativeName" name="representativeName" onchange="checkRepresentativeName();" placeholder="请输入法人姓名">
      <span class="error_yellow" id="representativeNameError"></span>
    </div>
    <div class="en_in">
      <div class="en_txt"><em>*</em><span>身份证号：</span></div>
      <input type="text" id="idcardNo" name="idcardNo" onchange="checkIdcardNo();" placeholder="请输入身份证号码">
      <span class="error_yellow" id="idcardNoError"></span>
    </div>
    <div class="en_in">
      <div class="en_txt"><em>*</em><span>法人身份证电子版：</span></div>
		<div class="en_pic">
			<form id="f_showPic"
				action="http://120.77.40.10/php/newfile.php?callBackURL=<%=basePath%>/view/common/fileUploadCallback.jsp?name=idcardImg1"
				method="post" enctype="multipart/form-data"
				target="uploadFileTarget">
				<div id="idcardImg1_preview" class="en_img">
					<p>+</p>
				</div>
				<input type="file" name="Filedata" value="Filedata" onchange="uploadPic(this)">
			</form>
			<input type="hidden" name="idcardImg1" id="idcardImg1">
			<div class="en_pictxt">身份证正面</div>
		</div>
		<div class="en_pic">
			<form id="f_showPic"
				action="http://120.77.40.10/php/newfile.php?callBackURL=<%=basePath%>/view/common/fileUploadCallback.jsp?name=idcardImg2"
				method="post" enctype="multipart/form-data"
				target="uploadFileTarget">
				<div id="idcardImg2_preview" class="en_img">
					<p>+</p>
				</div>
				<input type="file" name="Filedata" value="Filedata" onchange="uploadPic(this)">
			</form>
			<input type="hidden" name="idcardImg2" id="idcardImg2">
			<div class="en_pictxt">身份证反面</div>
      		<span class="error_yellow" id="idcardImg1Error"></span>
      		<span class="error_yellow" id="idcardImg2Error"></span>
		</div>
		<div class="en_imgtxt">图片仅支持JPG、PNG格式，大小不超过1MB</div>
	</div>
    <div class="en_in">
      <div class="en_txt"><em>*</em><span>营业执照详细地址：</span></div>
      <input type="text" id="licenseAddress" name="licenseAddress"  onchange="checkLicenseAddress();" placeholder="请输入详细地址（100个字符）">
      <span class="error_yellow" id="licenseAddressError"></span>
    </div>
    <div class="en_in">
      <div class="en_txt"><em>*</em><span>营业期限：</span></div>
      <div class="com_tinput">
        <input type="text" onchange="checkBeginTime();" id="beginTime" class="Wdate" onfocus="WdatePicker({maxDate:'#F{$dp.$D(\'beginTime\')||\'2020-10-01\'}'})">
      </div>
        <div class="com_tinput" id="endTimeDiv">
        <input type="text" onchange="checkEndTime();" id="endTime" class="Wdate" onfocus="WdatePicker({minDate:'#F{$dp.$D(\'endTime\')}',maxDate:'2020-10-01'})">
      </div>
      <div class="en_check">
      <input type="checkbox" id="isLongTerm" name="isLongTerm" onchange="checkTerm();">长期</div>
      <span class="error_yellow" id="termError"></span>
      <span class="error_yellow" id="beginTimeError"></span>
      <span class="error_yellow" id="endTimeError"></span>
    </div>
    <div class="en_in">
      <div class="en_txt"><em>*</em><span>注册资金：</span></div>
      <input type="text" id="registeredCapital" name="registeredCapital" onchange="checkRegisteredCapital();" placeholder="请输入数额">
      <div class="en_txt_s">万元</div>
      <span class="error_yellow" id="registeredCapitalError"></span>
    </div>
   <div class="en_in">
      <div class="en_txt"><em>*</em><span>经营范围：</span></div>
      <textarea name="businessScope" id="businessScope" onchange="checkBusinessScope();" placeholder="请与营业执照上的经营范围保持一致"></textarea>
      <span class="error_yellow" id="businessScopeError"></span>
    </div>
    <div class="en_in">
      <div class="en_txt"><em>*</em><span>营业执照电子版：</span></div>
      <div class="en_pic">
			<form id="f_showPic"
				action="http://120.77.40.10/php/newfile.php?callBackURL=<%=basePath%>/view/common/fileUploadCallback.jsp?name=licenseImg"
				method="post" enctype="multipart/form-data"
				target="uploadFileTarget">
				<div id="licenseImg_preview" class="en_img">
					<p>+</p>
				</div>
				<input type="file" name="Filedata" value="Filedata" onchange="uploadPic(this)">
			</form>
			<input type="hidden" name="licenseImg" id="licenseImg">
      		<span class="error_yellow" id="licenseImgError"></span>
		</div>
		<div class="en_imgtxt">图片仅支持JPG、PNG格式，大小不超过1MB</div>
    </div>
    <%-- <a href="<%=path %>/seller/bankInfo"><div class="en_but3">下一步</div></a> --%>
    <div class="en_but3" onclick="checkForm();">下一步</div>
  </div>
<!--   </form> -->
</div>

<div hidden>
		<iframe name = "uploadFileTarget">
			
		</iframe>
	</div>
</body>
</html>