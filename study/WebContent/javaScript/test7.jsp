<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비밀번호 입력창 문제</title>
<script>
function sizeup(){
	var image = document.querySelector(".banner");
	

	
	if(image.width>300){
		image.width+=0;
	}else{
		image.width+=30;
	}
}
function sizedown(){
	var image = document.querySelector(".banner");
	if(image.width<100){
		image.width+=0;
	}else{
		image.width-=30;
	}
}

</script>
</head>
<body>
<input type ="button" value="확대" onclick="sizeup();">
<input type ="button" value="축소" onclick="sizedown();">
<input type ="range" name="range"><br>
<img name="images" src="http://localhost:8080/study/aaa.png" width="200"class="banner" >

</body>
</html>