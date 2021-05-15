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
	<title>审核失败</title>
    <link href="<%=path %>/css/base.css" rel="stylesheet" type="text/css">
	<link href="<%=path %>/css/style.css" rel="stylesheet" type="text/css">
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
<div class="au_box">
  <img src="<%=path %>/images/005.png" alt="">
  <div>您的入驻申请审核不通过！</div>
  <a href="<%=path %>/seller/baseInfo"><div class="au_but1">再次申请</div></a>
  <!-- <p class="au_txt">请于3小时后再次申请</p> -->
  <p class="au_txt2">审核不通过原因：${notPassReason }</p>
</div>

</body>
</html>