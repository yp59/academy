<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>멤버 등록</title>
</head>
<body>

<!-- form에 method를 지정하여 전송 형태를 설정할 수 있다.
get : 기본값이며,주소의 ?이후의 데이터를 첨부하는 방식. 주소를 이용한 데이터 전달방식
장점 간편하며 다양한 종류의 태그로 쉽게 사용가능
단점 주소는 최대 256byte까지 전송데이터 양의 제한이 걸림

post : 주소가 아니라 http body를 이용하여 데이터를 전달하는 방식
장점 전송 양이 무한대이다 따라서 데이터가 많거나 , 파일을 보낼 때 사용
단점 반드시 form이 있어야 한다. 자바스크립트를 배우면 이야기가 달라진다.
	전송데이터는 아스키코드로 보내진다. -->
<form action="memberInsert.kh"method="post">

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