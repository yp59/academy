<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<h1>로그인 상태 : ${memberNo != null} 회원번호 : ${memberNo}</h1>

<a href="${pageContext.request.contextPath }">홈</a>
<a href="${pageContext.request.contextPath}/member/login">로그인</a>
<a href="${pageContext.request.contextPath}/member/logout">로그아웃</a>