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
<title>订单管理</title>
<link rel="stylesheet" type="text/css" href="<%=path%>/css/base.css">
<link rel="stylesheet" type="text/css" href="<%=path%>/css/style.css">
<script type="text/javascript" src="<%=path%>/js/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="<%=path%>/js/time/WdatePicker.js"></script>
<script type="text/javascript" src="<%=path%>/js/page.js"></script>
<script type="text/javascript" src="<%=path%>/js/tool.js"></script>
<script type="text/javascript">

function ExportXlsTable(strXlsName, exportGrid, url) {
	if($.trim(url) == "") {
		url = "<%=path%>/donwload/orderInfo";
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

function downLoadOrderInfo(){
	var url= "<%=path%>/donwload/orders?endTime=" + $("#endTime").val()
				+ "&beginTime=" + $("#beginTime").val() + "&orderNo="
				+ $("#orderNo").val() + "&customerName="
				+ $("#customerName").val() + "&orderState="
				+ $("#orderState li[class=on]").attr("id") + "&page="
				+ $("#page").val() + "&pageSize=" + $("#pageSize").val();
	
		location.href=url;
	}

	function prePage() {
		goPrePage();
		queryOrderList();
	}

	function nextPage() {
		goNextPage();
		queryOrderList();
	}

	function getNMonth() {
		var month = $("#queryMonth span[class=f60]").attr("id");
		$.ajax({
			type : "Get",
			url : "<%=path%>/order/getNMothDate/"+month,
        dataType:"json",      
        data:null,
        success:function(dt){
			var obj = dt.data;
			$("#beginTime").val(obj.beginDate);
			$("#endTime").val(obj.endDate);
        }, 
        error : function(data) {
        	alert("System error,Msg="+data.msg);
		}
     }); 
}

function selectMonth(obj){
	 $(obj).addClass("f60");
	  $(obj).siblings().removeClass();
	  getNMonth();
}

function selectOrderState(obj){
	  $(obj).addClass("on");
	  $(obj).siblings().removeClass();
	 
}

function queryOrderList(){
	var param = {
			"endTime" : $("#endTime").val(),
			"beginTime" : $("#beginTime").val(),
			"orderNo" : $("#orderNo").val(),
			"customerName" : $("#customerName").val(),
			"orderState" : $("#orderState li[class=on]").attr("id"),
			"page" : $("#page").val(),
			"pageSize" : $("#pageSize").val()
		}
	
	$.ajax({
		type : "post",
		url : "<%=path%>/order/getOrderList",
        dataType:"json",      
        data:param,
        success:function(dt){
        	if(dt.status!=0){
        		$("#tableBodyInfo").html('');
        		alert("System error,Msg="+dt.message);
        	}
			var msg = dt.message;
            $("#totalCount").html(dt.totalCount);
            $("#totalCountV").val(dt.totalCount);
            $("#totalPage").html(dt.totalPage);
            $("#totalPageV").val(dt.totalPage);
            
			var jsoons = dt.data;
           var datas = eval(jsoons);
           var str = "";
           if(datas.length == 0){
        	   $("#tableBodyInfo").html('');
        	   return;
           }
			for(var i=0;i<datas.length;i++){
				str +="<tr>";
				/* str +="<td title=\""+datas[i].orderNo+"\">"+datas[i].orderNo.substr(0,6)+"...</td>"; */
				str +="<td title=\""+datas[i].orderNo+"\"><div class=\"over_flow\">'"+datas[i].orderNo+"</div></td>";
				str +="<td>"+checkNullStr(datas[i].price)+"</td>";
				str +="<td>"+checkNullStr(datas[i].postPrice)+"</td>";
				
				if(datas[i].payState==1 || datas[i].payState==3){
					str +="<td>待付款</td>";
				}else if(datas[i].payState==2 && datas[i].sendGoodsState==1){
					str +="<td>立即发货</td>";
				}else if(datas[i].payState==2 && datas[i].sendGoodsState==2){
					str +="<td>待收货</td>";
				}else if(datas[i].payState==2 && datas[i].sendGoodsState==3){
					str +="<td>交易成功</td>";
				}else{
					str +="<td>交易关闭</td>";
				}
				
				str +="<td>"+checkNullStr(datas[i].customerName)+"</td>";
				str +="<td>"+checkNullStr(datas[i].customerPhone)+"</td>";
				str +="<td>"+checkNullStr(datas[i].memberCreateTimeStr)+"</td>";
				str +="<td>"+checkNullStr(datas[i].payTimeStr)+"</td>";
				
				if(datas[i].payState==1 || datas[i].payState==3){
					str +="<td><a href=<%=path %>/order/orderSendState?orderNo="+datas[i].orderNo+"&state=1>查看详请</a></td>";
				}else if(datas[i].payState==2 && datas[i].sendGoodsState==1){
					str +="<td><a href=<%=path %>/order/orderSendState?orderNo="+datas[i].orderNo+"&state=2>立即发货</a></td>";
				}else if(datas[i].payState==2 && datas[i].sendGoodsState==2){
					str +="<td><a href=<%=path %>/order/orderSendState?orderNo="+datas[i].orderNo+"&state=3>查看详请</a></td>";
				}else if(datas[i].payState==2 && datas[i].sendGoodsState==3){
					str +="<td><a href=<%=path %>/order/orderSendState?orderNo="+datas[i].orderNo+"&state=4>查看详请</a></td>";
				}else{
					str +="<td><a href=<%=path %>/order/orderSendState?orderNo="+datas[i].orderNo+"&state=5>查看详请</a></td>";
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
	queryOrderList();
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
				<a href="#">商品管理</a> > <span class="index_on">订单中心</span>
			</div>
			<div class="com_box">
				<div class="com_list">
					<div class="com_lists">
						<div class="com_time">
							<div class="com_txt">下单时间</div>
							<div class="com_tinput">
								<input type="text" id="beginTime" class="Wdate" onfocus="WdatePicker({maxDate:'#F{$dp.$D(\'beginTime\')||\'2020-10-01\'}'})">
							</div>
							<div class="com_tinput">
							<input type="text" id="endTime" class="Wdate" onfocus="WdatePicker({minDate:'#F{$dp.$D(\'endTime\')}',maxDate:'2020-10-01'})">
							</div>
							<div class="com_t" id="queryMonth">
								<span id="1" onclick="selectMonth(this);"  class="f60">最近1月</span>
								<span id="3" onclick="selectMonth(this);">最近3月</span>
								<span id="6" onclick="selectMonth(this);">近半年</span>
							</div>
						</div>
						<div class="com_sta">
							<div class="com_txt">订单状态</div>
							<div class="com_entry" id="orderState">
								<ul>
									<li class="on" id="6" onclick="selectOrderState(this);" >全部</li>
									<li id="1" onclick="selectOrderState(this);" >待付款</li>
									<li id="2" onclick="selectOrderState(this);" >待发货</li>
									<li id="3" onclick="selectOrderState(this);" >待收货</li>
									<li id="4" onclick="selectOrderState(this);" >交易成功</li>
									<li id="5" onclick="selectOrderState(this);"> 交易关闭</li>
								</ul>
							</div>
						</div>
						<div class="com_time" style="margin-top: 15px;">
							<div class="com_txt">订单编号</div>
							<div class="com_tinput">
								<input type="text" id="orderNo">
							</div>
							<div class="com_txt" style="margin-left: 15px;">客户姓名</div>
							<div class="com_tinput">
								<input type="text" id="customerName">
							</div>
						</div>
					</div>
				</div>
				<div class="com_rlist">
					<div class="com_but1" onclick="queryOrderList();">查询</div>
					<!-- <div class="com_but2" onclick="downLoadOrderInfo();">下载</div> -->
					<div class="com_but2">
					<a href="javascript:void(0);" onclick="ExportXlsTable('orderInfo', $('#tableId').html())" group="" id="">下载</a>
					</div>
				</div>
			</div>

			<div class="com_table">
				<table id="tableId">
					<thead>
						<tr>
							<th>订单编号</th>
							<th>总金额</th>
							<th>运费</th>
							<th>状态</th>
							<th>客户姓名</th>
							<th>客户电话</th>
							<th>下单时间</th>
							<th>付款时间</th>
							<th>操作</th>
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
			<p>粤ICP备17023251号 看客动力（深圳）有限公司</p>
			<p>Copyright © 2017 Peoplepower (Shenzhen) Technology Co. , Ltd.
				All Rights Reserved.</p>
		</div>
	</div>
</body>
</html>