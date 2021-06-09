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
function test(){
	console.log("테스트");
}

</script>
</head>
<body>
<!-- 
이벤트 바인딩 : 특정 태그에 특정 상황에 실행시킬 코드를 연결하는것
버튼 클릭하면 실행코드를 실행하라
input onclick test(); -->
<input type="button" value="눌러보세요" onclick="test();">
</body>
</html>