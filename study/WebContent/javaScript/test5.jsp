<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>what is function?</title>
<script>

//함수는 메소드와 비슷함 
//자바스크립트는 접근제한 키워드가 없다.
//데이터 구분이 없다.
//이름의 충돌을 조심해야 한다. 모든 자바스크립트는 공유된다.

//태그를 불러오는 명령 document.querySelector("CSS선택자");
function plus(){
	
	var a = document.querySelector(".a");
	var b = document.querySelector(".b");
	var c = document.querySelector(".c");
	
	c.value=a.value+b.value;//문자열 덧셈 변환이 필요함
}
</script>
</head>
<body>

<input type="text" name="a" id="a"class="a">
+
<input type="text" name="b" id="b"class="b">
<input type="button" value="계산" onclick="plus();">
<input type="text" name="c" id="c"class="c">


</body>
</html>