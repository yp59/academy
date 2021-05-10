<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비밀번호 입력창 문제</title>
<script>
function test1(){
	//표시 : 입력창의 type을 text로 바꾼다.

	var target = document.querySelector("input[name=memberPw]");
	target.type = "text";
}

function test2(){
	//숨김 : 입력창의 type을 password로 바꾼다.	
	var hollow = document.querySelector("input[name=memberPw]");
	
	hollow.type="password";
}
function test3(){
	var btn = document.querySelector(".btn");
	
	if(btn.value=="표시"){
		test1();
		btn.value="숨김";
		
	}
	else{
		test2();
		btn.value="표시";
	}
}

</script>
</head>
<body>
<form action="#" method="post">
<input type = "password" name="memberPw">
<input type = "button" value="표시" onclick="test1();">
<input type = "button" value="숨김" onclick="test2();">
<input type = "button" value="표시" onclick="test3();" class="btn">
</form>
</body>
</html>