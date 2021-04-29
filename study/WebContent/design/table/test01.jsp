<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>table 테스트</title>

<link rel="stylesheet" type="text/css" href="/study/design/common.css">
<style>
/*
테이블 스타일링

-공용 스타일:
.table
*/
.table{
width:100%; 
/*라인 합치기*/}

.table > thead > tr > th,
.table > thead > tr > td,
.table > tbody > tr > th,
.table > tbody > tr > td{

padding:0.5rem;
}
/* 이게 간단하지만 테이블 in 테이블하면 이렇게 하는 건 위험하다ㅏ.
.table td{
border : 1px solid black;
}
.table th{
border : 1px dotted red;
}
*/
.table.table-border{
border:1px solid black;
border-collapse:collapse;
}
.table.table-border > thead > tr > th,
.table.table-border > thead > tr > td,
.table.table-border > tbody > tr > th,
.table.table-border > tbody > tr > td{

border:1px solid black;
}
.table.table-hover >tbody > tr:hover,
.table.table-hover >head > tr:hover{
background-color:gray;
opacity: 1;
}
.table.table-striped > thead>tr,
.table.table-striped > tbody>tr:nth-child(2n){
background-color: green;
}
</style>

</head>
<body>
<div class="container-600">

<div class="row text-center">
<h1>오늘의 날씨</h1>
</div>
<div class="row">
<table class="table table-border table-hover table-striped">
<thead>
	<tr>
		<td>지역</td>
		<td>현재기온</td>
		<th colspan="2">불쾌지수/습도(%)</th>
		<td>풍속</td>
	</tr>
</thead>
<tbody>
	<tr>
		<th rowspan="2">서울/경기</th>
		<td>23</td>
		<td>60</td>
		<td>80</td>
		<td>4.7</td>
	</tr>
	
	<tr>
		<td>20</td>
		<td>60</td>
		<td>80</td>
		<td>5.0</td>
	</tr>
	<tr>
		<td>제주도</td>
		<td>21</td>
		<td>65</td>
		<td>85</td>
		<td>3.6</td>
	</tr>	
</tbody>
</table>

</div>
</div>


</body>
</html>