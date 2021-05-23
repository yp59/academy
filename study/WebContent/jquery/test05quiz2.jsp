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
		$(function(){
			//빨강, 파랑 버튼에 대한 이벤트를 각각 설정
			$(".red-btn").click(function(){
				$(".target").css("color", "red");
			});
			
			$(".blue-btn").click(function(){
				$(".target").css("color", "blue");
			});
			var color = 1;
			$(".color-btn").click(function(){
				
				if(color===1){
				$(".target").css("color","red");
				color=0;
				}
				else{
				$(".target").css("color","blue");
				color=1;
				}
			});
		});
	</script>
</head>
<body>
<button class="color-btn">색상반전</button>
	<button class="red-btn">빨강</button>
	<button class="blue-btn">파랑</button>
	<hr>
	<h1 class="target">Hello jQuery!</h1>
	<h1 class="target">Hello jQuery!</h1>
	<h1 class="target">Hello jQuery!</h1>
	<h1 class="target">Hello jQuery!</h1>
	<h1 class="target">Hello jQuery!</h1>
</body>
</html>