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
			$(".check-all").on("input",function(){
				
				var ch = $(this).prop("checked");//ch의 형태는 boolean 으로 들어간다.
				
				$(".check-item").prop("checked",ch);
				$(".check-all").prop("checked", ch);
			});
		});
	</script>
</head>
<body>
	<input type="checkbox" class="check-all"> 전체선택
	<hr>
	<input type="checkbox" class="check-item"> 항목1 <br>
	<input type="checkbox" class="check-item"> 항목2 <br>
	<input type="checkbox" class="check-item"> 항목3 <br>
	<input type="checkbox" class="check-item"> 항목4 <br>
	<input type="checkbox" class="check-item"> 항목5 <br>
	<hr>
	<input type="checkbox" class="check-all"> 전체선택
</body>
</html>
