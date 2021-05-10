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
	
	function calc(){
		var input = document.querySelector("input[name=nickname]");
		var span = document.querySelector("input[name=nickname]+ span");
		
		var text = input.value;//입력된값을 text에 저장
		var len = text.length;
		
		if(len>=2&&len<=8){
			
			span.textContent="올바른 닉네임입니다.";
		}
		else{
			span.textContent="닉네임은 2~8글자로 설정하세요";
		}
		}
	
	</script>
</head>
<body>
	<input type = "text" name="nickname" onblur="calc();" ><!-- onblur는 oninput과달리 끝나면 나옴  -->
	<span></span>
</body>
</html>