/* 分页查询 */
function goPrePage() {

	if ($('#page').val() == 1) {
		alert("当前已是第一页.");
		return;
	}
	var page = parseInt($('#page').val()) - 1;
	$('#page').val(page);
}

function goNextPage() {
	var page = parseInt($('#page').val());
	if(page==$('#totalPageV').val()){
		alert("当前已最后一页.");
		return;
	}
	$('#page').val(page+1);
}

function goFirstPage() {
	$('#page').val(1);
}

function goLastPage() {
	var page = parseInt($('#totalPage').val());
	$('#page').val(page);
}