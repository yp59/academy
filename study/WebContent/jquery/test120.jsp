<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>jQuery</title>
	
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/design/common.css">
	<style>
	
	</style>
	
<!-- 	개발할 때는 uncompressed 버전, 개발 후 배포시에는 compressed(minify) 버전을 사용 -->
	<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<!-- 	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script> -->
	<script>
		$(function(){
 			$.each($("h1"),function(index,item){
 				if(index%2!=0){//index 길이는 0부터 java랑 같다 (sql은 index 1부터)
 					
 					$(this).css("color","red");
 					
 				}else{
 					
 					$(this).css("color","blue");
 				}
 				
 			});
		});	
	</script>
</head>
<body>
	<div class = "row">
	<h1>Hello jQuery!</h1>
	<h1>Hello jQuery!</h1>
	<h1>Hello jQuery!</h1>
	<h1>Hello jQuery!</h1>
	<h1>Hello jQuery!</h1>
	</div>
</body>
</html>