<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<form action = "login" method="post">
ID: <input type="text" name = "memberId">
PW: <input type="text" name = "memberPw">
<input type = "submit" value="로그인">
</form>