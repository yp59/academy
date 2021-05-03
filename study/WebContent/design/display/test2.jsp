<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Pagination 만들기</title>
	<link rel="stylesheet" type="text/css" href="/study/design/common.css">
	<style>
		/*
			페이지네이션(Pagination) 스타일링
			
			- 영역 내 a태그의 글자 색상 및 밑줄 제거
			- 영역 내 a태그에 표시방식 변경 및 폭 설정
			- 영역 내 a태그에 테두리 설정 및 내부 여백 설정
			- 영역 내 a태그에 글자 정렬 설정 및 hover 설정
		*/
		.pagination > a {
			color:grey;
			text-decoration: none;
			display:inline-block; 
			min-width:35px;
			
			border:1px solid transparent;
			padding:0.5rem;
			text-align: center;
		}
		.pagination > a:hover,
		.pagination > a.on {
			border:1px solid lightgray;
			color:rgb(255,85,146);
		}
	</style>
</head>
<body>
	
	<div class="pagination"> 
		<a href="#">&lt;이전</a>
		<a href="#">1</a>
		<a href="#">2</a>
		<a href="#" class="on">3</a>
		<a href="#">4</a>
		<a href="#">5</a>
		<a href="#">6</a>
		<a href="#">7</a>
		<a href="#">8</a>
		<a href="#">9</a>
		<a href="#">10</a>
		<a href="#">다음&gt;</a>
	</div>
	
</body>
</html>