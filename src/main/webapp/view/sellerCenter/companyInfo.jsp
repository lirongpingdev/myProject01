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
	<title>商家信息</title>
	<link rel="stylesheet" type="text/css" href="<%=path %>/css/base.css">
	<link rel="stylesheet" type="text/css" href="<%=path %>/css/index.css">
	<link rel="stylesheet" type="text/css" href="<%=path %>/css/style.css">
	<script type="text/javascript" src="<%=path%>/js/jquery-1.9.1.min.js"></script>
	<script type="text/javascript" src="<%=path%>/js/sellerEnter.js"></script>
	<script type="text/javascript" src="<%=path%>/js/time/WdatePicker.js"></script>
	
	<script type="text/javascript">
	
	function queryCompanyInfo(){
		$.ajax({
			type : "GET",
			url : "<%=path%>/sellerCenter/loadCompanyInfo?account="+$("#account").val(),
	        dataType:"json",      
	        data:null,
	        success:function(dt){
	        	if(dt.status!=0){
	            	alert("error:"+dt.message);
	            }
	           	var seller = eval(dt.data);
	           	$("#account").val(seller.account);
	           	$("#id").val(seller.id);
	           	$("#companyName").html(seller.companyName);
	           	$("#licenseNo").html(seller.licenseNo);
	           	$("#representativeName").html(seller.representativeName);
	           	$("#idcardNo").html(seller.idcardNo);
	           	$("#idcardImg1_preview").html("<img src='"+seller.idcardImg1+"'>");
	           	$("#idcardImg2_preview").html("<img src='"+seller.idcardImg2+"'>");
	           	$("#licenseImg_preview").html("<img src='"+seller.licenseImg+"'>");
	           	$("#taxRegisterImg_preview").html("<img src='"+seller.taxRegisterImg+"'>");
	           	$("#accountLicenseImg_preview").html("<img src='"+seller.accountLicenseImg+"'>");
	           	$("#taxpayerNo").html(seller.taxpayerNo);
	           	$("#phone").val(seller.phone);
	           	$("#contactsName").val(seller.contactsName);
	           	$("#email").val(seller.email);
	           	$("#bankNo").val(seller.bankNo);
	           	$("#bankName").val(seller.bankName);
	           	$("#accountName").val(seller.accountName);
	           	$('input').attr("readonly","readonly")//将input元素设置为readonly
	           	$("#accountLicenseImg_file").attr("disabled","disabled");
	        }, 
	        error : function(data) {
	        	alert("Request error,Msg="+data.message);
			}
	     });
	}

	function saveBankInfo(){
		var param = {
				"account" : $("#account").val(),
				"id" : $("#id").val(),
				"phone" : $("#phone").val(),
				"contactsName" : $("#contactsName").val(),
				"email" : $("#email").val(),
				"bankNo" : $("#bankNo").val(),
				"bankName" : $("#bankName").val(),
				"accountLicenseImg" : $("#accountLicenseImg").val(),
				"accountName" : $("#accountName").val()
			}
		$.ajax({
			type : "post",
			url : "<%=path %>/seller/addBankInfo",
	        dataType:"json",      
	        data:param,
	        success:function(dt){
	        	var status = dt.status;
				if(status==0){
					$('input').attr("readonly","readonly")//将input元素设置为readonly
					$("#accountLicenseImg_file").attr("disabled","disabled");
				}else{
					alert("System error,Msg="+data.message);
				}
	        }, 
	        error : function(data) {
	        	alert("Request error,Msg="+data.message);
			}
	     }); 
	}
	
	function editBankInfo(){
		$('input').removeAttr("readonly");//去除input元素的readonly属性
		$("#accountLicenseImg_file").removeAttr("disabled");
	}
	
	function uploadPic(obj){
		$(obj).parent()[0].submit();
	}
	
	$(function(){
		queryCompanyInfo();
	});
	
	</script>
