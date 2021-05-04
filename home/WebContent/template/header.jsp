<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	//실제 context path를 구하는 명령
	//template 페이지의 모든 경로는 절대경로로 작성해야 한다. 가급적 절대경로로 작성하는 것을 추천
	String root = request.getContextPath();
%>    

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>내가 만든 홈페이지</title>
	<link rel="stylesheet" type="text/css" href="<%=root%>/css/common.css">
	<link rel="stylesheet" type="text/css" href="<%=root%>/css/menu.css">
	<link rel="stylesheet" type="text/css" href="<%=root%>/css/layout.css">
	<link rel="stylesheet" type="text/css" href="<%=root%>/css/test.css">
	<style>
		
	</style>
</head>
<body>
	<main>
		<header>
			<h1>홈페이지 1달만에 박살내기</h1>
		</header>
		<nav>
			<!-- 메뉴 -->
			<ul class="menu">
				<li>
					<a href="#">메뉴1</a>
					<ul>
						<li><a href="#">서브1</a></li>
						<li><a href="#">서브2</a></li>
						<li><a href="#">서브3</a></li>
						<li><a href="#">서브4</a></li>
					</ul>
				</li>
				<li>
					<a href="#">아이템 관리</a>
					<ul>
						<li><a href="#">아이템 등록</a></li>
						<li><a href="<%=root%>/item/itemList.jsp">아이템 목록</a></li>
						<li><a href="item/itemList.jsp">아이템 목록</a></li>
						<li><a href="#">서브4</a></li>
					</ul>
				</li>
				<li>
					<a href="#">메뉴3</a>
					<ul>
						<li><a href="#">서브1</a></li>
						<li><a href="#">서브2</a></li>
						<li><a href="#">서브3</a></li>
						<li><a href="#">서브4</a></li>
					</ul>
				</li>
				<li>
					<a href="#">메뉴4</a>
					<ul>
						<li><a href="#">서브1</a></li>
						<li><a href="#">서브2</a></li>
						<li><a href="#">서브3</a></li>
						<li><a href="#">서브4</a></li>
					</ul>
				</li>
			</ul>
		</nav>
		<section>