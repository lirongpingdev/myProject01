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
	<title>新增商品等待审核</title>
	<link rel="stylesheet" type="text/css" href="<%=path %>/css/base.css">
	<link rel="stylesheet" type="text/css" href="<%=path %>/css/style.css">
		<link rel="stylesheet" type="text/css" href="<%=basePath%>css/base.css">
	<link rel="stylesheet" type="text/css" href="<%=basePath%>css/style.css">
	<script type="text/javascript" src="<%=basePath%>js/jquery-1.9.1.min.js"></script>
</head>
<body>
	<jsp:include page="/view/include/top.jsp"  />
	<div class="page_box">
		<jsp:include page="/view/include/leftMenu.jsp"  />
		<!--中间主体内容-->
		<div class="main">
			<div class="place">
			  <a href="#">商品管理</a>
			  >
			  <a href="#">商品信息</a>
			  >
			  <span class="index_on">新增完成</span>
			</div>
			<div class="com_box3">
			<div class="add_img3"></div>
             <div class="add_over">
				  <img src="<%=basePath%>images/003.png" alt="">
				  <div>您的申请已提交成功！我们会尽快审核，请耐心等待！</div>
			</div>
			<div class="add_img4">
				<img src="<%=basePath%>images/008.png" alt="" onclick="$('.add_layer').show();" >
			</div>

        <!--弹层样式-->
          <div class="add_layer" style="display: none;">
          	<div class="add_lbox">
          		<div class="add_ltit">看客动力广告平台</div>
          		<div class="add_ltxt">该平台将获取以下授权</div>
          		<div class="add_lch"><input type="checkbox" id="xieyi" name="" value="" checked="checked">同意使用基本资料登录此平台</div>
          		<div class="add_lb">
          			<div class="add_lbut1" onclick="$('.add_layer').hide();">取消</div>
          			<div class="add_lbut2" onclick="if($('#xieyi').is(':checked')){location.href=ad_path_cast;}else{alert('请选择,同意使用基本资料登录此平台')};">允许</div>
          		</div>
          	</div>
          </div>
        <!--弹层结束-->		
		</div>
		<!--结束-->
	</div>
	<div class="clearfix"></div>
	<jsp:include page="/view/include/bottom.jsp"/>
</body>
</html>