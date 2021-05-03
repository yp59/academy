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
		
		/* clear 옵션은 앞부분에 적용된 float를 초기화 하는 역할을 하여 "벽" 처럼 사용 가능*/
		.wall {
			clear: both;
		}
	</style>
</head>
<body>

	<div style="background-color:yellow;">테스트 코드1</div>

	<div class="multi-container">111</div>
	<div class="multi-container">222</div>
	
	<!-- 해결책1 : 비어있는 DIV를 만들고 벽처럼 장애물로 활용 -->
	<div class="wall"></div>
	
	<div style="background-color:lightgray;">테스트 코드2</div>

</body>
</html>