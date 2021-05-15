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
	<title>商品信息</title>
	<link rel="stylesheet" type="text/css" href="<%=basePath%>css/base.css">
	<link rel="stylesheet" type="text/css" href="<%=basePath%>css/style.css">
	<script type="text/javascript" src="<%=basePath%>js/jquery-1.9.1.min.js"></script>
	<script type="text/javascript" src="<%=basePath%>time/WdatePicker.js"></script>
	<script type="text/javascript">
	Date.prototype.Format = function(format) {
		 var o = {
		  "M+" : this.getMonth() + 1, // month
		  "d+" : this.getDate(), // day
		  "h+" : this.getHours(), // hour
		  "m+" : this.getMinutes(), // minute
		  "s+" : this.getSeconds(), // second
		  "q+" : Math.floor((this.getMonth() + 3) / 3),
		  "S" : this.getMilliseconds()
		 // millisecond
		 }
		 if (/(y+)/.test(format))
		  format = format.replace(RegExp.$1, (this.getFullYear() + "")
		    .substr(4 - RegExp.$1.length));
		 for ( var k in o)
		  if (new RegExp("(" + k + ")").test(format))
		   format = format.replace(RegExp.$1, RegExp.$1.length == 1 ? o[k]
		     : ("00" + o[k]).substr(("" + o[k]).length));
		 return format;
		}
	$(function(){
		//选中切换样式
		$("#yuesel span").click(function(){
			$("#yuesel span").removeClass("f60");
			$(this).addClass("f60")
		});
		$("#prostate li").click(function(){
			$("#prostate li").removeClass("on");
			$(this).addClass("on")
		});
		$("#zhuanqu li").click(function(){
			$("#zhuanqu li").removeClass("on");
			$(this).addClass("on")
		});
		
		
	});
	
	
	//修改
	function upd(id){
		location.href="${home}/mallPro/detailEditShow?proId="+id;
	};
	//更新状态
	function updState(porId,state){
		try{
			$.ajax({
				  type: 'POST',
				  url: "${home}/mallPro/operationState",
				  data: {"proId":porId,"state":state},
				  dataType: "json",
				  success: function(data){
					  alert(data.message);
					  if(data.status=true){
						  location.reload();
					  }
				  }
				});
		}catch (e) {
			alert("操作失败，请稍后再试");
		}
	};
	//添加
	function add(id){
		location.href="${home}/view/commodity/commodityAdded1.jsp";
	};
	//查询
	function sel(){
		//开始日期
		var startDate=$("#d4311").val();
		//结束日期
		var endDate=$("#d4312").val();
		//商品状态：1:审核中 2:已上架 3:已下架 4:审核不通过
		var state=$("#prostate li.on").attr("type");
		//每页数量
		var pageSize=$("#pageSize").val();
		// 当前页
		var curPage=$("#page").val();
		location.href="${home}/mallPro/selList?startDate="+startDate+"&endDate="+endDate+"&state="+state+"&pageSize="+pageSize+"&curPage="+curPage;
	};
	
	//获取当前日期的上一个月
	function lastMonth(m){
		
		var begin=new Date();
		var end=new Date();
		new Date(begin.setMonth((new Date().getMonth()-m)));
		var begintime= begin.Format("yyyy-MM-dd");
		var endtime=end.Format("yyyy-MM-dd");
		$('#d4311').val(begintime);
		$('#d4312').val(endtime);
		
	}
	//商品软删除
	function proDel(proId){
		try{
			$.ajax({
				  type: 'POST',
				  url: "${home}/mallPro/proDel",
				  data: {"proId":proId},
				  dataType: "json",
				  success: function(data){
					  alert(data.message);
					  if(data.status=true){
						  location.reload();
					  }
				  }
				});
		}catch (e) {
			alert("操作失败，请稍后再试");
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
			  <span class="index_on">商品信息</span>
			</div>
			<div class="com_box">
				<div class="com_list">
				  <div class="com_lists">
					<div class="com_time">
						<div class="com_txt">发布时间</div>
						<div class="com_tinput"><input title="商品创建时间" type="text" id="d4311" class="Wdate" value="${paramData.startDate}" onFocus="WdatePicker({maxDate:'#F{$dp.$D(\'d4312\')||\'2020-10-01\'}'})"></div>
						<div class="com_tinput"><input title="商品创建时间" type="text" id="d4312" class="Wdate" value="${paramData.endDate}" onFocus="WdatePicker({minDate:'#F{$dp.$D(\'d4311\')}',maxDate:'2020-10-01'})"></div>
						<div class="com_t" id="yuesel"><span onclick="lastMonth(1)">最近1月</span><span onclick="lastMonth(3)">最近3月</span><span onclick="lastMonth(6)">近半年</span></div>
					</div>
					<div class="com_sta">
						<div class="com_txt">商品状态</div>
						<div class="com_entry" id="prostate">
							<ul>
								<li type="0" class="${paramData.state<=0?'on':''}">全部</li>
								<li type="1" class="${paramData.state==1?'on':''}">审核中</li>
								<li type="2" class="${paramData.state==2?'on':''}">已上架</li>
								<li type="3" class="${paramData.state==3?'on':''}">已下架</li>
								<li type="4" class="${paramData.state==4?'on':''}">审核不通过</li>
							</ul>
						</div><c:if test=""></c:if>
					</div>
				</div>
			  </div>
			  <div class="com_rlist">
			  	<div class="com_but1" onclick="sel()">查询</div>
			  	<div class="com_but2" onclick="add()">新增</div>
			  </div>
			</div>
           
           <div class="com_table">
           	  <table>
           	  	<thead>
           	  		<tr>
           	  			<th>商品缩略图</th><th>商品名称</th><th>已售总量</th><th>总库存</th><th>发布时间</th><th>状态</th><th>操作</th>
           	  		</tr>
           	  	</thead>
           	  	<tbody>
           	  		<c:forEach items="${dtos}" var="item">
           	  		<tr>
           	  			<td class="tab_img"><img src="${item.picturesShow}" alt=""></td>
           	  			<td class="tab_txt"><p>${item.shortTitle}</p></td>
           	  			<td>${item.soldCount}</td>
           	  			<td>${item.totalInventory}</td>
           	  			<td>${item.createTimeStr}</td>
           	  			<td>${item.stateStr}</td>
           	  			<td class="tab_span">
           	  				<!-- 1:审核中 2:已上架 3:已下架 4:审核不通过 -->
           	  				<c:if test="${item.state==1}">
	           	  				<span class="tab_span1" onclick="updState('${item.id}',3)">取消</span>
           	  					<span class="tab_span2" onclick="upd('${item.id}')">修改</span>
           	  					<span class="tab_span3" onclick="proDel('${item.id}')">删除</span>
	           	  			</c:if>
           	  				<c:if test="${item.state==2}">
	           	  				<span class="tab_span1" onclick="updState('${item.id}',3)">下架</span>
           	  					<span class="tab_span2" onclick="upd('${item.id}')">修改</span>
           	  					<span class="tab_span3" onclick="proDel('${item.id}')">删除</span>
	           	  			</c:if>
	           	  			<c:if test="${item.state==3}">
	           	  				<span class="tab_span1" onclick="updState('${item.id}',2)">上架</span>
           	  					<span class="tab_span2" onclick="upd('${item.id}')">修改</span>
           	  					<span class="tab_span3" onclick="proDel('${item.id}')">删除</span>
           	  				</c:if>
           	  				<c:if test="${item.state==4}">
           	  					<span class="tab_span1" onclick="updState('${item.id}',2)">上架</span>
           	  					<span class="tab_span2" onclick="upd('${item.id}')">修改</span>
           	  					<span class="tab_span3" onclick="proDel('${item.id}')">删除</span>
           	  				</c:if>
           	  				<c:if test="${item.state==0}">
           	  					<span class="tab_span1" onclick="updState('${item.id}',3)">取消</span>
           	  					<span class="tab_span2" onclick="upd('${item.id}')">修改</span>
           	  					<span class="tab_span3" onclick="proDel('${item.id}')">删除</span>
           	  				</c:if>
           	  			</td>
           	  		</tr>
           	  		</c:forEach>
           	  	</tbody>
           	  </table>
           </div>
           <div class="com_wh">
              <div class="com_whole">共12个商品</div>
              <div class="com_eve">每页显示<select id="pageSize">
              <option ${paramData.pageSize==10?"selected='selected'":""} value="10">10</option>
              <option ${paramData.pageSize==20?"selected='selected'":""} value="20">20</option>
              <option ${paramData.pageSize==30?"selected='selected'":""} value="30">30</option>
              </select>条</div>
              <div class="com_evt">第<input id="page" class="page_number" value="${paramData.page}" type="text">页</div>
              <div class="com_evt">共${paramData.totalPage}页</div>
              <div class="com_evs"><span class="com_prv" onclick="$('#page').val($('#page').val()*1-1);sel();"><em></em></span><span class="com_next" onclick="$('#page').val($('#page').val()*1+1);sel();"><em></em></span></div>
           </div>
		</div>
		<!--结束-->
	</div>
	<div class="clearfix"></div>
	<jsp:include page="/view/include/bottom.jsp"/>
</body>
</html>