<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>자바스크립트가 주도하는 이벤트 설정</title>
	<script>
		//목표 : 자바스크립트를 이용하여 버튼에 이벤트를 부여(알림창 출력)
		//(1) 기존 방식 - 모듈로 분리하기가 매우 어려움(HTML에 Javascript 코드가 작성)
		function btnClick(){
			window.alert("눌렀습니다!");
		}
	</script>
</head>
<body>
	<input type="button" value="클릭해보세요" class="test-btn" onclick="btnClick();">
</body>
</html>

