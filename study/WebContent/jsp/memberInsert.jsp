<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>멤버 등록</title>
</head>
<body>
<form action="memberInsert.kh">

아이디: <input type= "text" name="memberId"required>
<br>
비밀번호: <input type= "password" name="memberPw"required>
<br>
닉네임: <input type= "text" name="memberNick"required>
<br>
생일: <input type= "date" name="memberBirth"required>
<br>
핸드폰: <input type= "text" name="memberPhone"required>
<br>
이메일: <input type= "text" name="memberEmail">
<br>
<input type="submit" value="가입하기">

</form>
</body>
</html>