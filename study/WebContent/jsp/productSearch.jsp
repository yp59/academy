<%@page import="java.util.List"%>
<%@page import="study.beans.ProductDto"%>
<%@page import="study.beans.ProductDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><!-- 설정 -->
    
    <%
    String type = request.getParameter("type");
    String keyword = request.getParameter("keyword");
    
    ProductDao productDao = new ProductDao();
    List<ProductDto> productSearch = productDao.search(type, keyword);%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search</title>
</head>
<body>
<form action="productSearch.jsp">
	<fieldset>
		<legend>범위설정</legend>
			<select name="type">
				<option>과자</option>
				<option>주류</option>
				<option>사탕</option>
				<option>아이스크림</option>
			</select>>
			<input type="text" name= "keyword">
			<input type="submit" value= "입력">
	</fieldset>
</form>
<table border="1" width="600" >
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
	<%for(ProductDto productDto : productSearch){ %>
		<tr>
			<td><%=productDto.getNo() %></td>
			<td>
			<a href="productDetail.jsp?productNo=<%=productDto.getNo() %>">
			<%=productDto.getName() %></a></td>
			<td><%=productDto.getType() %></td>
			<td><%=productDto.getPrice() %></td>
			<td><%=productDto.getMade().substring(0, 10) %></td>
			<td><%=productDto.getExpire().substring(0, 10) %></td>
		</tr>
		<%} %>
	</tbody>
	
</table>
</body>
</html>