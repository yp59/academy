<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>jQuery</title>
	
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/design/common.css">
	<style>
	
	</style>
	
<!-- 	개발할 때는 uncompressed 버전, 개발 후 배포시에는 compressed(minify) 버전을 사용 -->
	<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<!-- 	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script> -->
	<script>
		//property는 기본적으로 제공되는 속성만 읽을 수 있다.
		//attribute는 작성된 글자를 읽을 수 있다.
		$(function(){
			$(".qty").on("input",function(){
				var num = $(this).val();
				var price = $(this).data("price");
				
				var total = num*price;
				
				$(this).next("span").text(total);
			});
		});
	</script>
</head>
<body test>
	
	수량 : <input type="number" class="qty" data-price="15000"> 총 <span>0</span>원
	
</body>
</html>

