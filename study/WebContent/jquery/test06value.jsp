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
			//목표 : textarea에 입력된 글자를 div에 각각 다른 방법으로 복사
			//= textarea의 value를 읽어서 각각의 div에 innerHTML, textContent로 설정
			//= jQuery는 각각의 값들을 제어하기 위한 명령들이 존재
			//$(".test-input").input(function(){});//없음(jQuery보다 나중에 나온 이벤트)
			$(".test-input").on("input", function(){
				//주인공 : textarea(.test-input) == this
				var content = $(this).val();//test-input클래스의 input명령이 들어왔다면 content var의 값을 이 값으로 넣는다.
				//document.querySelector(".copy-area1").innerHTML = text;
				$(".copy-area1").html(content);
				//document.querySelector(".copy-area2").textContent = text;
				$(".copy-area2").text(content);
			});
		});
	</script>
</head>
<body>
	<textarea class="test-input"></textarea>
	<div class="copy-area1"></div>
	<div class="copy-area2"></div>
</body>
</html>
