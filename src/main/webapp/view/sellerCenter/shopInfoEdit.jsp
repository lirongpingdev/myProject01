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
</head>
<body>
	<jsp:include page="/view/include/top.jsp"  />
	<div class="page_box">
	<jsp:include page="/view/include/leftMenu.jsp"  />
		<div class="main">
			<div class="place"><a href="#">商家中心</a>><a href="#">商家信息</a>><span class="index_on">店铺信息</span></div>
			<ul class="shop_bs">
				<li><a href="<%=path %>/sellerCenter/companyInfo" class="fr">公司信息</a></li>
				<li class="shop_bs_on">店铺信息</li>
			</ul>
			<div class="shop_edit">
				<span>店铺信息</span>
				<a href="#" class="fr">编辑</a>
			</div>
			<!--编辑修改开始-->
		    <div>
			   <div class="en_in">
			      <div class="en_txt"><em>*</em><span>店铺名称：</span></div>
			      <input type="text" placeholder="请输入店铺名称（50个字符）">
			    </div>
			    <div class="en_in">
			      <div class="en_txt"><span>店铺头像：</span></div>
			      <div class="en_pic">
			        <div class="en_img">+</div>
			        <input type="file" name="" value="">
			      </div>
			      <div class="en_imgtxt">图片仅支持JPG、GIF、PNG格式，大小不超过1MB</div>
			    </div>
			    <div class="en_in">
			      <div class="en_txt"><span>店铺简介：</span></div>
			      <input type="text" placeholder="好的简介能让顾客更快记住你的店铺哦！（100个字符）">
			    </div>
			     <div class="en_in">
			      <div class="en_txt"><em>*</em><span>店铺电话：</span></div>
			      <input type="text" placeholder="请输入店铺联系电话">
			    </div>
			   <div class="en_in">
			      <div class="en_txt"><span>其他资质证明：</span></div>
			      <div class="en_pic">
			        <div class="en_img">+</div>
			        <input type="file" name="" value="">
			      </div>
			      <div class="en_txt_s">图片仅支持JPG、GIF、PNG格式，大小不超过1MB</div>
			      <div class="en_txt_s2">如您所经营的商品属于食品类别，请上传食品流通许可证；<br>
			      如商品属于烟草类别，请上传许可证。</div>
			    </div>
			    <div class="en_but en_but_on">确认并保存</div>
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
</body>
</html>