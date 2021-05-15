<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="en">
<head>
<meta charset="UTF-8">
<title>商家入驻第二步</title>
<link href="<%=path%>/css/base.css" rel="stylesheet" type="text/css">
<link href="<%=path%>/css/style.css" rel="stylesheet" type="text/css">

<script type="text/javascript" src="<%=path%>/js/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="<%=path%>/js/sellerEnter.js"></script>
<script type="text/javascript" src="<%=path%>/js/time/WdatePicker.js"></script>

<script type="text/javascript">
	
	//纳税人识别号
	function checkTaxpayerNo(){
		var len = getLength($("#taxpayerNo").val());
		if(len==0){
			$("#taxpayerNoError").html("纳税人识别号不能为空.");
			$("#taxpayerNo").focus();
			return false;
		}else if(len>20){
			$("#taxpayerNoError").html("公司名称最长为20个字符.");
			$("#taxpayerNo").focus();
			return false;
		}else{
			$("#taxpayerNoError").html("");
		}
		return true;
	}
	
	//纳税人识别号电子版反
	function checkTaxRegisterImg(){
		var len = getLength($("#taxRegisterImg").val());
		if(len==0){
			$("#taxRegisterImgError").html("纳税人识别号电子版反不能为空.");
			return false;
		}else{
			$("#taxRegisterImgError").html("");
		}
		return true;
	}

	//银行开户名
	function checkAccountName(){
		var len = getLength($("#accountName").val());
		if(len==0){
			$("#accountNameError").html("银行开户名不能为空.");
			$("#accountName").focus();
			return false;
		}else{
			$("#accountNameError").html("");
		}
		return true;
	}
	
  	//公司银行账号
	function checkBankNo(){
		var len = getLength($("#bankNo").val());
		if(len==0){
			$("#bankNoError").html("公司银行账号不能为空.");
			$("#bankNo").focus();
			return false;
		}else if(len>20){
			$("#bankNoError").html("公司银行账号最大长度为20.");
			$("#bankNo").focus();
			return false;
		}else{
			$("#bankNoError").html("");
		}
		return true;
	}
  
	//开户银行支行名称
	function checkBankName(){
		var len = getLength($("#bankName").val());
		if(len==0){
			$("#bankNameError").html("开户银行支行名称不能为空.");
			$("#bankName").focus();
			return false;
		}else if(len>20){
			$("#bankNameError").html("开户银行支行名称最大长度为50.");
			$("#bankName").focus();
			return false;
		}else{
			$("#bankNameError").html("");
		}
		return true;
	}

	//银行开户许可证电子版
	function checkAccountLicenseImg(){
		var len = getLength($("#accountLicenseImg").val());
		if(len==0){
			$("#accountLicenseImgError").html("银行开户许可证电子版不能为空.");
			return false;
		}else{
			$("#accountLicenseImgError").html("");
		}
		return true;
	}

 	//联系人姓名
	function checkContactsName(){
		var len = getLength($("#contactsName").val());
		if(len==0){
			$("#contactsNameError").html("联系人姓名不能为空.");
			$("#contactsName").focus();
			return false;
		}else{
			$("#contactsNameError").html("");
		}
		return true;
	}
   
	//联系人手机
	function checkPhone(){
		var len = getLength($("#phone").val());
		if(len==0){
			$("#phoneError").html("联系人手机不能为空.");
			$("#phone").focus();
			return false;
		}else{
			$("#phoneError").html("");
		}
		return true;
	}
   
	//联系人邮箱
	function checkEmail(){
		var len = getLength($("#email").val());
		if(len==0){
			$("#emailError").html("联系人邮箱不能为空.");
			$("#email").focus();
			return false;
		}else{
			$("#emailError").html("");
		}
		return true;
	}
	
	function submitForm(){
		if(!checkTaxpayerNo()){
			return false;
		}
		
		if(!checkTaxRegisterImg()){
			return false;
		}
		
		if(!checkAccountName()){
			return false;
		}
		
		if(!checkBankNo()){
			return false;
		}
		
		if(!checkBankName()){
			return false;
		}
		
		if(!checkAccountLicenseImg()){
			return false;
		}
		
		if(!checkContactsName()){
			return false;
		}
		
		if(!checkPhone()){
			return false;
		}
		
		if(!checkEmail()){
			return false;
		}
		addBankInfo();
	}
	
	function querySellerEnterInfo(){
		$.ajax({
			type : "GET",
			url : "<%=path%>/seller/loadBanknfo?account="+$("#account").val(),
	        dataType:"json",      
	        data:null,
	        success:function(dt){
	           	if(dt.status!=0){
	           		alert("System error,Msg="+dt.message);
	           	}
	           	var seller = eval(dt.data);
	           	$("#account").val(seller.account);
	           	$("#id").val(seller.id);
	           	$("#taxpayerNo").val(seller.taxpayerNo);
	           	$("#accountName").val(seller.accountName);
	           	$("#bankNo").val(seller.bankNo);
	           	$("#bankName").val(seller.bankName);
	           	$("#contactsName").val(seller.contactsName);
	           	$("#phone").val(seller.phone);
	           	$("#email").val(seller.email);
	           	$("#accountLicenseImg_preview").html("<img src='"+seller.accountLicenseImg+"'>");
	           	$("#accountLicenseImg").val(seller.accountLicenseImg);
	           	$("#taxRegisterImg_preview").html("<img src='"+seller.taxRegisterImg+"'>");
	           	$("#taxRegisterImg").val(seller.taxRegisterImg);
	        }, 
	        error : function(data) {
	        	alert("Request error,Msg="+data.msg);
			}
	     });
	}
	
	function addBankInfo(){
		var param = {
				"account" : $("#account").val(),
				"id" : $("#id").val(),
				"taxpayerNo" : $("#taxpayerNo").val(),
				"accountName" : $("#accountName").val(),
				"bankNo" : $("#bankNo").val(),
				"bankName" : $("#bankName").val(),
				"contactsName" : $("#contactsName").val(),
				"phone" : $("#phone").val(),
				"taxRegisterImg" : $("#taxRegisterImg").val(),
				"accountLicenseImg" : $("#accountLicenseImg").val(),
				"email" : $("#email").val()
			}
		$.ajax({
			type : "post",
			url : "<%=path%>/seller/addBankInfo",
	        dataType:"json",      
	        data:param,
	        success:function(dt){
	        	var status = dt.status;
				if(status==0){
					window.location.href="<%=path%>/seller/waitingCheck";
				}else{
					alert("System error,Msg=" + data.message);
				}
			},
			error : function(data) {
				alert("Repuest error,Msg=" + data.message);
			}
		});
	}

	function uploadPic(obj) {
		$(obj).parent()[0].submit();
	}

	$(function() {
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
			<div class="step_jt1 sel">></div>
			<li>
				<div class="step_icon2"></div>
				<div class="step_txt">
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

	<div class="en2_box">
		<input name="account" id="account" type="hidden" value="${account }" />
		<input name="id" id="id" type="hidden" value="${UUID }" />
		<div class="en2_con">
			<div class="en2_tit">
				<span></span>
				<div>公司税务登记证</div>
			</div>
			<div class="en_in">
				<div class="en_txt">
					<em>*</em><span>纳税人识别号：</span>
				</div>
				<input type="text" onchange="checkTaxpayerNo();" name="taxpayerNo"
					id="taxpayerNo" placeholder="请输入纳税人识别号"> <span
					class="error_yellow" id="taxpayerNoError"></span>
			</div>
			<div class="en_in">
				<div class="en_txt">
					<em>*</em><span>税务登记电子版：</span>
				</div>
				<div class="en_pic">
					<form id="f_showPic"
						action="http://120.77.40.10/php/newfile.php?callBackURL=<%=basePath%>/view/common/fileUploadCallback.jsp?name=taxRegisterImg"
						method="post" enctype="multipart/form-data"
						target="uploadFileTarget">
						<div id="taxRegisterImg_preview" class="en_img">
							<p>+</p>
						</div>
						<input type="file" name="Filedata" value="Filedata"
							onchange="uploadPic(this);">
					</form>
					<input type="hidden" name="taxRegisterImg" id="taxRegisterImg">
					<span class="error_yellow" id="taxRegisterImgError"></span>
				</div>
				<div class="en_imgtxt">图片仅支持JPG、GIF、PNG格式，大小不超过1MB</div>
			</div>
			<div class="en2_tit2">
				<span></span>
				<div>开户银行许可证</div>
			</div>
			<div class="en_in">
				<div class="en_txt">
					<em>*</em><span>银行开户名：</span>
				</div>
				<input type="text" id="accountName" onchange="checkAccountName();"
					name="accountName" placeholder="请输入银行开户名（如：××公司）"> <span
					class="error_yellow" id="accountNameError"></span>
			</div>
			<div class="en_in">
				<div class="en_txt">
					<em>*</em><span>公司银行账号：</span>
				</div>
				<input type="text" id="bankNo" onchange="checkBankNo();"
					name="bankNo" placeholder="请输入银行账号"> <span
					class="error_yellow" id="bankNoError"></span>
			</div>
			<div class="en_in">
				<div class="en_txt">
					<em>*</em><span>开户银行支行名称：</span>
				</div>
				<input type="text" id="bankName" onchange="checkBankName();"
					name="bankName" placeholder="请输入银行支行名称"> <span
					class="error_yellow" id="bankNameError"></span>
			</div>
			<div class="en_in">
				<div class="en_txt">
					<span>银行开户许可证电子版：</span>
				</div>
				<div class="en_pic">
					<form id="f_showPic"
						action="http://120.77.40.10/php/newfile.php?callBackURL=<%=basePath%>/view/common/fileUploadCallback.jsp?name=accountLicenseImg"
						method="post" enctype="multipart/form-data"
						target="uploadFileTarget">
						<div id="accountLicenseImg_preview" class="en_img">
							<p>+</p>
						</div>
						<input type="file" name="Filedata" value="Filedata"
							onchange="uploadPic(this)">
					</form>
					<input type="hidden" name="accountLicenseImg"
						id="accountLicenseImg"> <span class="error_yellow"
						id="accountLicenseImgError"></span>
				</div>
				<div class="en_imgtxt">图片仅支持JPG、GIF、PNG格式，大小不超过1MB</div>
			</div>
			<div class="en_in">
				<div class="en_txt">
					<em>*</em><span>账单结算周期：</span>
				</div>
				<div class="en_txt_s">一个月</div>
			</div>
			<div class="en2_tit3">
				<span></span>
				<div>联系人信息</div>
			</div>
			<div class="en_in">
				<div class="en_txt">
					<em>*</em><span>联系人姓名：</span>
				</div>
				<input type="text" onchange="checkContactsName();"
					name="contactsName" id="contactsName" placeholder="请输入真实的姓名">
				<span class="error_yellow" id="contactsNameError"></span>
			</div>
			<div class="en_in">
				<div class="en_txt">
					<em>*</em><span>联系人手机：</span>
				</div>
				<input type="text" onchange="checkPhone();" name="phone" id="phone"
					placeholder="请输入有效的联系人手机号码"> <span class="error_yellow"
					id="phoneError"></span>
			</div>
			<div class="en_in">
				<div class="en_txt">
					<em>*</em><span>联系人邮箱：</span>
				</div>
				<input type="text" onchange="checkEmail();" name="email" id="email"
					placeholder="请输入邮箱地址"> <span class="error_yellow"
					id="emailError"></span>
			</div>
			<a href="<%=path %>/seller/baseInfo?id=${UUID }"><div
					class="en2_but">上一步</div></a>
			<div class="en2_but" onclick="submitForm();">下一步</div>
		</div>
	</div>

	<div hidden>
		<iframe name="uploadFileTarget"> </iframe>
	</div>
</body>
</html>