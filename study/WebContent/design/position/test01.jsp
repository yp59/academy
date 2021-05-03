<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="study/design/common.css">

<style>
body{
height:50000px;
}
.a,.b,.c{
width:150px;
height:150px;
border:1px solid black;
position:fixed;
}
.a{
background-color: red;
top:50%;
left:100px;
z-index: 3;
}
.b{
background-color: blue;
top:200px;
left:200px;
z-index: 2;    
}
.c{
top:300px;
left:300px;
background-color: green;
z-index: 1;
}
</style>
</head>
<body>
<!-- 
영역에 부여되는 position 속성 이해하기
위치는 크게 2가지 유형으로 정해진다.
연관배치 : 앞 태그의 위치가 현재 태그에 영향을 미치는 경우
대부분의 컴포넌트가 여기에 해당됨
static relative
2.고저애ㅐ치 : 앞 태그의 위치와 상관없이 현재 태그의 위치가 정해지는 경우
공지,광고 등 화면을 덮는 배치가 필요할 경우 사용
상단 메뉴 등도 여기에 해당
absolute,fixed

position:static- 기본값이며, 앞 태그의 영향을 받아 위치가 결정되면 수정 불가
position:relative- 앞 태그의 영향을 받아 위치가 결정되지만 약간의 조정이 가능

-left:왼쪽간격
-right:오른쪽
-top:위
-bottom:아래쪽
 -->
 
 <div class="a"></div>
 <div class="b"></div>
 <div class="c"></div>
 
 
</body>
</html>