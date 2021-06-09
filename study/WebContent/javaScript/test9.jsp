<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>이미지 확대/축소</title>
	<script>
	//목표 입력이 발생하면 글자수를 갱신하는페이지 구현
	//<input>에 oninput상황이 발생하면 준비한 함수를 실행
	/*
	function calc(){
		var input = document.querySelector("#user-input");
		var span = document.querySelector("#length");
		
		var text = input.value;//입력된값을 text에 저장
		var len = text.length;
		
		//입력창이 아니면 value를 가질 수 없다.
		//입력창이 아닌 것들은 innerHTML or textContent 속성을 설정해야 한다.
		//span.value=len;
		span.textContent=len;
	}
	*/
	$("#user-input").on("input",function(){
		
		var x = document.querySelector("#length");
		console.log(x);
		
	});
	
	</script>
</head>
<body>
	<input type = "text" id="user-input"oninput="calc();">
	<span id="length">0</span>
</body>
</html>