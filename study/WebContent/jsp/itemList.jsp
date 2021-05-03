<%@ page import="study.beans.ItemDto"%>
<%@ page import="java.util.List"%>
<%@ page import="study.beans.ItemDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	ItemDao itemDao = new ItemDao();
	List<ItemDto> list = itemDao.list();
%>
<head>
<link rel="stylesheet" type="text/css" href="/study/design/common.css">
<style>
.table{
width:100%;
text-align: center;
box-shadow: 0px 0px 4px 4px gray;
opacity:0.5;
}

.table>thead>tr>th,
.table>tbody>tr>th,
.table>tbody>tr>td{
padding: 0.3rem;
}

.table>thead>tr>th,
.table>tbody>tr>th,
.table>tbody>tr>td{
padding: 0.3rem;
}
.table.table-border{
border: 1px solid black;
border-collapse: collapse;
}
.table.table-border>thead>tr>th,
.table.table-border>tbody>tr>th,
.table.table-border>tbody>tr>td{
border:2px solid black;
}

.table>thead{
background-color: blue;
}
.table.table-striped>tbody>tr:nth-child(2n){
background-color: yellow;
}
.table.table-striped>tbody>tr:nth-child(2n-1){
background-color:purple;
}
.table.table-hover>tbody>tr:hover{
background-color: black;
}
</style>
</head>

<body>

<div class="container-400">
<div class="row text-center">
<h4><a href="/study/jsp/itemInsert.jsp">아이템 등록(절대경로)</a></h4>
<h4><a href="itemInsert.jsp">아이템 등록(상대경로)</a></h4>

<h4><a href="/study/jsp/itemInsert2.jsp">아이템 등록2(절대경로)</a></h4>
<h4><a href="itemInsert2.jsp">아이템 등록2(상대경로)</a></h4>
</div>
<div class="row">
<table class="table table-border table-hover table-striped">
	<thead>
		<tr>
			<th>itemNo</th>
			<th>itemName</th>
			<th>itemPrice</th>
		</tr>
	</thead>
	
	<tbody>
		<% for(ItemDto itemDto : list){ %>
		<tr>
			<td><%=itemDto.getItemNo()%></td>
			<td>
			<a href="itemDetail.jsp?itemNo=<%=itemDto.getItemNo()%>">
			<%=itemDto.getItemName()%></a></td>
			<td><%=itemDto.getItemPrice()%></td>
		</tr>
		<% } %>
	</tbody>
</table>
</div>
</div>
</body>
