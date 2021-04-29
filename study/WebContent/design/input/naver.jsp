<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>naver</title>
<style>
.in{
border-color:gray;
border-style:solid;
width:250px;
padding: 8px;
margin: 2px 0px;
}
.logo{
color:green;
border-style:none;
width:250px;
font-family:빙그래체;
text-align: center;
		
}
.sub{
border-style:none;
background-color:green;
color:white;
width:270px;
padding: 8px;
}
</style>

</head>
<body>
<h1 class="logo">NAVER</h1>
<form action="?">
<input class="in" type="text" name="id" placeholder="아이디"><br>
<input class="in" type="text" name="pw" placeholder="비밀번호"><br>
<input class="sub" type="submit" value="로그인">
</form>

</body>
</html>