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
	<title>商品修改</title>
		<link rel="stylesheet" type="text/css" href="<%=path %>/css/base.css">
		<link rel="stylesheet" type="text/css" href="<%=path %>/css/style.css">
		<script type="text/javascript" src="<%=basePath%>js/jquery-1.9.1.min.js"></script>
			
		<script type="text/javascript">
		$(function(){
            
            (function($){
                $.fn.serializeJson=function(){
                    var serializeObj={};
                    var array=this.serializeArray();
                    var str=this.serialize();
                    $(array).each(function(){
                        if(serializeObj[this.name]){
                            if($.isArray(serializeObj[this.name])){
                                serializeObj[this.name].push(this.value);
                            }else{
                                serializeObj[this.name]=[serializeObj[this.name],this.value];
                            }
                        }else{
                            serializeObj[this.name]=this.value;    
                        }
                    });
                    return serializeObj;
                };
            })(jQuery);
            
        });
		//图片格式检测验证(还没确定)
		function isChenckFormat(v){
			return true;
			//var form=$(v);
			//var content = form.elements(0).value; 
			//alert(content);
		}
		//运费检查
		function freightRmb(v){
			try{
				$("#postPriceId").val(v);
			}catch (e) {
				$("#postPriceId").val(0);
			}
		}
		
		//提交前数据校正
		function ischeck(v){
			// 7、“商品简称不能为空”
			if(v["pro.shortTitle"].length<=0){ 
				alert("商品简称不能为空");
				return false;
			}
			// 8、“商品名称不能为空”
			if(v["pro.longTitle"].length<=0){ 
				alert("商品名称不能为空");
				return false;
			}
			// 9、“运费必须大于0元”
			if(v["pro.postPrice"].length<=0){ 
				alert("运费必须大于0元");
				return false;
			}
			
			// 1、“商品简称最长20个字符”
			if(v["pro.shortTitle"].length>20){ 
				alert("商品简称最长20个字符");
				return false;
			}
			// 2、“商品名称最长100个字符”
			if(v["pro.longTitle"].length>100){ 
				alert("商品简称最长20个字符");
				return false;
			}
			// 3、“请上传商品展示图“
			if(v["pro.picturesShow"].length==0){ 
				alert("请上传商品展示图");
				return false;
			}
			// 4、“请上传至少一张商品主图”
			if(v["pro.imgOne"].length==0&&v["pro.imgTwo"].length==0&&v["pro.imgThree"].length==0&&v["pro.imgFour"].length==0&&v["pro.imgFive"].length==0){
				alert("请上传至少一张商品主图");
				return false;
			}
			// 5、“图片格式不符合要求”
			
			// 6、“请填写商品详情”
			if(v["pro.detailContent"].length==0){ 
				alert("请填写商品详情");
				return false;
			}
			
			//检查规格个数
			var row=$("#tabId tbody tr").length;
			if(row<=0){
				alert("至少有一个规格值");
				return false;
			}
			
			return true;
		}
		
		//提交
		function sub() {
			var option = new Array();
			
			var paramsObj = $("#formNormName").serializeJson();
			//商品id
			paramsObj["pro.id"]=$("#proId").val();
			//商品简称
			paramsObj["pro.shortTitle"] = $("#shortTitleId").val();
			//商品名称
			paramsObj["pro.longTitle"] = $("#longTitleId").val();
			//物流运费
			paramsObj["pro.postPrice"] = $("#postPriceId").val();
			//物流收取方式
			paramsObj["pro.postPriceModel"] = $("#postPriceModelId").val();
			//商品展示图
			paramsObj["pro.picturesShow"] = $("#picturesShowId").val();
			//商品主图
			paramsObj["pro.imgOne"]= $("#imgOneId").val();
			paramsObj["pro.imgTwo"]= $("#imgTwoId").val();
			paramsObj["pro.imgThree"] = $("#imgThreeId").val();
			paramsObj["pro.imgFour"] = $("#imgFourId").val();
			paramsObj["pro.imgFive"] = $("#imgFiveId").val();
			//商品详情
			paramsObj["pro.detailContent"] = $("#detailContentId").html();
			
			if(!ischeck(paramsObj)){
				return false;
			};
			
			
			$.ajax({
				  type: 'POST',
				  url: "${home}/mallPro/updProStandard",
				  data: paramsObj,
				  dataType: "json",
				  success: function(data){
					 alert(data.message)
					 if(data.status==1){
						 //保存到缓存成功
						 location.href = "${home}/mallPro/commodityDetailShow?proId="+paramsObj["pro.id"]; 
					 }
				  }
				});
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
			  <span class="index_on">商品修改</span>
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
					      	<form id="picturesShowForm" action="http://120.77.40.10/php/newfile.php?callBackURL=${domain}view/commodity/fileUploadCallback.jsp?name=picturesShow" method="post" enctype="multipart/form-data" target="uploadFileTarget">
						        <div class="en_img" id="picturesShow_preview" >
						        	<c:if test="${data.mallPro.picturesShow==''}">+</c:if>
						        	<c:if test="${data.mallPro.picturesShow!=''}"><img src='${data.mallPro.picturesShow}'></c:if>
						        </div>
						        <input type="file" name="Filedata" value="Filedata" onchange="$('#picturesShowForm').submit();">
					        </form>
					        <input type="hidden" name="picturesShow" id="picturesShowId" value="${data.mallPro.picturesShow}">
					      </div>
					      <div class="en_imgtxt">图片仅支持JPG、GIF、PNG格式，大小不超过1MB</div>
				    </div>
			       <div class="en_in">
				      <div class="en_txt"><em>*</em><span>商品主图：</span></div>
				      <div class="en_pic">
				        <form onsubmit="return isChenckFormat(this);" id="imgOneForm" action="http://120.77.40.10/php/newfile.php?callBackURL=${domain}view/commodity/fileUploadCallback.jsp?name=imgOne" method="post" enctype="multipart/form-data" target="uploadFileTarget">
						        <div class="en_img" id="imgOne_preview" >
						        	<c:if test="${data.mallPro.imgOne==''}">+</c:if>
						        	<c:if test="${data.mallPro.imgOne!=''}"><img src='${data.mallPro.imgOne}'></c:if>
						        </div>
						        <input type="file" name="Filedata" value="Filedata" onchange="$('#imgOneForm').submit();">
					        </form>
					      <input type="hidden" name="imgOne" id="imgOneId" value="${data.mallPro.imgOne}">
				      </div>
				      <div class="en_pic">
				        <form id="imgTwoForm" action="http://120.77.40.10/php/newfile.php?callBackURL=${domain}view/commodity/fileUploadCallback.jsp?name=imgTwo" method="post" enctype="multipart/form-data" target="uploadFileTarget">
						        <div class="en_img" id="imgTwo_preview" >
						        	<c:if test="${data.mallPro.imgTwo==''}">+</c:if>
						        	<c:if test="${data.mallPro.imgTwo!=''}"><img src='${data.mallPro.imgTwo}'></c:if>
						        </div>
						        <input type="file" name="Filedata" value="Filedata" onchange="$('#imgTwoForm').submit();">
					        </form>
					      <input type="hidden" name="imgTwo" id="imgTwoId" value="${data.mallPro.imgTwo}">
				      </div>
				      <div class="en_pic">
				        <form id="imgThreeForm" action="http://120.77.40.10/php/newfile.php?callBackURL=${domain}view/commodity/fileUploadCallback.jsp?name=imgThree" method="post" enctype="multipart/form-data" target="uploadFileTarget">
						        <div class="en_img" id="imgThree_preview" >
						        	<c:if test="${data.mallPro.imgThree==''}">+</c:if>
						        	<c:if test="${data.mallPro.imgThree!=''}"><img src='${data.mallPro.imgThree}'></c:if>
						        </div>
						        <input type="file" name="Filedata" value="Filedata" onchange="$('#imgThreeForm').submit();">
					        </form>
					      <input type="hidden" name="imgThree" id="imgThreeId" value="${data.mallPro.imgThree}">
				      </div>
				      <div class="en_pic">
				        <form id="imgFourForm" action="http://120.77.40.10/php/newfile.php?callBackURL=${domain}view/commodity/fileUploadCallback.jsp?name=imgFour" method="post" enctype="multipart/form-data" target="uploadFileTarget">
						        <div class="en_img" id="imgFour_preview" >
						        	<c:if test="${data.mallPro.imgFour==''}">+</c:if>
						        	<c:if test="${data.mallPro.imgFour!=''}"><img src='${data.mallPro.imgFour}'></c:if>
						        </div>
						        <input type="file" name="Filedata" value="Filedata" onchange="$('#imgFourForm').submit();">
					        </form>
					      <input type="hidden" name="imgFour" id="imgFourId" value="${data.mallPro.imgFour}">
				      </div>
				      <div class="en_pic">
				        <form id="imgFiveForm" action="http://120.77.40.10/php/newfile.php?callBackURL=${domain}view/commodity/fileUploadCallback.jsp?name=imgFive" method="post" enctype="multipart/form-data" target="uploadFileTarget">
						        <div class="en_img" id="imgFive_preview" >
						        	<c:if test="${data.mallPro.imgFive==''}">+</c:if>
						        	<c:if test="${data.mallPro.imgFive!=''}"><img src='${data.mallPro.imgFive}'></c:if>
						        </div>
						        <input type="file" name="Filedata" value="Filedata" onchange="$('#imgFiveForm').submit();">
					        </form>
					      <input type="hidden" name="imgFive" id="imgFiveId" value="${data.mallPro.imgFive}">
				      </div>
				      <div class="en_imgtxt2">图片仅支持JPG、PNG格式，长宽比例1:1，<br/>大小不超过500K。最多上传5张图片</div>
				   </div>
				     <div class="en_in">
				         <div class="en_txt"><em>*</em><span>商品详情：</span></div>
				         <div class="en_edit"> 
				         	<div id="detailContentId"></div>
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
							<input disabled="disabled" type="text" name="porVal[${i.index}].proTypeName" value="${item.proTypeName}"></td>
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
					      		<option value="1" ${data.mallPro.postPriceModel==1?"selected = 'selected'":""} >同商家多个商品只收一次</option>
					      		<option value="2" ${data.mallPro.postPriceModel==2?"selected = 'selected'":""} >每件商品收一次邮费</option>
					      	</select>
					      </div>
				    </div>
				     <div class="en_in">
					    <div class="en_txt"><em>*</em><span>物流运费：</span></div>
					    <div class="en_redio">
					    	<label><input type="radio" onchange="freightRmb(0)"  ${data.mallPro.postPrice<=0?"checked='checked'":""} name="logistics">免运费</label>
					    	<label><input type="radio" onchange="freightRmb(${data.mallPro.postPrice})"  ${data.mallPro.postPrice>0?"checked='checked'":""}  name="logistics">运费</label>
					    	<label><input type="number" id="postPriceId" name="postPrice" value="${data.mallPro.postPrice}" placeholder="请输入运费价格" class="en_log"></label>
					    </div>
				    </div>
		   </div>
		   <div class="en_but3" onclick="sub()">保存</div>

			</div>
		</div>
		<!--结束-->
	</div>
	<div class="clearfix"></div>
	<jsp:include page="/view/include/bottom.jsp"/>
	<iframe name = "uploadFileTarget"></iframe>
	<link rel="stylesheet" type="text/css" href="<%=basePath%>umeditor/themes/default/css/umeditor.min.css" >
	<script type="text/javascript" src="<%=path%>/js/uploadify/jquery.uploadify.min.js"></script>
	<link rel="stylesheet" type="text/css" href="<%=path%>/js/uploadify/uploadify.css">
	<script type="text/javascript" charset="utf-8" src="<%=basePath%>umeditor/third-party/template.min.js"></script>
    <script type="text/javascript" charset="utf-8" src="<%=basePath%>umeditor/umeditor.config.js"></script>
    <script type="text/javascript" charset="utf-8" src="<%=basePath%>umeditor/umeditor.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>umeditor/lang/zh-cn/zh-cn.js"></script>
    <script type="text/javascript" src="<%=path%>/js/dist/jquery.validate.js?v=Math.random()"></script>
    <script type="text/javascript" src="<%=path%>/js/dist/localization/messages_zh.js?v=Math.random()"></script>
    <script type="text/javascript">
    var uploadFilePhpPath = "http://120.77.40.10";
	$(function() {
		var um = UM.getEditor('detailContentId', {
			initialFrameWidth : '598px',
			initialFrameHeight : 140,
			autoHeightEnabled : false,
			autoFloatEnabled : false,
			enableAutoSave : false
		});
		 
		var fileTypeExts = "*.*";
		var uploadPath = "<%=path%>";
		$("#proLogoImg").uploadify({
			'swf': uploadPath + '/js/uploadify/uploadify.swf',
			'fileTypeExts': fileTypeExts,
			'uploader': uploadFilePhpPath + '/php/file.php',
			'onUploadSuccess':function(file, data, res){
				var imgurl = uploadFilePhpPath + "/ad" + data;
				$("#logoUrl").val(imgurl);
			},
			'onSelect':function() {
			}
		});

		um.setContent('${data.mallPro.detailContent}',true);
		
		$(".editform").validate();
	});
</script>
</body>
</html>