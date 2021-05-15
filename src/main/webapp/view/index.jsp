<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>首页</title>
	<link rel="stylesheet" type="text/css" href="<%=path %>/css/base.css">
	<link rel="stylesheet" type="text/css" href="<%=path %>/css/index.css">
</head>
<body>
	<div class="header">
		<div class="page_box">
			<h1 class="logo"><img src="<%=path %>/images/logo.png"></h1>
			<div class="login_header_txt">
				<a href="#">登录</a><span>|</span><a href="#">退出</a>
			</div>
		</div>
	</div>
	<div class="page_box">
		<div class="aside">
			<p class="index aside_cur"><span><a href="#">首页</a></span></p>
			<dl>
				<dt>商家中心</dt>
				<dd><p><a href="#"><i class="icon001"></i>商家信息</a></p></dd>
			</dl>
			<dl>
				<dt>商家管理</dt>
				<dd><p><a href="#"><i class="icon002"></i>商品信息</a></p></dd>
				<dd><p><a href="#"><i class="icon003"></i>广告橱柜</a></p></dd>
				<dd><p><a href="#"><i class="icon004"></i>商品统计</a></p></dd>
			</dl>
			<dl>
				<dt>订单管理</dt>
				<dd><p><a href="#"><i class="icon005"></i>订单中心</a></p></dd>
				<dd><p><a href="#"><i class="icon006"></i>售后中心</a></p></dd>
			</dl>
			<dl>
				<dt>看客管理</dt>
				<dd><p><a href="#"><i class="icon007"></i>关注人数</a></p></dd>
				<dd><p><a href="#"><i class="icon008"></i>收藏排行</a></p></dd>
				<dd><p><a href="#"><i class="icon009"></i>评价中心</a></p></dd>
			</dl>
			<dl>
				<dt>交易统计</dt>
				<dd><p><a href="#"><i class="icon010"></i>商品销售报表</a></p></dd>
				<dd><p><a href="#"><i class="icon011"></i>商品销售报表</a></p></dd>
				<dd><p><a href="#"><i class="icon012"></i>店铺流量统计</a></p></dd>
			</dl>
		</div>
		<div class="main">
			<div class="place"><span class="index_on">首页</span></div>
			<div class="index_box">
				<div class="photo"><img src="<%=path %>/images/poto.png"></div>
				<div class="user_show">
					<p class="color_333">用户名称：<span>18812121212</span></p>
					<p>店铺名称：<span>看客动力（深圳）科技有限公司</span></p>
				</div>
				<p class="fans">粉丝：<span class="yellow">265</span></p>
			</div>
			<ul class="good_list">
				<li class="list_bg">
					<p>待发货订单</p>
					<h3>200</h3>
				</li>
				<li class="list_bg02">
					<p>已发货订单</p>
					<h3>200</h3>
				</li>
				<li class="list_bg03">
					<p>退货单</p>
					<h3>200</h3>
				</li>
				<li class="list_bg04">
					<p>库存</p>
					<h3>200</h3>
				</li>
			</ul>
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