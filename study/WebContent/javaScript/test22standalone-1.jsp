<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>자바스크립트가 주도하는 이벤트 설정</title>
	<script>
		//목표 : 자바스크립트를 이용하여 버튼에 이벤트를 부여(알림창 출력)
		//(2) 자바스크립트에서 버튼을 선택하여 이벤트를 부여
		//= 자바스크립트가 HTML보다 먼저 해석되어서 태그 선택이 불가능
		//= 태그를 선택하고 싶다면 자바스크립트의 실행 시점을 "태그가 생성된 뒤"로 미뤄야 한다
		//= "태그가 생성된 뒤"에 해당하는 이벤트는 "onload"이다. 
		//= 태그 객체에 .addEventListener("이벤트명", 함수명)을 작성하면 이벤트 설정이 가능
		function app(){
			var btn = document.querySelector(".test-btn");//class="test-btn"인 대상을 선택
			btn.addEventListener("click", btnClick);//위에서 선택한 대상에 click 상황이 벌어지면 btnClick을 실행하도록 예약
	 		//btn.addEventListener("click", btnClick());//위에서 선택한 대상에 click 상황이 벌어지면 btnClick을 실행한 결과를 전달하라(절대 사용 불가)	
		}
		
		function btnClick(){
			window.alert("눌렀습니다!");
		}
	</script>
</head>
<body onload="app();">
	<input type="button" value="클릭해보세요" class="test-btn">
</body>
</html>
