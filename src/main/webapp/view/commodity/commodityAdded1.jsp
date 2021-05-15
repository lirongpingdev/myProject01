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
	<title>新增商品第一步</title>
	<link rel="stylesheet" type="text/css" href="<%=basePath%>css/base.css">
	<link rel="stylesheet" type="text/css" href="<%=basePath%>css/style.css">
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
		if(v.shortTitle.length<=0){ 
			alert("商品简称不能为空");
			return false;
		}
		// 8、“商品名称不能为空”
		if(v.longTitle.length<=0){ 
			alert("商品名称不能为空");
			return false;
		}
		// 9、“运费必须大于0元”
		if(v.postPrice.length<=0){ 
			alert("运费必须大于0元");
			return false;
		}
		
		// 1、“商品简称最长20个字符”
		if(v.shortTitle.length>20){ 
			alert("商品简称最长20个字符");
			return false;
		}
		// 2、“商品名称最长100个字符”
		if(v.longTitle.length>100){ 
			alert("商品简称最长20个字符");
			return false;
		}
		// 3、“请上传商品展示图“
		if(v.picturesShow.length==0){ 
			alert("请上传商品展示图");
			return false;
		}
		// 4、“请上传至少一张商品主图”
		if(v.imgOne.length==0&&v.imgTwo.length==0&&v.imgThree.length==0&&v.imgFour.length==0&&v.imgFive.length==0){
			alert("请上传至少一张商品主图");
			return false;
		}
		// 5、“图片格式不符合要求”
		
		// 6、“请填写商品详情”
		if(v.detailContent.length==0){ 
			alert("请填写商品详情");
			return false;
		}
		
		return true;
	}
	
	//提交
	function sub() {
		var paramsObj = {};
		//商品简称
		paramsObj.shortTitle = $("#shortTitleId").val();
		//商品名称
		paramsObj.longTitle = $("#longTitleId").val();
		//物流运费
		paramsObj.postPrice = $("#postPriceId").val();
		//物流收取方式
		paramsObj.postPriceModel = $("#postPriceModelId").val();
		//商品展示图
		paramsObj.picturesShow = $("#picturesShowId").val();
		//商品主图
		paramsObj.imgOne = $("#imgOneId").val();
		paramsObj.imgTwo= $("#imgTwoId").val();
		paramsObj.imgThree = $("#imgThreeId").val();
		paramsObj.imgFour = $("#imgFourId").val();
		paramsObj.imgFive = $("#imgFiveId").val();
		//商品详情
		paramsObj.detailContent = $("#detailContentId").html();
		
		if(!ischeck(paramsObj)){
			return false;
		};
		
		
		$.ajax({
			  type: 'POST',
			  url: "${home}/mallPro/addCachePro",
			  data: paramsObj,
			  dataType: "json",
			  success: function(data){
				 alert(data.message)
				 if(data.status==1){
					 //保存到缓存成功
					 location.href = "commodityAdded2.jsp"; 
				 }
			  }
			});
	}
	</script>
