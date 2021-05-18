<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jquery</title>
<link rel="stylesheet" type="text/css"href="<%=request.getContextPath()%>/design/common.css">
<!-- 개발할 때는 uncompressed 버전 개발 후 배포 시에는 compressed(minify)버전을 사용 -->
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<!-- <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script> -->
<script>
$(function(){
	//모든  h1태그의 글자색을 빨강으로 설정
	$("h1").css("color","red");
});
</script>
</head>
<body>
	<h1>hello jQuery</h1>
	<h1>hello jQuery</h1>
	<h1>hello jQuery</h1>
	<h1>hello jQuery</h1>
	<h1>hello jQuery</h1>
</body>
</html>