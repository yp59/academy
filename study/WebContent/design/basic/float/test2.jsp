<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>float 구현</title>
<link rel="stylesheet" type="text/css" href="/study/design/common.css">
<style>
.multi-container{
/*float 속성을 부여하는 순간 기존의 배치에서 벗어나 공중에 뜨게 된다.
속성값을 이용해서 기준이 되는 방향을 정해주면 해당 방향쪽으로 붙는다.*/
border:1px dotted black;
float:left;
width:50%;
}
.wall{
clear:both;
}

</style>

</head>
<body>
<div style="background-color:green">테스트코드</div>
<div class="multi-container">111</div>
<div class="multi-container">111</div>
<!-- 비어있는 div를 만들고 벽처럼 장애물로 활용 -->
<div class="wall"></div>
<div style="background-color:green">테스트코드</div>
</body>
</html>