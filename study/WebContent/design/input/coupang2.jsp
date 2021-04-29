<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>네이버 로그인 화면 만들기</title>

	<style>
		/*
			전체 영역을 먼저 설정
			- 글꼴
			- 폭
			- 폭 설정 기준(box-sizing)
		*/
		.naver-login {
			width:400px;
			font-family: sans-serif;
			
			/* 좌/우 margin을 auto로 주면 영역이 가운데로 온다 */
			margin-left: auto;
			margin-right: auto;
		}
	
		.logo{
			font-weight: bold; 
			font-size: 60px;
			color:#2bd400; 
			text-align: center;
		}
		.input{
			width:100%;
			padding:1rem;
			font-size: 20px;
			box-sizing: border-box;
/* 			margin:10px 0px; */
			margin-top: 15px;
			margin-bottom: 15px;
		}
		.btn{
			background-color: #2bd400;
			color:white;
			border-style: none;
		}
	</style>

</head>
<body>
	
	<div class="naver-login">
	
		<h1 class="logo">NAVER</h1>
	
		<form action="?" method="post">
			
			<input type="text" name="memberId" required class="input kbd-input">
			
			<input type="password" name="memberPw" required class="input kbd-input">
			
			<input type="submit" value="로그인" class="input btn">
			
		</form>
	</div>
	
</body>
</html>