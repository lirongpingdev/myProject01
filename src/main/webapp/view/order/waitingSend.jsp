<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>商家信息</title>
	<link rel="stylesheet" type="text/css" href="<%=path%>/css/base.css">
	<link rel="stylesheet" type="text/css" href="<%=path%>/css/index.css">
	<link rel="stylesheet" type="text/css" href="<%=path%>/css/style.css">
	
	<script type="text/javascript" src="<%=path%>/js/jquery-1.9.1.min.js"></script>
	<script type="text/javascript" src="<%=path%>/js/sellerEnter.js"></script>
	<script type="text/javascript">
	
	//物流公司选择
	function checkExpressName(){
		var len = getLength($("#expressName").val());
		if(len==0){
			$("#expressNameError").html("物流公司选择不能为空.");
			$("#expressName").focus();
			return false;
		}else{
			$("#expressNameError").html("");
		}
		return true;
	}
	
	//物流单号
	function checkExpressNo(){
		var len = getLength($("#expressNo").val());
		if(len==0){
			$("#expressNoError").html("物流单号不能为空.");
			$("#expressNo").focus();
			return false;
		}else{
			$("#expressNoError").html("");
		}
		return true;
	}
	
	//备注
	function checkRecordContent(){
		var len = getLength($("#recordContent").val());
		if(len==0){
			$("#recordContentError").html("备注不能为空.");
			$("#recordContent").focus();
			return false;
		}else if(len>2000){
			$("#recordContentError").html("备注信息最大为2000字符.");
		}else{
			$("#recordContentError").html("");
		}
		return true;
	}
	
	function addExpressInfo(){
		var param = {
				"expressName" : $("#expressName").val(),
				"expressNo" : $("#expressNo").val(),
				"recordContent" : $("#recordContent").val(),
				"id" : $("#orderId").val(),
				"orderNo" : $("#orderNo").val()
			}
		$.ajax({
			type : "post",
			url : "<%=path%>/express/addExpressInfo",
	        dataType:"json",      
	        data:param,
	        success:function(dt){
	        	var status = dt.status;
				if(status==0){
					window.location.href="<%=path %>/order/orderSendState?orderNo="+$("#orderNo").val()+"&state=3";
				}else{
					alert("System error,Msg=" + dt.message);
				}
			},
			error : function(data) {
				alert("System error,Msg=" + data.message);
			}
		});
	}
	
	function submitForm(){
		if(!checkExpressName()){
			return false;
		}
		if(!checkExpressNo()){
			return false;
		}
		if(!checkRecordContent()){
			return false;
		}
		addExpressInfo();
	}
	
	function uploadPic(obj) {
		$(obj).parent()[0].submit();
	}
	</script>
