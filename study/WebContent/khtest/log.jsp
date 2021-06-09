<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<style>

.blue{
color : blue;
}
</style>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>

<script>
$(function(){
	$('input[name=cancel]').click(function(){
		window.location.reload();
	});

	$('#sub').click(function(){
		var id = $('input[name=id]').val();
		var pw = $('input[name=pw]').val();
		var repw = $('input[name=repw]').val();
		var ni = $('input[name=nick]').val();
		var ge = $('.gender').prop('checked');
		if(id==""){
			window.alert("아이디를 확인해주세요");
			return false;
		}
		if(pw==""){
			window.alert("비밀번호를 확인해주세요");
			return false;
		}
		if(pw!=repw){
			window.alert("비밀번호확인이 일치하지 않습니다");
			return false;
		}
		if(ni==""){
			window.alert("이름을 확인해주세요");
			return false;
		}
		if(!ge){
			window.alert("성별을 선택해주세요");
			return false;
		}

	});
	console.log(id);//null
	console.log(pw);//null
	console.log(ni);//null
	console.log(ge);//false
	
	/*$('.gender').click(function(){
		console.log($('.gender').prop('checked'));
	});
	*/
});
function confirmId(){
	
		var regex = /^[a-z][0-9a-z]{3,10}$/;
		var inputId = document.querySelector("input[name=id]");
		var text = inputId.value;
		var spanId = document.querySelector("input[name=id]+ span")
		
			if(regex.test(text)){
				spanId.textContent ="";
			}
			else{
				spanId.textContent ="소문자 시작 소문자 및 숫자로 4~10자 입력해주세요"
				
			}
}


function reconfirmPw(){
	
	
	var inputPw = document.querySelector("input[name=pw]");
	var reinputPw = document.querySelector("input[name=repw]");
	var spanRePw = document.querySelector("input[name=repw]+ span");
	var text = inputPw.value;
	var retext = reinputPw.value;

	if(text==retext){
		spanRePw.textContent ="";
	}
	else{
		spanRePw.textContent ="비밀번호 재입력"
	
	}
	
	
	}

function confirmPw(){
	
	var regex = /^[0-9a-zA-Z]{8,12}$/;
	var inputPw = document.querySelector("#inputPw");
	var text = inputPw.value;
	var spanPw = document.querySelector("input[name=pw]+ span");
	
	if(regex.test(text)){
		spanPw.textContent ="";
	}
	else{
		spanPw.textContent ="소문자, 대문자, 숫자로 8~12글자로 입력해주세요."
		
	}
}
function confirmNick(){
	
	var regex = /^[가-힣]{2,5}$/;
	var inputNick = document.querySelector("input[name=nick]");
	var text = inputNick.value;
	var spanNick = document.querySelector("input[name=nick]+ span");
	
		if(regex.test(text)){
			spanNick.textContent ="";
		}
		else{
			spanNick.textContent ="한글로만 2~5글자 입력해주세요."
			
		}
}

</script>
</head>
<body>
<form action="/memberJoin.do" method = "post">
회원 ID :<input id ="idNum" name="id" type = "text" onclick="confirmId();" onblur="confirmId();">
<span class="blue"></span><br>

회원 PW :<input type = "password" id="inputPw" name = "pw" onclick="confirmPw();"onblur="confirmPw();">
<span class ="blue"></span><br>

회원 PW확인 :<input type = "password" id ="reinputPw" name = "repw" onclick = "reconfirmPw();" onblur = "reconfirmPw();">
<span class="blue"></span><br>

회원 이름 :<input type = "text" name = "nick" ><br>
<span class="blue"></span><br>

성별 남<input type = "checkbox" class ="gender" checked="checked">여<input type = "checkbox" class ="gender"><br>

<input id = "sub" type = "submit" value = "회원가입" ><input type="button" name="cancel" value="취소">
</form>
</body>
</html>