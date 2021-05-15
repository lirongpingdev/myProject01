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
	<title>交易款项报表</title>
	<link rel="stylesheet" type="text/css" href="<%=path%>/css/base.css">
	<link rel="stylesheet" type="text/css" href="<%=path%>/css/style.css">
	
	<script type="text/javascript" src="<%=path%>/js/jquery-1.9.1.min.js"></script>
	<script type="text/javascript" src="<%=path%>/js/page.js"></script>
	<script type="text/javascript" src="<%=path%>/js/tool.js"></script>
	
	<script type="text/javascript">

	function ExportXlsTable(strXlsName, exportGrid, url) {
		if($.trim(url) == "") {
			url = "<%=path%>/donwload/tranMoney";
		}
		var f = $("<form action='" + url + "' method='post' id='fm1'></form>");
		var i = $("<input type='hidden' id='txtContent' name='txtContent' />");
		var l = $("<input type='hidden' id='txtName' name='txtName' />");
		i.val("<table>"+exportGrid+"</table>");
		i.appendTo(f);
		l.val(strXlsName);
		l.appendTo(f);
		f.appendTo(document.body).submit();
		document.body.removeChild(f);
	}
	
		function prePage(){
			goPrePage();
			queryAccount();
		}
		
		function nextPage(){
			goNextPage();
			queryAccount();
		}
      
		function selectSettle(obj) {
			$(obj).addClass("on");
			$(obj).siblings().removeClass();
		}

		function selectConfirm(obj) {
			$(obj).addClass("on");
			$(obj).siblings().removeClass();
		}

		function queryAccount() {
			var param = {
				"accoutNo" : $("#accoutNo").val(),
				"settleStatus" : $("#settleStatus li[class=on]").attr("id"),
				"confirmStatus" : $("#confirmStatus li[class=on]").attr("id"),
				"page" : $("#page").val(),
				"pageSize" : $("#pageSize").val()
			}

			$.ajax({
				type : "post",
				url : "<%=path%>/report/transactionMoneyBy",
	            dataType:"json",      
	            data:param,
	            success:function(dt){
			            if(dt.status!=0){
			            	alert("error:"+dt.message);
			            }
						var jsoons = dt.data;
	                   var datas = eval(jsoons);
	                   $("#totalCount").html(dt.totalCount);
	                   $("#totalCountV").val(dt.totalCount);
	                   $("#totalPage").html(dt.totalPage);
	                   $("#totalPageV").val(dt.totalPage);
	                   var str = "";
						for(var i=0;i<datas.length;i++){
							str +="<tr>";
							str +="<td>"+checkNullStr(datas[i].beginTimeStr)+"</td>";
							str +="<td>"+checkNullStr(datas[i].endTimeStr)+"</td>";
							str +="<td title=\""+datas[i].accoutNo+"\"><div class=\"over_flow\">"+""+datas[i].accoutNo+"</div></td>";
							str +="<td>"+datas[i].orderQty+"</td>";
							str +="<td>"+datas[i].needPay+"</td>";
							str +="<td>"+datas[i].salesAmt+"</td>";
							if(datas[i].confirmStatus==1){
								str +="<td>待确认</td>";
							}else if(datas[i].confirmStatus==2){
								str +="<td>同意</td>";
							}else if(datas[i].confirmStatus==3){
								str +="<td>不同意</td>";
							}
							
							if(datas[i].settleStatus==1){
								str +="<td>未结算</td>";
							}else{
								str +="<td>已结算</td>";
							}
							
							if(datas[i].confirmStatus==1){
								str +="<td><a href=<%=path%>/report/sellerConfirmTable?id="+datas[i].id+"&accoutNo="+datas[i].accoutNo+">立即确认</a></td>";
							}else{
								str +="<td><a href=<%=path%>/report/toTransactioDnetails?id="+datas[i].id+"&accoutNo="+datas[i].accoutNo+">查看明细</a></td>";
							}
							str +="</tr>";
						}
						$("#tableBodyInfo").html(str);
	            }, 
	            error : function(data) {
	            	alert("System error,Msg="+data.message);
				}
	         }); 
	    }
		
		$(function(){
			queryAccount();
		});
	</script>
</head>
<body >
	<jsp:include page="/view/include/top.jsp"  />
	<div class="page_box">
	<jsp:include page="/view/include/leftMenu.jsp"  />
		<!--中间主体内容-->
		<div class="main">
			<div class="place">
			  <a href="#">交易统计</a>
			  <span class="index_on">交易款项报表</span>
			</div>
			<div class="com_box">
				<div class="com_list">
				  <div class="com_lists">
					<div class="com_sta">
						<div class="com_txt">结算状态</div>
						<div id="settleStatus" class="com_entry">
							<ul>
								<li id="3" class="on" onclick="selectSettle(this);" >全部</li>
								<li id="1" onclick="selectSettle(this);" >未结算</li>
								<li id="2" onclick="selectSettle(this);" >已结算</li>
							</ul>
						</div>
					</div>
					<div class="com_area">
						<div class="com_txt">确认状态</div>
						<div id="confirmStatus" class="com_entry com_li2">
							<ul>
								<li id="4"  class="on" onclick="selectConfirm(this);">全部</li>
								<li id="1"  onclick="selectConfirm(this);">待确认</li>
								<li id="2"  onclick="selectConfirm(this);">同意</li>
								<li id="3"  onclick="selectConfirm(this);">不同意</li>
							</ul>
						</div>
					</div>
					<div class="com_time" style="margin-top: 15px;">
						<div class="com_txt">账单编号</div>
						<div class="com_tinput"><input type="text" name="accoutNo" id="accoutNo"></input></div>						
					</div>
				</div>
			  </div>
			  <div class="com_rlist">
			  	<div class="com_but1" onclick="queryAccount();">查询</div>
			  	<!-- <div class="com_but2">下载</div> -->
			  	<div class="com_but2"><a href="javascript:void(0);" onclick="ExportXlsTable('tranMoney', $('#tableId').html())" group="" id="">下载</a></div>
			  </div>
			</div>
           
           <div class="com_table">
           	  <table id="tableId">
           	  	<thead>
           	  		<tr>
           	  			<th>结算开始时间</th><th>结算截止时间</th><th>账单编号</th><th>订单数量</th>
           	  			<th>应结款</th><th>销售额</th><th>商家确认状态</th><th>结算状态</th><th>操作</th>
           	  		</tr>
           	  	</thead>
           	  	<tbody id="tableBodyInfo">
           	  		
           	  	</tbody>
           	  </table>
           </div>

            <div class="com_wh">
              <div class="com_whole">共<span id="totalCount"></span>条</div>
              <input name="totalCountV" id="totalCountV" type="hidden" value="" />
              <input name="totalPageV" id="totalPageV" type="hidden" value="" />
              <div class="com_eve">
              	每页显示
              	<select id="pageSize">
              		<option value ="10" selected="selected">10</option>
              		<option value ="20">20</option>
                </select>条
              </div>
              <div class="com_evt">第<input type="text" id="page" name="page" value="1" class="page_number">页</div>
              <div class="com_evt" >共<span id="totalPage"></span>页</div>
              <div class="com_evs"><span class="com_prv" onclick="prePage();"><em></em></span>
              <span class="com_next" onclick="nextPage();"><em></em></span></div>
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