</head>
<body>
<jsp:include page="/view/include/top.jsp"/>
	<div class="page_box">
		<jsp:include page="/view/include/leftMenu.jsp"/>
		<!--中间主体内容-->
		<div class="main">
			<div class="place">
			  <a href="#">商品管理</a>
			  >
			  <a href="#">商品信息</a>
			  >
			  <span class="index_on">新增商品</span>
			</div>
			<div class="com_box2">
			  <div class="add_img1"></div>
				<div class="com_list2">
				   <div class="com_title">基本信息</div>
				    <div class="en_in">
					      <div class="en_txt"><em>*</em><span>商品简称：</span></div>
					      <input type="text" id="shortTitleId" name="shortTitle" value="" placeholder="请填写商品简称">
				    </div>
				    <div class="en_in">
					      <div class="en_txt"><em>*</em><span>商品名称：</span></div>
					      <input type="text" id="longTitleId" name="longTitle" value="" placeholder="请填写商品名称">
				    </div>
				    <div class="en_in">
					    <div class="en_txt"><em>*</em><span>物流运费：</span></div>
					    <div class="en_redio">
					    	<label><input type="radio" onchange="freightRmb(0)"   value="0" checked="checked" name="logistics">免运费</label>
					    	<label><input type="radio" onchange="freightRmb(6)"   value="6" name="logistics">运费</label>
					    	<label><input type="number" id="postPriceId" name="postPrice" value="0" placeholder="请输入运费价格" class="en_log"></label>
					    </div>
				    </div>
				     <div class="en_in">
					      <div class="en_txt"><em>*</em><span>物流收取方式：</span></div>
					      <div class="en_sle">
					      	<select id="postPriceModelId" name="" style="width: 273px;">
					      		<option value="1">同商家多个商品只收一次</option>
					      		<option value="2">每件商品收一次邮费</option>
					      	</select>
					      </div>
				    </div>
				    <div class="en_in">
					      <div class="en_txt"><em>*</em><span>商品展示图：</span></div>
					      <div class="en_pic">
					      	<form id="picturesShowForm" action="http://120.77.40.10/php/newfile.php?callBackURL=${domain}view/commodity/fileUploadCallback.jsp?name=picturesShow" method="post" enctype="multipart/form-data" target="uploadFileTarget">
						        <div class="en_img" id="picturesShow_preview" >+</div>
						        <input type="file" name="Filedata" value="Filedata" onchange="$('#picturesShowForm').submit();">
					        </form>
					        <input type="hidden" name="picturesShow" id="picturesShowId">
					      </div>
					      <div class="en_imgtxt">图片仅支持JPG、GIF、PNG格式，大小不超过1MB</div>
				    </div>
			       <div class="en_in">
				      <div class="en_txt"><em>*</em><span>商品主图：</span></div>
				      <div class="en_pic">
				        <form onsubmit="return isChenckFormat(this);" id="imgOneForm" action="http://120.77.40.10/php/newfile.php?callBackURL=${domain}view/commodity/fileUploadCallback.jsp?name=imgOne" method="post" enctype="multipart/form-data" target="uploadFileTarget">
						        <div class="en_img" id="imgOne_preview" >+</div>
						        <input type="file" name="Filedata" value="Filedata" onchange="$('#imgOneForm').submit();">
					        </form>
					      <input type="hidden" name="imgOne" id="imgOneId">
				      </div>
				      <div class="en_pic">
				        <form id="imgTwoForm" action="http://120.77.40.10/php/newfile.php?callBackURL=${domain}view/commodity/fileUploadCallback.jsp?name=imgTwo" method="post" enctype="multipart/form-data" target="uploadFileTarget">
						        <div class="en_img" id="imgTwo_preview" >+</div>
						        <input type="file" name="Filedata" value="Filedata" onchange="$('#imgTwoForm').submit();">
					        </form>
					      <input type="hidden" name="imgTwo" id="imgTwoId">
				      </div>
				      <div class="en_pic">
				        <form id="imgThreeForm" action="http://120.77.40.10/php/newfile.php?callBackURL=${domain}view/commodity/fileUploadCallback.jsp?name=imgThree" method="post" enctype="multipart/form-data" target="uploadFileTarget">
						        <div class="en_img" id="imgThree_preview" >+</div>
						        <input type="file" name="Filedata" value="Filedata" onchange="$('#imgThreeForm').submit();">
					        </form>
					      <input type="hidden" name="imgThree" id="imgThreeId">
				      </div>
				      <div class="en_pic">
				        <form id="imgFourForm" action="http://120.77.40.10/php/newfile.php?callBackURL=${domain}view/commodity/fileUploadCallback.jsp?name=imgFour" method="post" enctype="multipart/form-data" target="uploadFileTarget">
						        <div class="en_img" id="imgFour_preview" >+</div>
						        <input type="file" name="Filedata" value="Filedata" onchange="$('#imgFourForm').submit();">
					        </form>
					      <input type="hidden" name="imgFour" id="imgFourId">
				      </div>
				      <div class="en_pic">
				        <form id="imgFiveForm" action="http://120.77.40.10/php/newfile.php?callBackURL=${domain}view/commodity/fileUploadCallback.jsp?name=imgFive" method="post" enctype="multipart/form-data" target="uploadFileTarget">
						        <div class="en_img" id="imgFive_preview" >+</div>
						        <input type="file" name="Filedata" value="Filedata" onchange="$('#imgFiveForm').submit();">
					        </form>
					      <input type="hidden" name="imgFive" id="imgFiveId">
				      </div>
				      <div class="en_imgtxt2">图片仅支持JPG、PNG格式，长宽比例1:1，<br/>大小不超过500K。最多上传5张图片</div>
				   </div>
				     <div class="en_in">
				         <div class="en_txt"><em>*</em><span>商品详情：</span></div>
				         <div class="en_edit" ><div id="detailContentId"></div></div>
				     </div>
			  </div>
			  <div class="en_but4" onclick="location.href='${home}/mallPro/selList';">取消</div>
             <a href="javaScript:void(0);" id="submitId"><div class="en_but5">下一步</div></a>
               <!--按钮橙色样式是 en_but5   变灰色在后面加上样式on-->

		   </div>

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