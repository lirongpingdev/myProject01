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
	<title>头部</title>
	
	<script type="text/javascript" src="<%=path%>/js/jquery-1.9.1.min.js"></script>
<script type="text/javascript">
		
	function loginOut(){
		$.ajax({
			type : "Get",
			url : "<%=path%>/login/loginOut",
            dataType:"json",      
            data:null,
            success:function(dt){
				if (dt.status != 0) {
					alert("Login out error,Msg=" + data.msg);
				}else{
					window.location.href="<%=path%>/order/orderInfo";
				}
			},
			error : function(data) {
				alert("Login out error,Msg=" + data.msg);
			}
		});
	}
	function getLoginUser() {
		$.ajax({
			type : "Get",
			url : "<%=path%>/login/getLoginUser",
            dataType:"json",      
            data:null,
            success:function(dt){
					var jsoons = dt.data;
                   	var user = eval(dt.data);
                   	var userName = "";
                   	if(user.nickName!=null && user.nickName!=undefined && user.nickName!=''){
                   		userName = user.nickName;
                   	}else if(user.realName!=null && user.realName!=undefined && user.realName!=''){
                   		userName = user.realName;
                   	}else if(user.userPhone!=null && user.userPhone!=undefined && user.userPhone!=''){
                   		userName=user.userPhone;
                   	}else{
                   		userName=user.account;
                   	}
                	
                   	$("#userName").html("欢迎您："+userName);
			},
			error : function(data) {
				alert("Get login User into error,Msg=" + data.msg);
			}
		});
	}

	$(function() {
		getLoginUser();
	});
</script>

</head>
<body>
<div class="header">
	<div class="page_box">
		<h1 class="logo"><img src="<%=path %>/images/logo.png"></h1>
		<div class="login_header_txt">
			<span id="userName"></span></span><span>|</span><span onclick="loginOut();">退出</span>
		</div>
	</div>
</div>
</body>