</head>
<body>
	<jsp:include page="/view/include/top.jsp"  />
	<div class="page_box">
	<jsp:include page="/view/include/leftMenu.jsp"  />
		<div class="main">
	        <input type="hidden" name="account" id="account">
	        <input type="hidden" name="id" id="id">
			<div class="place"><a href="#">商家中心</a>><a href="#">商家信息</a>><span class="index_on">店铺信息</span></div>
			<ul class="shop_bs">
				<li class="shop_bs_on">公司信息</li>
				<li><a href="<%=path %>/sellerCenter/shopInfo" class="fr">店铺信息</a></li>
			</ul>
			<div class="shop_edit"  style="float:left;">
				<span>公司营业执照信息</span>
			</div>
			  <div class="en_cons" style="margin-left: 40px;">
			    <div class="en_in">
			      <div class="en_txt"><em>*</em><span>公司名称：</span></div>
			      <div class="disabled" id="companyName" name="companyName"></div>
			    </div>
			    <div class="en_in">
			      <div class="en_txt"><em>*</em><span>营业执照号：</span></div>
			       <div class="disabled" id="licenseNo" name="licenseNo"></div>
			    </div>
			    <div class="en_in">
			      <div class="en_txt"><em>*</em><span>法定代表人姓名：</span></div>
			      <div class="disabled" id="representativeName" name=representativeName"></div>
			    </div>
			    <div class="en_in">
			      <div class="en_txt"><em>*</em><span>身份证号：</span></div>
			      <div class="disabled" id="idcardNo" name="idcardNo"></div>
			    </div>
			    <div class="en_in">
			      <div class="en_txt"><em>*</em><span>法人身份证电子版：</span></div>
			      <div class="en_pic">
			        <div id="idcardImg1_preview" class="en_img">
					</div>
			        <input type="file" name="" value="" disabled="true">
			        <div class="en_pictxt">身份证正面</div>
			      </div>
			      <div class="en_pic">
			        <div id="idcardImg2_preview" class="en_img">
					</div>
			        <input type="file" name="" value="" disabled="true">
			        <div class="en_pictxt">身份证反面</div>
			      </div>
			      <!-- <div class="en_imgtxt">图片仅支持JPG、GIF、PNG格式，大小不超过1MB</div> -->
			    </div>
			    <div class="en_in">
			      <div class="en_txt"><em>*</em><span>营业执照电子版：</span></div>
			      <div class="en_pic">
			        <div id="licenseImg_preview" class="en_img"></div>
			        <input type="file" name="" value="" disabled="true">
			      </div>
			     <!--  <div class="en_imgtxt">图片仅支持JPG、GIF、PNG格式，大小不超过1MB</div> -->
			    </div>
			    
			    <div class="shop_edit" style="float:left;">
				<span>税务信息</span>
				</div>
			   <div class="en_in">
			      <div class="en_txt"><span>纳税人识别号：</span></div>
			      <div class="disabled" id="taxpayerNo" name="taxpayerNo"></div>
			    </div>
			    
			    <div class="en_in">
			      <div class="en_txt"><span>税务登记证电子版：</span></div>
			      <div class="en_pic">
			        <div id="taxRegisterImg_preview" class="en_img"></div>
			        <input type="file" name="" value="" disabled="true">
			      </div>
			      <!-- <div class="en_imgtxt">图片仅支持JPG、GIF、PNG格式，大小不超过1MB</div> -->
			    </div>
			  </div>

			  <div class="shop_edit" style="float:left;">
				<span>银行卡信息</span>
				<a href="#" class="fr" style="margin-left: 15px;" onclick="saveBankInfo();">保存</a>
				<a href="#" class="fr" onclick="editBankInfo();">编辑</a>
			</div>
			  <div class="en_con" style="margin-left: 40px;">
			    <div class="en_in">
			      <div class="en_txt"><em>*</em><span>联系人电话：</span></div>
			      <input type="text" id="phone" name="phone" value="">
			    </div>
			     <div class="en_in">
			      <div class="en_txt"><em>*</em><span>联系人姓名：</span></div>
			      <input type="text" id="contactsName" name="contactsName" value="">
			    </div>
			    <div class="en_in">
			      <div class="en_txt"><em>*</em><span>联系人邮箱：</span></div>
			      <input type="text" id="email" name="email" value="">
			    </div>
			     <div class="en_in">
			      <div class="en_txt"><em>*</em><span>银行开户名：</span></div>
			      <input type="text" id="accountName" name="accountName" value="">
			    </div>
			     <div class="en_in">
			      <div class="en_txt"><em>*</em><span>公司银行账号：</span></div>
			      <input type="text" id="bankNo" name="bankNo" value="">
			    </div>
			     <div class="en_in">
			      <div class="en_txt"><em>*</em><span>开户银行支行名称：</span></div>
			      <input type="text" id="bankName" name="bankName" value="">
			    </div>
				<div class="en_in">
					<div class="en_txt">
						<em>*</em><span>银行开户许可证电子版：</span>
					</div>
					<div class="en_pic">
						<form id="f_showPic"
							action="http://120.77.40.10/php/newfile.php?callBackURL=<%=basePath%>/view/common/fileUploadCallback.jsp?name=accountLicenseImg"
							method="post" enctype="multipart/form-data"
							target="uploadFileTarget">
							<div id="accountLicenseImg_preview" class="en_img">
								<p>+</p>
							</div>
							<input type="file" id="accountLicenseImg_file" name="Filedata" value="Filedata"
								onchange="uploadPic(this);">
						</form>
						<input type="hidden" name="accountLicenseImg"
							id="accountLicenseImg"> <span class="error_yellow"
							id="accountLicenseImgError"></span>
					</div>
					<div class="en_imgtxt">图片仅支持JPG、GIF、PNG格式，大小不超过1MB</div>
				</div>
			</div>
	</div>
	<div class="clearfix"></div>
	<div class="footer">
		<div class="copyright">	
		<p>粤ICP备17023251号  看客动力（深圳）有限公司</p>
		<p>Copyright © 2017 Peoplepower (Shenzhen) Technology Co. , Ltd. All Rights Reserved.</p>
	   </div>
	</div>
	
	<div hidden>
		<iframe name = "uploadFileTarget">
		</iframe>
	</div>
</body>
</html>