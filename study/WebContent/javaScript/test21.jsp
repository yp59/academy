<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>함수응용</title>
<script>
//자바스클비트는 함수를 만드는 방식이 2가지
test1();
test2();//이거 왜 안됨?
//1함수 선언식 : 위치와 무관하게 호출 가능한 함수를 만드는 방식

function test1(){
	console.log("test1 함수 실행");
}
//2함수 표현식 : 변수처럼 선언 이후에만 사용할 수 있도록 만드는 방식

var test2 = function(){
	console.log("test2 함수 실행");
}

test1();
test2();
</script>
</head>
<body>

</body>
</html>