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
	<link rel="stylesheet" type="text/css" href="<%=path%>/ss/style.css">
</head>
<body>
	<jsp:include page="/view/include/top.jsp"  />
	<div class="page_box">
	<jsp:include page="/view/include/leftMenu.jsp"  />
		<!--主体开始strat-->
		<div class="main">
			<div class="place"><a href="#">订单管理</a>><a href="#">订单中心</a>><span class="index_on">订单详情</span></div>

			<!--流程进度strat-->
			<div class="clearfix"></div>
			<div class="good_state  mt_15">
				<ul>
					<li>订单状态：<span>${order.orderStateStr }</span></li>
					<li>订单金额：<span>${order.price }</span></li>
				</ul>
			</div>
			<div class="good_state_progress" style="margin-left: 300px;">
				<ul>
					<li class="yellow_line"><i class="right_icon right_icon_on"></i></li>
					<i class="right_icon2" style="left:280px;"></i>
				</ul>
			</div>
			<div class="good_state_txt" style="margin-left: 300px;">
				<ul>
					<li>
						<h2>订单提交</h2>
						<p>${order.createTimeStr }</p>
						<p>${orderReceiveDTO.contactName }完成付款</p>
					</li>
					<li></li>
					<li>
						<h2>取消订单</h2>
						<p>${order.createTimeStr }</p>
						<p>${orderReceiveDTO.contactName }完成付款</p>
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
		   		<p class="good_state_one">订单信息</p>
		   		<div class="shop_list_show">
					<p><span>订单编号：</span>${order.orderNo }</p>
				</div>
			</div>
			<div class="good_state mt_15">
		   		<p class="good_state_one">收货人信息</p>
			</div>
			<div class="shop_list_show">
				<p><span>买家账号：</span>${account }</p>
				<p><span>收款人：</span>${orderReceiveDTO.contactName }</p>
				<p><span>地址：</span>${orderReceiveDTO.detailAddress }</p>
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
</body>
</html>