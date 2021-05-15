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
	<title>左菜单</title>
</head>
<body>
<div class="aside">
	<p class="index aside_cur"><span><a href="<%=path%>/">首页</a></span></p>
	<dl>
		<dt>商家中心</dt>
		<dd><p><a href="<%=path %>/sellerCenter/shopInfo"><i class="icon001"></i>商家信息</a></p></dd>
	</dl>
	<dl>
		<dt>商家管理</dt>
		<dd><p><a href="<%=path %>/mallPro/selList"><i class="icon002"></i>商品信息</a></p></dd>
		<%-- <dd><p><a href="<%=path %>/view/commodity/adWindow.jsp">
		<i class="icon003"></i>广告橱柜</a></p></dd> --%>
		<dd><p><a href="#"><i class="icon004"></i>商品统计</a></p></dd>
	</dl>
	<dl>
		<dt>订单管理</dt>
		<dd><p><a href="<%=path %>/order/orderInfo"><i class="icon005"></i>订单中心</a></p></dd>
		<!-- <dd><p><a href="#"><i class="icon006"></i>售后中心</a></p></dd> -->
	</dl>
	<!-- <dl>
		<dt>看客管理</dt>
		<dd><p><a href="#"><i class="icon007"></i>关注人数</a></p></dd>
		<dd><p><a href="#"><i class="icon008"></i>收藏排行</a></p></dd>
		<dd><p><a href="#"><i class="icon009"></i>评价中心</a></p></dd>
	</dl> -->
	<dl>
		<dt>交易统计</dt>
		<dd><p><a href="<%=path %>/report/transactionMoney"><i class="icon010"></i>交易款项报表</a></p></dd>
		<%-- <dd><p><a href="<%=path %>/report/goodsSelesTable"><i class="icon010"></i>商品销售报表</a></p></dd> --%>
	</dl>
</div>
</body>