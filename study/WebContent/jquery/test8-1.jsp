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
//목표 :기본 이벤트 방지 작업
//=a,form 태그처럼 따로 설정하지 않아도 기본적으로 이벤트가 제공되는 태그들을 제어하는 방법
//javascript에서는 return true/false를 사용하여 제어했으나,jquery는 다르다.
//e.preventDefault()호출 시 이벤트 차단
$(function(){
	$("a").click(function(e){
		var choice = window.confirm("정말이동하시겠습니까?");
		
		if(!choice){
			e.preventDefault();
		}else{
			return false;
		}
		
	});
});
</script>
</head>
<body>
<a href="http://www.naver.com">네이버로 이동</a>
</body>
</html>