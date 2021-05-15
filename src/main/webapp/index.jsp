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
	<script type="text/javascript" src="js/jquery-1.9.1.min.js"></script>
</head>
<body>
	<jsp:include page="/view/include/top.jsp"  />
	<div class="page_box">
		<jsp:include page="/view/include/leftMenu.jsp"  />
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
	<jsp:include page="/view/include/bottom.jsp"/>
	<script>
		$(function() {
			var data = "";
			var url = "<%=basePath%>test/index";
			$.ajax({
	            url: url,
	            data: data,
	            dataType: 'json',
	            success: function(res) {
	            	if(res.code == -1) {
	            		alert("用户未登录");
	            		//window.location.href = res.data.redirectUrl;
	            	} else {
	            		alert("success");
	            	}
	            },
				error: function(res) {
					alert("登录失败，请稍候再试");
				}
	        });
		});
	</script>
</body>
</html>