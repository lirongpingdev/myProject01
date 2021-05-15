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
	<title>商家入驻第三步</title>
    <link href="<%=path %>/css/base.css" rel="stylesheet" type="text/css">
	<link href="<%=path %>/css/style.css" rel="stylesheet" type="text/css">
</head>
<body style="background: #f0f0f0">
	
<!---->
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
     <div class="step_jt2 sel">></div>
    <li>
       <div class="step_icon3"></div>
       <div class="step_txt">
         <div class="step_num">第三步</div>
         <div class="step_infor">等待审核</div>
       </div>
     </li>
   </ul>
</div>

<div class="en3_box">
  <img src="<%=path %>/images/003.png" alt="">
  <div>您的申请已提交成功！我们会尽快审核，请耐心等待！</div>
</div>

</body>
</html>