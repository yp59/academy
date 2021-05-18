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
	$(".text-input").on("input",function(){
		var text = $(this).val();
		$(".copy-area1").html(text);
		$(".copy-area2").text(text);
		
		
	});
});
</script>
</head>
<body>
<textarea class="text-input"></textarea>
<div class = "copy-area1"></div>
<div class = "copy-area2"></div>

</body>
</html>