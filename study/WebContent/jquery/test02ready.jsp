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
//jquery는 자바스크립트를 개량한 라이브러리
//코드 스타일이 유사하다.
window.addEventListener("load", function() {
	
});
//jquery는 자바 스크립트 뿐 아니라 불러온 jquery 라이브러리도 사용할 준비가 끝나야 한다.
//jquery에서 제공하는 이벤트 중에 ready라는 이벤트 시점이 되어야 사용하는데 문제가 없다.
$(document).ready(function(){
	console.log("jquery준비완료");//$로 jquery표현 가능 
});
$(function(){
	console.log("jqyery 준비 완 ");
});//이걸로 쓴다
</script>
</head>
<body>

</body>
</html>