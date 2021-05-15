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
	<title>商品销售报表</title>
	<link rel="stylesheet" type="text/css" href="<%=path%>/css/base.css">
	<link rel="stylesheet" type="text/css" href="<%=path%>/css/style.css">
	<link rel="stylesheet" type="text/css" href="<%=path%>/css/index.css">
</head>
<body>
		<jsp:include page="/view/include/top.jsp"  />
	<div class="page_box">
	<jsp:include page="/view/include/leftMenu.jsp"  />
		<!--中间主体内容-->
		<div class="main">
			<div class="place">
			  <a href="#">交易统计</a>
			  >
			  <span class="index_on">商品销售报表</span>
			</div>
	<div class="com_box4">
				<div class="com_list">
				  <div class="com_lists">
					<div class="com_time">
						<div class="com_txt">时间</div>
						<div class="com_tinput"><input type="text"></div>
						<div class="com_tinput"><input type="text"></div>
						<div class="com_t"><span class="f60">本周</span><span>上周</span><span>本月</span><span>上月</span></div>
					</div>
		
					<div class="com_time" style="margin-top: 15px;">
						<div class="com_txt">分类</div>
						<div class="com_tsel">
							<select name="">
								<option value="请选择商品分类">请选择商品分类</option>
							</select>
						</div>						
					</div>
				</div>
			  </div>
			  <div class="com_rlist" style="margin-top: 35px;">
			  	<div class="com_but1" style="margin-left: 75px;">下载</div>
			  </div>
			</div>
            <div class="tr_box">
                <ul>
            	    <li>
            	        <div class="tr_t"><span>订单数量</span><span>退回数量</span></div>
            	        <div class="tr_num"><span>1792笔</span><span>1笔</span></div>
            	    </li>
            	    <li>
            	    	 <div class="tr_t"><span>订单总额(元)</span><span>退货金额(元)</span></div>
            	         <div class="tr_num"><span>1792.64</span><span>455.00</span></div>
            	    </li>
            	    <li>
            	    	  <div class="tr_t"><span>金额合计(元)</span></div>
            	       <div class="tr_num"><span>1792.64</span></div>
            	    </li>
            	</ul>
            </div>
            <div class="tr_time"><span>日期：</span>2017-04-05 — 2017-04-11</div>
           <div class="com_table">
           	  <table>
           	  	<thead>
           	  		<tr>
           	  			<th>商品名称</th><th>商品分类</th><th>购买数量</th><th>退货数量</th>
           	  			<th>购买金额</th><th>退货金额</th><th>金额小计</th><th>下单时间</th>
           	  		</tr>
           	  	</thead>
           	  	<tbody>
           	  		<tr>
           	  			<td class="td_txt"><div>商品名称商品名称商品名称商品名称商品名称商品名称商品名</div></td>	
           	  			<td>运动建材</td>
           	  			<td>47554</td>
           	  			<td>15</td>
           	  			<td>2488.00</td>
           	  			<td>2488.00</td>
           	  			<td>2488.00</td>
           	  			<td>2017-03-20 12：20</td>
           	  		</tr>
           	  		<tr>
           	  			<td class="td_txt"><div>商品名称商品名称商品名称商品名称商品名称商品名称商品名</div></td>
           	  			<td>运动建材</td>
           	  			<td>47554</td>
           	  			<td>15</td>
           	  			<td>2488.00</td>
           	  			<td>2488.00</td>
           	  			<td>2488.00</td>
           	  			<td>2017-03-20 12：20</td>
           	  		</tr>
           	  	</tbody>
           	  </table>
           </div>

           <div class="com_wh">
              <div class="com_whole">共12个商品</div>
              <div class="com_eve">每页显示<span>10<em></em></span>条</div>
              <div class="com_evt">第<span></span>页</div>
              <div class="com_evt">共2页</div>
              <div class="com_evs"><span class="com_prv"><em></em></span><span class="com_next"><em></em></span></div>
           </div>
		</div>
		<!--结束-->
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