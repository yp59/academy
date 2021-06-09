<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비밀번호 입력창 문제</title>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script>
/*function test1(){

	var t1 = document.querySelector("input[name=memberPw]");
	t1.type = "text";
}
function test2(){
	 document.querySelector("input[name=memberPw]").type="password";//이렇게 선언해도 되네
	 //일단 onclick onblur
	
}
function test3(){
	var t3 = document.querySelector("input[name=memberPw]");
	var t4 = document.querySelector(".btn");
	
	if(t3.type=="password"){
		t4.value="표시";
		t3.type="text";
	}
	else{
		t4.value="숨김";
		t3.type="password";
	}
}*/
$(function(){

	$(".tt").on("click",function(){
		$(".zx").attr("type","text");//속성 그 자체의 값을 변환 최초 선언된 타입을 말한다??
		//$(".zx").prop("type","text");//속성을 명시적으로 찾아낼 수 있는 방법 이게 더 정확한 방법???
	});
	$(".tt2").click(function(){
		$(".zx").prop("type","password");
	});
	
	$(".btn").click(function(){
		
		if($(this).val()=="표시"){
			$(this).val("숨김");
			
		$(".zx").prop("type","text");
		}
		else{
			$(this).val("표시");
		$(".zx").prop("type","password");	
		}
	});
}); 

</script>
</head>
<body>
<form action="#" method="post" >
<input type = "password" name="memberPw" class="zx">
<input type = "button" value="표시" onclick="test1();"class="tt">
<input type = "button" value="숨김" onclick="test2();"class="tt2">
<input type = "button" value="표시" onclick="test3();" class="btn">
</form>
</body>
</html>