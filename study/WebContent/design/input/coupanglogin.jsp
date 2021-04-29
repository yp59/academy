<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>쿠팡 로그인 화면 만들기</title>

	<style>
	
		.COUPANG-login {
			width:460px;
			font-family: sans-serif;
			
			/* 좌/우 margin을 auto로 주면 영역이 가운데로 온다 */
			margin-left: auto;
			margin-right: auto;
			text-align:center;
		}
	
		.COUPANG-login > .logo{
		 width: 45%;
		 
		}
		.COUPANG-login > form > .input {
			width:100%;
			padding:1rem;
			font-size: 20px;
			box-sizing: border-box;
		margin:10px 0px; 
			margin-top: 15px;
			margin-bottom: 15px;
	
			
		}
		.COUPANG-login > form > .btn{
			background-color: #0074e9;
		    color: #fff;
		    box-shadow: inset 0 -2px 0 rgb(0 0 0 / 38%);
		    padding: 16px 17px;
		    font-family: apple sd gothic neo,malgun gothic,nanumbarungothic,nanumgothic,dotum,sans-serif;
		    font-size: 17px;
		    line-height: 20px;
		    display: block;
		    padding-left: 0;
		    padding-right: 0;
		    width: 100%;
			
		}
		
		.COUPANG-login > form > .btn2{
			border: 1px solid #ccc;
		    background-color: #fff;
		    color: #0073e9;
		    box-shadow: inset 0 -1px 0 rgb(0 0 0 / 15%);
		    padding: 16px 17px;
		    font-family: apple sd gothic neo,malgun gothic,nanumbarungothic,nanumgothic,dotum,sans-serif;
		    font-size: 17px;
		    line-height: 20px;
		    display: block;
		    padding-left: 0;
		    padding-right: 0;
		    margin: 18px 0 0;
			
		}
	</style>

</head>
<body>
	
	<div class="COUPANG-login"> 
	
	<img src="http://localhost:8080/study/design/img/coupang.png" class="logo">
		<form action="?" method="post">
			
			<input type="text" name="memberId" required class="input kbd-input" placeholder="아이디(이메일)">
			
			<input type="password" name="memberPw" required class="input kbd-input"placeholder="비밀번호">
			
			<input type="submit" value="로그인" class="input btn">
			
			<hr size="1" >
			
			<input type="submit" value="회원가입" class="input btn2">
			
		</form>
	</div>
	
</body>
</html>