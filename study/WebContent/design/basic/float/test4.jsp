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
			float:left;
		
		}		
			.multi-container2 {
			border:1px dotted black;
			float:right;

	
		}	
	.multi-container.blank>a{
	padding: 0.7rem; 
	}
	.multi-container.blank2>a{
	padding: 0.7rem; 
	}
	</style>
</head>
<body>
<div class="float-container">
		<div class="multi-container blank">
		<a href="#">Why github?</a>
		<a href="#">Team</a>
		<a href="#">Enterprise</a>
		<a href="#">explore</a>
		<a href="#">Market place</a>
		<a href="#">Pricing</a>
</div>
		<div class="multi-container2 blank2">
		
		<a href="#">Sign in</a>
		<a href="#">Sign up</a>
		</div>
		<div class="multi-container2 blank2">
		<form action="#" method="post">
		<input type="search" placeholder="Search Github">
		<input type="submit" value="검색">
		</form>
</div>
		
	</div>
	
	

</body>
</html>