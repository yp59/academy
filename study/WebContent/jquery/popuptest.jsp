<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script>
$(function(){
	
	$('#s').click(function(){
		
		window.open('sss.jsp','x','width=500,height=500');
	});
	
$('#e').click(function(){
		
		window.close('sss.jsp');
	});
});

</script>
</head>
<body>
<input type ="button" value="test" id ="s">
<input type ="button" value="close" id ="e">


</body>
</html>