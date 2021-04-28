<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="study.beans.ProductDao"%>
<%@ page import="study.beans.ProductDto"%>


<%
//스크립트릿(scriptlet) : jsp 페이지를 구성하기 위한 코드를 작성하는 영역
ProductDao productDao = new ProductDao();

List<ProductDto> productList = productDao.list();
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품리스트</title>
</head>

<body>
<h1>상품 리스트</h1>
<table border="1" width="600">
	<thead>
		<tr>
			<th>번호</th>
			<th>상품명</th>
			<th>상품타입</th>
			<th>상품가격</th>
			<th>생산일</th>
			<th>유통기한</th>
		</tr>
	</thead>

	<tbody>
		<%for(ProductDto productDto : productList){ %>
		<tr>
			<td><%=productDto.getNo() %></td>
			<td>
			<a href = "productDetail.jsp?productNo=<%=productDto.getNo()%>">
			<%=productDto.getName()%></a></td>
			<td><%=productDto.getType()%></td>
			<td><%=productDto.getPrice()%></td>
			<td><%=productDto.getMade() %></td>
			<td><%=productDto.getExpire()%></td>
		</tr>
		<%} %>
	</tbody>

</table>

</body>
</html>