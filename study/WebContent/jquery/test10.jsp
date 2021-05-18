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
	$(".check-all").on("input",function(){
	//	console.log("attr="+$(this).attr("checked"));//attribute 태그에 적힌 속성값을 글자로 반환
	//	console.log("prop="+$(this).prop("checked"));//propertity 태그의 내부속성을 형태에 맞게 반환
	//	console.log("is="+$(this).is("checked"));

// 	$(".check-item").attr("checked","checked");
// 	});

// 	$(".check-item").prop("checked",true);

	var current=$(this).prop("checked");
	$(".check-item").prop("checked",current);
	$(".check-all").prop("checked",current);
});
	
});
</script>
</head>
<body>

<input type="checkbox" class="check-all">
<hr>
<input type="checkbox" class="check-item">
<input type="checkbox" class="check-item">
<input type="checkbox" class="check-item">
<input type="checkbox" class="check-item">
<input type="checkbox" class="check-item">
<hr>
<input type="checkbox" class="check-all">

</body>
</html>