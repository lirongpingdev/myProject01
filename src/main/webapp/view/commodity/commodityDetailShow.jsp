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
	<title>商品详情</title>
		<link rel="stylesheet" type="text/css" href="<%=path %>/css/base.css">
		<link rel="stylesheet" type="text/css" href="<%=path %>/css/style.css">
		<script type="text/javascript" src="<%=basePath%>js/jquery-1.9.1.min.js"></script>
		<script type="text/javascript">
		$(function(){
			$("input").attr("disabled","disabled");
			
			
		});
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
			  <span class="index_on">商品详情</span>
			</div>
			<div class="com_box2">
				<div class="com_list2">
				   <div class="com_title">基本信息</div>
				     <div class="en_in">
					      <div class="en_txt"><em>*</em><span>商品简称：</span></div>
					      <input type="hidden" id="proId" value="${data.mallPro.id}">
					      <input type="text" id="shortTitleId" name="shortTitle" value="${data.mallPro.shortTitle}" placeholder="请填写商品简称">
				    </div>
				    <div class="en_in">
					      <div class="en_txt"><em>*</em><span>商品名称：</span></div>
					      <input type="text" id="longTitleId" name="longTitle" value="${data.mallPro.longTitle}" placeholder="请填写商品名称">
				    </div>
				    <div class="en_in">
					      <div class="en_txt"><em>*</em><span>商品展示图：</span></div>
					      <div class="en_pic">
						        <div class="en_img" id="picturesShow_preview" >
						        	<c:if test="${data.mallPro.picturesShow==''}">+</c:if>
						        	<c:if test="${data.mallPro.picturesShow!=''}"><img src='${data.mallPro.picturesShow}'></c:if>
						        </div>
					      </div>
					      <div class="en_imgtxt">图片仅支持JPG、GIF、PNG格式，大小不超过1MB</div>
				    </div>
			       <div class="en_in">
				      <div class="en_txt"><em>*</em><span>商品主图：</span></div>
				      <div class="en_pic">
						        <div class="en_img" id="imgOne_preview" >
						        	<c:if test="${data.mallPro.imgOne==''}">+</c:if>
						        	<c:if test="${data.mallPro.imgOne!=''}"><img src='${data.mallPro.imgOne}'></c:if>
						        </div>
				      </div>
				      <div class="en_pic">
						        <div class="en_img" id="imgTwo_preview" >
						        	<c:if test="${data.mallPro.imgTwo==''}">+</c:if>
						        	<c:if test="${data.mallPro.imgTwo!=''}"><img src='${data.mallPro.imgTwo}'></c:if>
						        </div>
				      </div>
				      <div class="en_pic">
						        <div class="en_img" id="imgThree_preview" >
						        	<c:if test="${data.mallPro.imgThree==''}">+</c:if>
						        	<c:if test="${data.mallPro.imgThree!=''}"><img src='${data.mallPro.imgThree}'></c:if>
						        </div>
				      </div>
				      <div class="en_pic">
						        <div class="en_img" id="imgFour_preview" >
						        	<c:if test="${data.mallPro.imgFour==''}">+</c:if>
						        	<c:if test="${data.mallPro.imgFour!=''}"><img src='${data.mallPro.imgFour}'></c:if>
						        </div>
				      </div>
				      <div class="en_pic">
						        <div class="en_img" id="imgFive_preview" >
						        	<c:if test="${data.mallPro.imgFive==''}">+</c:if>
						        	<c:if test="${data.mallPro.imgFive!=''}"><img src='${data.mallPro.imgFive}'></c:if>
						        </div>
				      </div>
				      <div class="en_imgtxt2">图片仅支持JPG、PNG格式，长宽比例1:1，<br/>大小不超过500K。最多上传5张图片</div>
				   </div>
				     <div class="en_in">
				         <div class="en_txt"><em>*</em><span>商品详情：</span></div>
				         <div class="en_edit" >
				         <div style="overflow: auto;width: 600px;height: 200px;">
				         ${data.mallPro.detailContent}
				         </div>
				         </div>
				     </div>
			  </div>

				<div class="com_list2" style="margin-top: 25px;">
			   <div class="com_title">库存/规格</div>
			   <div class="spec_table">
			   <form id="formNormName" action="" method="post">
			   	   <table id="tabId">
			   	   	<thead>
			   	   		<tr>
			   	   			<th class="spec_th1">${data.normName}</th><th>售价</th><th>原价</th><th>库存</th>
			   	   		</tr>
			   	   	</thead>
			   	   	<tbody>
			   	   <c:forEach items="${data.porVal}" var="item" varStatus="i">
						<tr>
							<td>
							<input type="hidden" name="porVal[${i.index}].id" value="${item.id}">
							<input type="text" name="porVal[${i.index}].proTypeName" value="${item.proTypeName}"></td>
							<td><input type="number" name="porVal[${i.index}].sellingPrice" value="${item.sellingPrice}"></td>
							<td><input type="number" name="porVal[${i.index}].originalPrice" value="${item.originalPrice}"></td>
							<td><input type="number" name="porVal[${i.index}].repertory" value="${item.repertory}"></td>
						</tr>
					</c:forEach>


					</tbody>
			   	   </table>
			   	 </form>
			   </div>
			</div>

        	<div class="com_list2" style="margin-top: 25px;">
		        <div class="com_title">物流运费</div>
		            <div class="en_in">
					      <div class="en_txt"><em>*</em><span>物流收取方式：</span></div>
					      <div class="en_sle">
					      	<select id="postPriceModelId" name="" style="width: 273px;">
					      		<option value="1" ${data.mallPro.postPriceModel==1?"checked='checked'":""} >同商家多个商品只收一次</option>
					      		<option value="2" ${data.mallPro.postPriceModel==2?"checked='checked'":""} >每件商品收一次邮费</option>
					      	</select>
					      </div>
				    </div>
				     <div class="en_in">
					    <div class="en_txt"><em>*</em><span>物流运费：</span></div>
					    <div class="en_redio">
					    	<label><input  type="radio" onchange="freightRmb(0)"  ${data.mallPro.postPrice<=0?"checked='checked'":""} name="logistics">免运费</label>
					    	<label><input  type="radio" onchange="freightRmb(${data.mallPro.postPrice})"  ${data.mallPro.postPrice>0?"checked='checked'":""}  name="logistics">运费</label>
					    	<label><input  type="number" id="postPriceId" name="postPrice" value="${data.mallPro.postPrice}" placeholder="请输入运费价格" class="en_log"></label>
					    </div>
				    </div>
		   </div>
		   <div class="en_but3" onclick=" location.href='${home}/mallPro/selList'; ">跳转到商品列表</div>

			</div>
		</div>
		<!--结束-->
	</div>
	<div class="clearfix"></div>
	<jsp:include page="/view/include/bottom.jsp"/>
	<iframe name = "uploadFileTarget"></iframe>
</body>
</html>