<%@ page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="home" /> 
<!DOCTYPE html>
<html lang="en">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>File Upload Call Back</title>
	<style type="text/css"></style>
	<script type="text/javascript"	src="${home}/js/jquery-1.9.1.min.js"></script>
	<script type="text/javascript">
		$(function(){
			$(window.parent.document).find("#${param.name}_preview").html("<img src='http://www.kankedl.com/ad${param.imgUrl}'>");
			$(window.parent.document).find("[name=${param.name}]").val("http://www.kankedl.com/ad${param.imgUrl}");
		});
	</script>
</head>
<body>
</body>
</html>