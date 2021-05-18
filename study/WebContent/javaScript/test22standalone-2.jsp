<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>자바스크립트가 주도하는 이벤트 설정</title>
	<script>
		//목표 : 자바스크립트를 이용하여 버튼에 이벤트를 부여(알림창 출력)
		//(3) 완전한 이벤트의 분리
		//= onload마저 자바스크립트를 이용하여 처리하고 싶다!
		//= HTML에 onload, onclick, oninput 같은 것을 아예 쓰고 싶지 않다(완전한 분리)
		//= 모듈로서의 값어치가 생김
		//= 자바스크립트에 있는 내장객체인 window에 onload이벤트를 설정
		console.log(window);
		window.onload = app;//window의 onload 상황에 app을 실행하세요!
	
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
<body>
	<input type="button" value="클릭해보세요" class="test-btn">
</body>
</html>
