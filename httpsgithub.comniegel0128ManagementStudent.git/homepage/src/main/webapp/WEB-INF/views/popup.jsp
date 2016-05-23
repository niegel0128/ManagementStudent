<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div>
	<img alt="" width="4%" height="4%" align="right" 
	src="${img}/closeButton.png" class="popupClose closeBtn cursor">
</div>
<div>
조성용의 학생관리 페이지 팝업창입니다.
</div>
<script>
	$('.popupClose').hover(function() {
		$(this).attr("src","${img}/closeButton.png");
	},function(){
		$(this).attr("src","${img}/closeButton.png");
	});
	$('.popupClose').click(function(e) {
		e.preventDefault();
		$.magnificPopup.close();
	});
</script>