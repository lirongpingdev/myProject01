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
	
	function queryShopInfo(){
		$.ajax({
			type : "GET",
			url : "<%=path%>/sellerCenter/loadShopInfo",
	        dataType:"json",      
	        data:null,
	        success:function(dt){
	        	if(dt.status!=0){
	            	alert("System error,msg="+dt.message);
	            }
	           	var shop = eval(dt.data);
	           	if(shop){
	           		$("#account").val(shop.account);
		           	$("#id").val(shop.id);
		           	$("#shopName").val(shop.shopName);
		           	$("#shopIntroduction").val(shop.shopIntroduction);
		           	$("#telephone").val(shop.telephone);
		           	$("#qualificationsImg_preview").html("<img src='"+shop.qualificationsImg+"'>");
		           	$('input').attr("readonly","readonly")//将input元素设置为readonly
		           	$("#qualificationsImg_file").attr("disabled","disabled");
		           	$("#saveBtn").hide();
	           	}
	        }, 
	        error : function(data) {
	        	alert("Request error,Msg="+data.message);
			}
	     });
	}

	function editShopInfo(){
		$('input').removeAttr("readonly");//去除input元素的readonly属性
		$("#qualificationsImg_file").removeAttr("disabled");
		$("#saveBtn").show();
	}
	
	function saveShopInfo(){
		var param = {
				"account" : $("#account").val(),
				"id" : $("#id").val(),
				"shopName" : $("#shopName").val(),
				"shopIntroduction" : $("#shopIntroduction").val(),
				"telephone" : $("#telephone").val(),
				"qualificationsImg" : $("#qualificationsImg").val()
			}
		$.ajax({
			type : "post",
			url : "<%=path %>/sellerCenter/addShopInfo",
	        dataType:"json",      
	        data:param,
	        success:function(dt){
	        	var status = dt.status;
				if(status==0){
					$('input').attr("readonly","readonly")//将input元素设置为readonly
					$("#qualificationsImg_file").attr("disabled","disabled");
					$("#saveBtn").hide();
				}else{
					alert("System error,Msg="+data.message);
				}
	        }, 
	        error : function(data) {
	        	alert("System error,Msg="+data.message);
			}
	     }); 
	}
	
	function uploadPic(obj){
		$(obj).parent()[0].submit();
	}
	
	$(function(){
		queryShopInfo();
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
				<li><a href="<%=path %>/sellerCenter/companyInfo" class="fr">公司信息</a></li>
				<li class="shop_bs_on">店铺信息</li>
			</ul>
			<div class="shop_edit">
				<span>店铺信息</span>
				<a href="#" class="fr" onclick="editShopInfo();">编辑</a>
			</div>
			<!--编辑修改开始-->
		    <div>
			   <div class="en_in">
			      <div class="en_txt"><em>*</em><span>店铺名称：</span></div>
			      <input type="text" id="shopName" name="shopName" placeholder="请输入店铺名称（50个字符）">
			    </div>
			    <div class="en_in">
			      <div class="en_txt"><span>店铺简介：</span></div>
			      <input type="text" id="shopIntroduction" name="shopIntroduction" placeholder="好的简介能让顾客更快记住你的店铺哦！（100个字符）">
			    </div>
			     <div class="en_in">
			      <div class="en_txt"><em>*</em><span>店铺电话：</span></div>
			      <input type="text" id="telephone" name="telephone" placeholder="请输入店铺联系电话">
			    </div>
			   <div class="en_in">
			      <div class="en_txt"><span>其他资质证明：</span></div>
			      <div class="en_pic">
			        <form id="f_showPic"
							action="http://120.77.40.10/php/newfile.php?callBackURL=<%=basePath%>/view/common/fileUploadCallback.jsp?name=qualificationsImg"
							method="post" enctype="multipart/form-data"
							target="uploadFileTarget">
							<div id="qualificationsImg_preview" class="en_img">
								<p>+</p>
							</div>
							<input type="file" id="qualificationsImg_file" name="Filedata" value="Filedata"
								onchange="uploadPic(this);">
						</form>
						<input type="hidden" name="qualificationsImg" id="qualificationsImg"> 
						<span class="error_yellow" id="qualificationsImgError"></span>
			      </div>
			      <div class="en_txt_s">图片仅支持JPG、GIF、PNG格式，大小不超过1MB</div>
			      <div class="en_txt_s2">如您所经营的商品属于食品类别，请上传食品流通许可证；<br>  如商品属于烟草类别，请上传许可证。</div>
			    </div>
			    <div class="en_but en_but_on" id="saveBtn" onclick="saveShopInfo();">确认并保存</div>
	  		 </div><!--编辑修改结束-->
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