<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="home" />
<c:set value="${fn:substringBefore(pageContext.request.requestURL,'view')}" var="domain"/>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>新增商品第二步</title>
	<link rel="stylesheet" type="text/css" href="<%=path %>/css/base.css">
	<link rel="stylesheet" type="text/css" href="<%=path %>/css/style.css">
	<script type="text/javascript" src="<%=basePath%>js/jquery-1.9.1.min.js"></script>
	<script type="text/javascript">
	
	$(function(){

		//商品添加
		$("#submitId").click(function(){
			//验证
			
			//验证通过保存数据
			sub();
			

			});

		});
	function sub() {
		try{
			//检查规格个数
			var row=$("#tabId tbody tr").length;
			if(row<=0){
				alert("至少有一个规格值");
				return false;
			}
			
			$.ajax({
				  type: 'POST',
				  url: "${home}/mallPro/isnertProStandard",
				  data: $("#submitFormId").serialize(),
				  dataType: "json",
				  success: function(data){
					 alert(data.message)
					 if(data.status==1){
						 //保存到缓存成功
						 location.href = "${home}/view/commodity/commodityAdded3.jsp"; 
					 }
				  }
			});
		}catch (e) {
			alert("操作失败，请稍后再试");
		}
	}
	
	//记录tr数量
	var trRow=0;
	//加入规格
	function addSpecification(){
		
		try{
			
			var guigeName=$("#guigeName").val();
			var guigeVal=$("#guigeVal").val();
			
			if(guigeName.length==0){ 
				alert("规格名称能为空");
				return false;
			}
			
			if(guigeVal.length>30){ 
				alert("字符长度不能大于30");
				return false;
			}
			
			$("#specificationName").html(guigeName);
			$("#normNameId").val(guigeName);
			 
			$("#tabId").append('<tr><td><input type="text" name="porVal['+trRow+'].proTypeName" value="'+guigeVal+'"></td><td><input type="number" name="porVal['+trRow+'].sellingPrice" value="0.00"></td><td><input type="number" name="porVal['+trRow+'].originalPrice" value="0.00"></td>	<td><input type="number" name="porVal['+trRow+'].repertory"  value="0"></td></tr>');
			trRow++;
		}catch (e) {
			
		}
		
		
	}
	
	//取消
	function quxiao(){
		 var a=confirm("取消将不会保存所填写资料？");
		 if(a==true)
		 {
		 	alert("您已确定，马上跳转商品列表");
		 	location.href="${home}/mallPro/selList";
		 }
	}
	</script>
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
			  <span class="index_on">新增商品</span>
			</div>
			<div class="com_box3">
			<div class="add_img2"></div>
              <h2 class="add_tit"><em>*</em>商品规格</h2>
              <div class="add_box">
              	<input type="text" id="guigeName" placeholder="请输入规格名称" class="add_in">
              	<input type="text" id="guigeVal" name="" placeholder="使用回车键快速输入规格值，最多30个规格值" class="add_in2">
		   </div>
		   <div class="add_plus" onclick="addSpecification();">+添加规格</div>
		   </div>
			
		   <form id="submitFormId" action="" method="post" >
		   <div class="com_box3">
              <h2 class="add_tit"><em>*</em>商品库存</h2>
              <input type="hidden" name="normName" id="normNameId">
               <div class="spec_table">
			   	   <table id="tabId">
			   	   	<thead>
			   	   		<tr>
			   	   			<th class="spec_th1" id="specificationName">规格</th><th>售价</th><th>原价</th><th>库存</th>
			   	   		</tr>
			   	   	</thead>
			   	   	<tbody>
			   	   	</tbody>
			   	   </table>
			   </div>
           </div>
           </form> 
		    <div class="en_but4" onclick="quxiao()">取消</div>
             <a href="javaScript:void(0);" id="submitId"><div class="en_but5">保存</div></a>
             <!--预览前端没写-->
               <!--按钮橙色样式是 en_but5   变灰色在后面加上样式on-->
		</div>
		<!--结束-->
	</div>
	<div class="clearfix"></div>
	<jsp:include page="/view/include/bottom.jsp"/>
</body>
</html>