<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>float 이해하기</title>
	<link rel="stylesheet" type="text/css" href="/study/design/common.css">
	<style>
		/* 
			float 속성을 부여하는 순간 기존의 배치에서 벗어나 공중에 뜨게 된다.
			- 속성값을 이용해서 기준이 되는 방향을 정해주면 해당 방향쪽으로 붙는다.
		*/
		.multi-container {
			border:1px dotted black;
			float:right;
			width:50%; 
		}		
	</style>
</head>
<body>

	<div style="background-color:yellow;">테스트 코드1</div>

	<div class="multi-container">111</div>
	<div class="multi-container">222</div>
	
	<!-- 이 지점이 문제가 발생하는 지점 : 테스트코드2가 테스트코드1 뒤로 오려고 하기 때문에 레이아웃이 틀어짐 -->
	
	<div style="background-color:lightgray;">테스트 코드2</div>

</body>
</html>