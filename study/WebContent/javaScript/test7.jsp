<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비밀번호 입력창 문제</title>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>

<script>
/*
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
	
	if(image.width<200){
		image.width+=0;
	}
	
	else{
		image.width+=30;
	}
}
*/
$(function(){
	$(".z").click(function(){
		var x =document.querySelector(".banner");
		
		if(x.width>300){
			$(".banner").attr("width",x.width+=0);

		}
		else{
		$(".banner").attr("width",x.width+=30);
		}
	});
	$(".x").click(function(){
		var c = document.querySelector(".banner");
		if(c.width<100){
			$(".banner").attr("width",c.width-=0);
		}
		else{
			$(".banner").attr("width",c.width-=30);
				
		}
	});
});


</script>
</head>
<body>
<input type ="button" value="확대" onclick="sizeup();" class = "z">
<input type ="button" value="축소" onclick="sizedown();" class = "x">
<input type ="range" name="range"><br>
<img name="images" src="http://localhost:8080/study/aaa.png" width="200"class="banner">

</body>
</html>