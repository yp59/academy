<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<style>

.green{
color : green;
}
.red{
color : red;
}
</style>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>

<script>
$(function(){
	$('input[name=cancel]').click(function(){
		window.location.reload();
	});
	
});
function confirmId(){
	
		var regex = /^[A-Z][0-9a-z]{4,255}$/;
		var inputId = document.querySelector("input[name=id]");
		var text = inputId.value;
		var spanId = document.querySelector("input[name=id]+ span")
		
			if(regex.test(text)){
				spanId.textContent ="";
			}
			else{
				spanId.textContent ="5글자이상, 첫글자는 대문자이고 영문자, 숫자만 가능"
				inputId.value="";
			}
}
function reconfirmPw(){
	
	
	var inputPw = document.querySelector("input[name=pw]");
	var reinputPw = document.querySelector("input[name=repw]");
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
	
	if(text==""){
		spanPw.textContent="";
		spanPw.textContent="";
	}else{
		if(text==retext){
			spanPw2.textContent="";
			spanPw.textContent="패스워드가 일치합니다";
			
		}
		else{
			spanPw.textContent="";
			spanPw2.textContent="패스워드가 일치하지 않습니다";
			
		}
	}
}

</script>
</head>
<body>
<form action="result.html">
<label for ="idNum">아이디</label>
<input id ="idNum" name="id" type = "text" required onblur="confirmId();"><span class="error"></span><br>
패스워드<input type = "password" id="inputPw" name = "pw" required ><span class ="green"></span>
	<span class="red"></span><br>
패스워드확인<input type = "password" id ="reinputPw" name = "repw" required onblur="confirmPw();" onblur = "reconfirmPw();"> <br>
이름<input type = "text" required><br>
성별 남<input type = "checkbox" required>여<input type = "checkbox" required><br>
이메일<input type = "text" required><br>
<input type = "submit" value = "회원가입"><input type="button" name="cancel" value="취소">
</form>
</body>
</html>