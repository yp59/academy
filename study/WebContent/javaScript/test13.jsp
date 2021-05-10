<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>입력창 클래스 스타일링</title>
	<script>
		function nicknameCheck(){
			var regex = /^[가-힣]{2,10}$/;
			
			var nicknameInput = document.querySelector(".user-input");
// 			console.log(nicknameInput);
			
			nicknameInput.classList.remove("correct", "incorrect");
			if(regex.test(nicknameInput.value)){
				//correct라는 클래스를 부여
				nicknameInput.classList.add("correct");
			}
			else{
				//incorrect라는 클래스를 부여
				nicknameInput.classList.add("incorrect");
			}
		}
	</script>
	<style>
		.user-input{
			border:1px solid black;
			outline:none;
		}
		.user-input.correct{
			border:1px solid blue;
		}
		.user-input.incorrect{
			border:1px solid red;
		}
	</style>
</head>
<body>
	
	<input type="text" class="user-input" placeholder="닉네임 입력" oninput="nicknameCheck();">
	
</body>
</html>