<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>khtest</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/common.css">
<style>
.green{
color : green;
}
.red{
color : red;
}
</style>
<script>
function confirmId(){
	
	var regex = /^[A-Z][a-z0-9]{4,255}$/;
	var inputId = document.querySelector("#inputId");
	var text = inputId.value;
	
		if(!regex.test(text)){
			window.alert("5글자이상, 첫글자는 대문자이고 영문자, 숫자만 가능");
			inputId.value="";
		}
}

function reconfirmPw(){
	
	//var regex = /^[a-zA-Z0-9]{8,16}$/;
	var inputPw = document.querySelector("#inputPw");
	var reinputPw = document.querySelector("#reinputPw");
	var text = inputPw.value;
	var retext = reinputPw.value;

		if(text==""){
			
			if(retext!=""){
				window.alert("패스워드를 입력하세요");
				reinputPw.value="";
				document.getElementById('inputPw').focus();
			}
		}
	
	
	}

function confirmPw(){
	
	var inputPw = document.querySelector("#inputPw");
	var reinputPw = document.querySelector("#reinputPw");
	var spanPw = document.querySelector(".green");
	var spanPw2 = document.querySelector(".red");
	var text = inputPw.value;
	var retext = reinputPw.value;
	
		if(text==retext){
			spanPw2.textContent="";
			spanPw.textContent="패스워드가 일치합니다";
			
		}
		else{
			spanPw.textContent="";
			spanPw2.textContent="패스워드가 일치하지 않습니다";
			
		}
}

function gender(){
	var inputSub = document.querySelector("#sub");
	var inputGen = document.querySelector("input[name=gen]");
	
	var x = window.confirm("성별을 선택하셨습니까?");
	if(x){
		if(inputGen==false){
			window.alert("성별을 선택하세요");
			history.back();
		}
		
	}else{
		
	}
}

function re(){
	location.reload();//새로고침
}
</script>
</head>
<body>

<form action="result.html">

<label for="inputId">아이디</label>
<input id="inputId" type="text" required onblur="confirmId();"><br>

패스워드
	<input id="inputPw" type="password" required onblur="confirmPw();">
	<span class ="green"></span>
	<span class="red"></span><br>

패스워드 확인
	<input id="reinputPw" type="password" required onblur="reconfirmPw();" ><br>

성별
	남<input type="radio"name="gen" required>
	여<input type="radio"name="gen"><br>
이메일
	<input type="text" required><br>

<div class="row">	
<input type="submit" id="sub" value="회원가입" oninput="gender();">
</div>
</form>
<button onclick="re();">취소</button>
</body>
</html>