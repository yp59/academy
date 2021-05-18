<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>자바스크립트가 주도하는 이벤트 설정</title>
	<script>
		//목표 : 자바스크립트를 이용하여 버튼에 이벤트를 부여(알림창 출력)
		//(5) 최적화
		//= window.onload 는 window의 속성 중 하나
		//= window.onload 에 무언가를 설정하면 기존에 설정된 것이 덮어쓰기된다.
		//= 혹시라도 여러 개의 모듈을 사용하면 모듈마다 설정해 놓은 내용들이 손실될 수 있다.
		//= addEventListener는 여러 개 중복하여 설정이 가능하며 모두 다 실행된다.
		window.addEventListener("load", function(){
			var btn = document.querySelector(".test-btn");
			btn.addEven tListener("click", function (){
				window.alert("눌렀습니다 1111!");
			});
		});
		
		window.addEventListener("load", function(){
			var btn = document.querySelector(".test-btn");
			btn.addEventListener("click", function (){
				window.alert("눌렀습니다 2222!");
			});
		});
	</script>
</head>
<body>
	<input type="button" value="클릭해보세요" class="test-btn">
</body>
</html>
