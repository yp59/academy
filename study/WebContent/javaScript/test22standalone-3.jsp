<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>자바스크립트가 주도하는 이벤트 설정</title>
	<script>
		//목표 : 자바스크립트를 이용하여 버튼에 이벤트를 부여(알림창 출력)
		//(4) 코드 정리 
		//= 쓸데없는 함수명을 제거
		window.onload = function (){
			var btn = document.querySelector(".test-btn");//class="test-btn"인 대상을 선택
			btn.addEventListener("click", btnClick);//위에서 선택한 대상에 click 상황이 벌어지면 btnClick을 실행하도록 예약
		};
		
		function btnClick(){
			window.alert("눌렀습니다!");
		}
	</script>
</head>
<body>
	<input type="button" value="클릭해보세요" class="test-btn">
</body>
</html>
