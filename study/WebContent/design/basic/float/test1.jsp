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
</style>

</head>
<body>
<h3>테스트코드</h3>
<div class="multi-container">111</div>
<div class="multi-container">111</div>
<h3>테스트코드</h3>
</body>
</html>