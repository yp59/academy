<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>정규표현식 검사</title>
	<script>
		function phoneCheck(){
// 			var regex = "^010\\d{8}$";
			var regex = /^010\d{8}$/;
			
			var input = document.querySelector("input[name=memberPhone]");
			var phoneNumber = input.value;
			
			var span = document.querySelector("input[name=memberPhone] + span");
			
// 			if(Pattern.matches(regex, phoneNumber)){//자바에서의 코드
			if(regex.test(phoneNumber)){//자바스크립트에서의 코드
				span.textContent = "올바른 전화번호 형식입니다";
			}
			else{
				span.textContent = "잘못된 전화번호 형식입니다";
			}
		}
	</script>
</head>
<body>
	<input type="text" name="memberPhone" placeholder="-를 제외한 전화번호 입력" oninput="phoneCheck();">
	<span></span>
</body>
</html>