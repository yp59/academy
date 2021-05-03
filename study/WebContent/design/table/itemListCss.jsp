<%@ page import="study.beans.ItemDto"%>
<%@ page import="java.util.List"%>
<%@ page import="study.beans.ItemDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	ItemDao itemDao = new ItemDao();
	List<ItemDto> list = itemDao.list();
%>

<!Doctype HTML>
<html>
	<head>
		<meta charset="UTF-8">
		<title>아이템 목록</title>
		<link rel="stylesheet" type="text/css" href="/study/design/common.css">
		<style>
		
		</style>		
	</head>
	<body>
		<div class="container-400">
			<div class="row text-center">
				<h1>아이템 목록</h1>
			</div>
			<div class="row">
				<table class="table table-border table-striped">
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
							<td class="text-center"><%=itemDto.getItemNo()%></td>
							<td>
				<%-- 		<a href="/study/jsp/itemDetail.jsp?itemNo=<%=itemDto.getItemNo()%>"> --%>
								<a href="itemDetail.jsp?itemNo=<%=itemDto.getItemNo()%>">
									<%=itemDto.getItemName()%>
								</a>
							</td>
							<td class="text-right"><%=itemDto.getItemPrice()%></td>
						</tr>
						<% } %>
					</tbody>
				</table>
			</div>
			
			<div class="row text-center">
				<h4><a href="/study/jsp/itemInsert.jsp">아이템등록1(절대경로)</a></h4>
			</div>
			
			<div class="row text-center">
				<h4><a href="itemInsert.jsp">아이템등록1(상대경로)</a></h4>
			</div>
			
			<div class="row text-center">
				<h4><a href="/study/jsp/itemInsert2.jsp">아이템등록2(절대경로)</a></h4>
			</div>
			
			<div class="row text-center">
				<h4><a href="itemInsert2.jsp">아이템등록2(상대경로)</a></h4>
			</div>
		</div>
	</body>
</html>
