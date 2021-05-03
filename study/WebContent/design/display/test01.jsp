<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Display 속성 설정</title>
	<link rel="stylesheet" type="text/css" href="/study/design/common.css">
	<style>
		div {
			display: inline;
		}
	</style>
</head>
<body>
	<!-- 
		영역 태그 : 영역별로 기본적으로 부여되어 있는 스타일이 다르다
		
		- display:block - 한 줄에 하나만 표시되도록 하는 속성
		- display:inline - 한 줄에 여러개 표시되도록 하는 속성(폭을 임의로 설정할 수 없다.)
	 -->
	<h1>Hello~!</h1>
	<h1>Hello~!</h1>
	<h1>Hello~!</h1>
	
	<div>Hello~!</div>
	<div>Hello~!</div>
	<div>Hello~!</div>
	
	<span>Hello~!</span>
	<span>Hello~!</span>
	<span>Hello~!</span>
	
	<p>Hello~!</p>
	<p>Hello~!</p>
	<p>Hello~!</p>
</body>
</html>