</head>
<body>
			<jsp:include page="/view/include/top.jsp"  />
	<div class="page_box">
	<jsp:include page="/view/include/leftMenu.jsp"  />
		<!--主体开始strat-->
		<div class="main">
		<input type="hidden" name="orderNo" id="orderNo" value="${order.orderNo }">
			<div class="place"><a href="#">订单管理</a>><a href="#">订单中心</a>><span class="index_on">订单详情</span></div>
			<!--提交申请strat-->
		   <div class="good_state">
		   		<p class="good_state_one">操作栏</p>
			</div>
			<div>
				<div class="en_in">
			      <div class="en_txt"><span>物流公司选择：</span></div>
			      <input type="text"  onchange="checkExpressName();" name="expressName"
					id="expressName" placeholder="请输入物流公司名称">
					<span class="error_yellow" id="expressNameError"></span>
			    </div>
			    
			   <div class="en_in">
			      <div class="en_txt"><span>物流单号：</span></div>
			      <input type="text" onchange="checkExpressNo();" name="expressNo"
					id="expressNo" placeholder="请输入物流单号">
					<span class="error_yellow" id="expressNoError"></span>
			    </div>
			   <!-- <div class="en_in">
			      <div class="en_txt"><span>上传凭证：</span></div>
			      <div class="en_pic">
			        <div class="en_img">+</div>
			        <input type="file" name="" value="">
			      </div>
			      <div class="en_txt_s mt_15">图片仅支持JPG、GIF、PNG格式，大小不超过1MB</div>
			    </div> -->
			    <div class="en_in">
				      <div class="en_txt"><span>备注：</span></div>
				      <textarea name="" onchange="checkRecordContent();" name="recordContent"
					id="recordContent" placeholder="请输入备注信息"></textarea>
					<span class="error_yellow" id="recordContentError"></span>
    			</div>
			    <div class="en_but en_but_on mf_265" onclick="submitForm();">确认发货</div>
	  		 </div>
			<!--流程进度strat-->
			<div class="clearfix"></div>
			<div class="good_state  mt_15">
				<ul>
					<li>订单状态：<span>${order.orderStateStr }</span></li>
					<li>订单金额：<span>${order.price }</span></li>
				</ul>
			</div>
			<div class="good_state_progress">
				<ul>
					<li  class="yellow_line"><i class="right_icon right_icon_on"></i></li>
					<li><i class="right_icon right_icon_on"></i></li>
					<li><i class="right_icon"></i></li>
					<li class="last"><i class="right_icon"></i></li>
				</ul>
			</div>
			<div class="good_state_txt">
				<ul>
					<li>
					<input name="orderId" id="orderId" type="hidden" value="${order.id} }" />
						<h2>订单提交</h2>
						<p>${order.createTimeStr }</p>
						<p>${orderReceiveDTO.contactName }提交订单</p>
					</li>
					<li></li>
					<li>
						<h2>完成付款</h2>
						<p>${order.createTimeStr }</p>
						<p>${orderReceiveDTO.contactName }完成付款</p>
					</li>
					<li></li>
					<li>
						<h2 class="color_ccc">卖家发货</h2>
						<!--到了发货步骤。。显示下面的代码
						<p>2017-04-01</p>
						<p>卖家已经发货</p>-->
					</li>
					<li></li>
					<li>
						<h2 class="color_ccc">买家收货</h2>
						<!--到了发货步骤。。显示下面的代码<p>2017-04-01</p>
						<p>买家确认收货</p>-->
					</li>
				</ul>
			</div>
			<ul class="shop_head">
				<li class="goods_head">商品</li>
				<li>价格</li>
				<li>数量</li>
				<li class="last">应付总额</li>
			</ul>
			<div class="clearfix"></div>
			<div class="shop_content">
				<div class="shop_content_left">
					<c:forEach items="${orderProducts}" var="o">
					<ul>
						<li class="goods">
							<img src="${o.logoUrl}" class="goods_img">
							<p>${o.shortTitle}</p>
							<h4>M码：黄色</h4>
						</li>
						<li class="yellow">${o.price}</li>
						<li>${o.buyCount }</li>
					</ul>
					</c:forEach>
				</div>
				<div class="shop_content_right">
					<h2>${productsTotalPrice }</h2>
					<p>(运费：${productsTotalPostPrice })</p>
				</div>
			</div>
		   <div class="good_state mt_15">
		   		<p class="good_state_one">付款详情</p>
			</div>
			<div class="shop_list_show">
				<p><span>看看动力交易流水号：</span>${orderPay.kankeTransNo }</p>
				<p><span>系统流水号：</span>${orderPay.transNo }</p>
				<p><span>实付金额：</span>${orderPay.price }</p>
			</div>
			<div class="good_state mt_15">
		   		<p class="good_state_one">订单信息</p>
			</div>
			<div class="shop_list_show">
				<p><span>订单编号：</span>${order.orderNo }</p>
			</div>
			<div class="good_state mt_15">
		   		<p class="good_state_one">收货人信息</p>
			</div>
			<div class="shop_list_show">
				<p><span>买家账号：</span>${order.account }</p>
				<p><span>收货人：</span>${orderReceiveDTO.contactName }</p>
				<p><span>地址：</span>${orderReceiveDTO.provinceName },${orderReceiveDTO.cityName },${orderReceiveDTO.districtName },${orderReceiveDTO.detailAddress }</p>
				<p><span>联系电话：</span>${ orderReceiveDTO.contactPhoneNo}</p>
			</div>
		</div><!--主体开始end-->
	</div>
	<div class="clearfix"></div>
	<div class="footer">
		<div class="copyright">	
		<p>粤ICP备17023251号  看客动力（深圳）有限公司</p>
		<p>Copyright © 2017 Peoplepower (Shenzhen) Technology Co. , Ltd. All Rights Reserved.</p>
	   </div>
	</div>
	
	<div hidden>
		<iframe name="uploadFileTarget"> </iframe>
	</div>
</body>
</html>