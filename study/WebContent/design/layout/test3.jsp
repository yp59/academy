<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>KH test</title>
	<link rel="stylesheet" type="text/css" href="/study/design/common.css">
	<style>
		div{
			border:1px dotted black;
		}
		
		/* 리셋 스타일 */
		html, body{
			margin:0;
			padding:0;
			
		}
		
		.main {
			width:650px;
			margin:auto;
		}
		.main::after {
			content:"";
			display:block;
			clear: both;
		}
		.main a{
		padding:0.5rem;
		text-align:center;
		}
		.side {
			float:left;
			width:20%;
			min-height:500px;
		}
		.content {
			float:left;
			width:80%;
			min-height:500px;
		}
		.title{
		min-height:50px;
		text-align:center;
		}
		.title-list{
		
		}
		.header {
			min-height: 100px;
			text-align:center;
		}
		.section {
			min-height:300px;
		}
		.footer {
			min-height:100px;
			text-align: center;
		}
	.table.table-border {
	border: 1px solid black;
	border-collapse: collapse; 
}
	.table.table-border > thead > tr > th, 
	.table.table-border > thead > tr > td,
	.table.table-border > tbody > tr > th,
	.table.table-border > tbody > tr > td,
	.table.table-border > tfoot > tr > th,
	.table.table-border > tfoot > tr > td {
		border: 1px solid black;
	}
		.thead{
		background-color:lightgray;
		}
		.pagination{
		text-align: center;
		}
		
	.pagination > a {
			color:black;
			text-decoration: none;
			display:inline-block; 
			min-width:35px;
			
			border:1px solid transparent;
			padding:0.5rem;
			text-align: center;
			}
		.pagination > a:hover,
		.pagination > a.on {
			border:1px solid lightgray;
			color:black;
		}
		
	</style>
</head>
<body>
	<!-- 가장 바깥 영역 -->
	<div class="main">
		
		<!-- 사이드영역 -->
		<div class="title">
		<h2>도서정보 관리 프로그램 ver 1.0</h2>
		</div>
		<div class="tile-list">
		<a href="#">도서등록</a>
		<a href="#">도서목록조회/수정</a>
		<a href="#">도서주문등록</a>
		<a href="#">도서주문조회</a>
		<a href="#">매출조회</a>
		<a href="#">홈으로</a>
		</div>
		<div class="side">
		<h4>관리메뉴</h4><br>
		<h4>-주문조회</h4>
		<h4>-재고현황</h4>
		<h4>-재고현황</h4>
		<h4>-거래처현황</h4>
		</div>
		
		<!-- 컨텐츠영역 -->
		<div class="content">
			<div class="header">
			<h2>도서 주문조회</h2>
			</div>
			<div class="search">
			<form action="#"method="post">
			<select>
			<option>검색분류</option>
			</select>
			<input type="text" placeholder="내용을 입력해주세요">
			<input type ="submit" value="검색">
			</form>
			</div>
			<div class="section">
			<table class = "table table-border"  >
				<thead class="thead">
					<tr>
						<th>주문일</th>
						<th>주문순서</th>
						<th>도서번호</th>
						<th>도서수량</th>
						<th>판매금액</th>
						<th>주문자</th>
					</tr>	
				</thead>
				<tbody class="text-center">
					<tr>
						<td>2019-09-27</td>
						<td>1</td>
						<td>200002</td>
						<td>5</td>
						<td>58,500</td>
						<td>뽀로로</td>
					</tr>
					<tr>
						<td>2019-09-27</td>
						<td>2</td>
						<td>100001</td>
						<td>1</td>
						<td>14,400</td>
						<td>뽀로로</td>
					</tr>
					<tr>
						<td>2019-09-22</td>
						<td>1</td>
						<td>200002</td>
						<td>3</td>
						<td>35,100</td>
						<td>파라오</td>
					</tr>
					<tr>
						<td>2019-09-22</td>
						<td>2</td>
						<td>300001</td>
						<td>15</td>
						<td>513,000</td>
						<td>뽀로로</td>
					</tr>
					<tr>
						<td>2019-09-22</td>
						<td>3</td>
						<td>300001</td>
						<td>12</td>
						<td>410,400</td>
						<td>타잔</td>
					</tr>
					<tr>
						<td>2019-09-22</td>
						<td>4</td>
						<td>300002</td>
						<td>1</td>
						<td>54,000</td>
						<td>슈퍼맨</td>
					</tr>
				</tbody>
			</table>
			</div>
			<div class="pagination"> 
			<a href="#">&lt;</a>
			<a href="#">1</a>
			<a href="#"class="on">2</a>
			<a href="#" >3</a>
			<a href="#">4</a>
			<a href="#">&gt;</a>
			</div>
		</div>
			<div class="footer">
			<h5 >KH 정보교육원 황인빈 강사 &copy;2021 All right reserved.</h5></div>
	</div>
</body>
</html>


