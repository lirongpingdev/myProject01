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
	<title>交易统计商家确认</title>
	<link rel="stylesheet" type="text/css" href="<%=path%>/css/base.css">
	<link rel="stylesheet" type="text/css" href="<%=path%>/css/style.css">
	<link rel="stylesheet" type="text/css" href="<%=path%>/css/index.css">
	<script type="text/javascript" src="<%=path%>/js/jquery-1.9.1.min.js"></script>
	<script type="text/javascript" src="<%=path%>/js/page.js"></script>
	<script type="text/javascript" src="<%=path%>/js/tool.js"></script>
	<script type="text/javascript">
	
		function prePage(){
			goPrePage();
			queryDetails();
		}
		
		function nextPage(){
			goNextPage();
			queryDetails();
		}
	
		function updateConfirmStatus() {
			var param = {
				"id" : $("#accountId").val(),
				"confirmStatus" : $('input:radio[name="confirmStatus"]:checked').val(),
				"accoutNo" : $("#accoutNo").val()
			}
			$.ajax({
				type : "post",
				url : "<%=path%>/report/updateConfirm",
	            dataType:"json",      
	            data:param,
	            success:function(dt){
			        if(dt.status!=0){
			        	alert("System error,MSg="+data.message);
			        }
	            }, 
	            error : function(data) {
	            	alert("Request error,MSg="+data.message);
				}
         }); 
	  }
		
		function queryTranMoney(){
			var param = {
					"accoutNo" : $("#accoutNo").val(),
					"id" : $("#accountId").val()
				}
			$.ajax({
				type : "post",
				url : "<%=path%>/report/getTranMoney",
	            dataType:"json",      
	            data:param,
	            success:function(dt){
					   if(dt.status!=0){
							alert("System error,msg="+dt.message);
					   }
					   var dto = dt.data;
	                   var datas = eval(dto);
	                   var str = "";
	                   str +="<p><span>结算开始时间：</span>"+checkNullStr(datas.beginTimeStr)+"</p>";
						str +="<p><span>结算截止时间：</span>"+checkNullStr(datas.endTimeStr)+"</p>";
						str +="<p><span>账单编号：</span>"+checkNullStr(datas.accoutNo)+"</p>";
						str +="<p><span>订单数量：</span>"+checkNullStr(datas.orderQty)+"</p>";
						str +="<p><span>应结款：</span>"+checkNullStr(datas.needPay)+"</p>";
						str +="<p><span>销售额：</span>"+checkNullStr(datas.salesAmt)+"</p>";
						if(datas.confirmStatus==1){
							str +="<p><span>商家确认状态：</span>待确认</p>";
						}else if(datas.confirmStatus==2){
							str +="<p><span>商家确认状态：</span>同意</p>";
							$("#confirmStatus2").attr("checked","checked");
						}else if(datas.confirmStatus==3){
							str +="<p><span>商家确认状态：</span> 不同意</p>";
							$("#confirmStatus3").attr("checked","checked");
						}
						
						if(datas.settleStatus==1){
							$("#settleStatus").html("未结算");
						}else if(datas.settleStatus==2){
							$("#settleStatus").html("已结算");
						}
						
						$("#needPay").html(datas.needPay);
						
						$("#sohwTranMoney").html(str);
	            }, 
	            error : function(data) {
	            	alert("Request error,staus="+data.status+",error:"+data.message);
				}
	         }); 
		}
		
		function queryDetails(){
			var param = {
					"accoutNo" : $("#accoutNo").val(),
					"page" : $("#page").val(),
					"pageSize" : $("#pageSize").val()
				}
			
			$.ajax({
				type : "post",
				url : "<%=path%>/report/tranMoneyDetailsBy",
	            dataType:"json",      
	            data:param,
	            success:function(dt){
			            if(dt.status!=0){
			            	alert("error:"+dt.message);
			            }
						var jsoons = dt.data;
						$("#totalCount").html(dt.totalCount);
	                   $("#totalCountV").val(dt.totalCount);
	                   $("#totalPage").html(dt.totalPage);
	                   $("#totalPageV").val(dt.totalPage);
	                   var datas = eval(jsoons);
	                   var str = "";
						for(var i=0;i<datas.length;i++){
							str +="<tr>";
							str +="<td>"+checkNullStr(datas[i].orderNo)+"</td>";
							str +="<td>"+checkNullStr(datas[i].totalAmt)+"</td>";
							str +="<td>"+checkNullStr(datas[i].postAmt)+"</td>";
							str +="<td>"+checkNullStr(datas[i].realAmt)+"</td>";
							if(datas[i].orderState==1){
								str +="<td> 正常</td>";
							}else if(datas[i].orderState==2){
								str +="<td> 已取消</td>";
							}else if(datas[i].orderState==3){
								str +="<td>退换货</td>";
							}else if(datas[i].orderState==4){
								str +="<td> 已取消后删除</td>";
							}else if(datas[i].orderState==5){
								str +="<td>已收货情况下删除</td>";
							}
							str +="<td>"+checkNullStr(datas[i].customerName)+"</td>";
							str +="<td>"+checkNullStr(datas[i].customerPhone)+"</td>";
							str +="<td>"+checkNullStr(datas[i].orderTimeStr)+"</td>";
							str +="</tr>";
						}
						$("#tableBodyInfo").html(str);
						
	            }, 
	            error : function(data) {
	            	alert("error:"+data.msg);
				}
	         }); 
		}
		
	$(function(){
			queryTranMoney();
			queryDetails();
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
			  <a href="#">交易统计</a>
			  >
			   <a href="#">交易款项报表</a>
			  >
			  <span class="index_on">账单明细</span>
			</div>
			<div class="good_state mt_15">
			   <p class="good_state_one">操作栏</p>
			</div>
			<div class="good_state2 mt_15">
			   <p class="good_state_one">请商家认真核对结算账单明细，若您不同意改账单，可联系客服：18344296909</p>
			</div>
			<div class="tr_type">
				<div class="tr_txt">可选操作类型：</div>
				<div><label><input type="radio" name="confirmStatus" id="confirmStatus2" value="2">同意该账单</label></div>
				<div><label><input type="radio" name="confirmStatus" id="confirmStatus3" value="3">不同意该账单</label></div>
			</div>
			<div class="tr_button" onclick="updateConfirmStatus();">确定</div>
			<div class="good_state  mt_15">
			<input type="hidden" id="accoutNo" value="${accoutNo}">
			<input type="hidden" id="accountId" value="${accountId}">
				<ul>
					<li>结算状态：<span id="settleStatus"></span></li>
					<li>应结款：<span id="needPay"></span></li>
					<li class="good_xz">↓下载全部</li>
				</ul>
			</div>
			<div class="shop_list_show2" id="sohwTranMoney">
				
			</div>
           
           <div class="com_table" >
           	  <table>
           	  	<thead>
           	  		<tr>
           	  			<th>订单编号</th><th>总金额</th><th>运费</th><th>实付金额</th>
           	  			<th>状态</th><th>客户姓名</th><th>客户电话</th><th>下单时间</th>
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