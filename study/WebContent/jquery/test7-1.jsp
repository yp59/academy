<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>jQuery</title>
	
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/design/common.css">
	<style>
		.success-message, .fail-message {
			display: none;
		}
		.success-message {
			color:green;
		}
		.fail-message {
			color:red;
		}
	</style>
	
<!-- 	개발할 때는 uncompressed 버전, 개발 후 배포시에는 compressed(minify) 버전을 사용 -->
	<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<!-- 	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script> -->
	<script>
		$(function(){
			//비밀번호 입력창에 input/blur 이벤트를 설정
			$("#pw-input").on("input", function(){
				//this == 비밀번호 입력창
				var password = $(this).val();//this.value
				var regex = /^[a-zA-Z0-9]{8,16}$/;
				if(regex.test(password)){
					$(this).nextAll(".fail-message").css("display", "none");
					//$("#pw-input ~ .success-message").css("display", "inline");
					$(this).nextAll(".success-message").css("display", "inline");
				}
				else{
					$(this).nextAll(".success-message").css("display", "none");
					//$("#pw-input ~ .fail-message").css("display", "inline");
					$(this).nextAll(".fail-message").css("display", "inline");
				}
			});
			
			//비밀번호 확인창에 input/blur 이벤트를 설정
			$("#pw-re-input").on("input", function(){
				//this == 비밀번호 확인창
				
				var password = $("#pw-input").val();
				var passwordRe = $(this).val();
				
				//둘 중 하나라도 "부정적인 값"이라면 숨긴다(부정적인 값 == 빈 문자열)
				if(!password || !passwordRe){
					$(this).nextAll(".success-message").css("display", "none");
					$(this).nextAll(".fail-message").css("display", "none");
				}
				else if(password === passwordRe){
					$(this).nextAll(".success-message").css("display", "inline");
					$(this).nextAll(".fail-message").css("display", "none");
				}
				else{
					$(this).nextAll(".success-message").css("display", "none");
					$(this).nextAll(".fail-message").css("display", "inline");
				}
			});
		});
	</script>
</head>
<body>
	<div class="container-600">
		<div class="row text-center">
			<h2>회원 가입</h2>
		</div>
		<form action="??" method="post">
			<div class="row">
				<label for="pw-input">비밀번호</label>
				<input id="pw-input" type="password" name="memberPw" class="form-input form-input-underline">
				<span class="success-message">올바른 형식의 비밀번호입니다</span>
				<span class="fail-message">비밀번호는 영문,숫자 8~16자 이내로 작성하세요</span>
			</div>
			<div class="row">
				<label for="pw-re-input">비밀번호 재확인</label>
				<input id="pw-re-input" type="password" class="form-input form-input-underline">
				<span class="success-message">비밀번호가 일치합니다</span>
				<span class="fail-message">비밀번호가 일치하지 않습니다</span>
			</div>
			<div class="row">
				<input type="submit" value="가입" class="form-btn form-btn-positive">
			</div>
		</form>
	</div>
</body>
</html>

