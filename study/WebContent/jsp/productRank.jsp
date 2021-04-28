<%@page import="study.beans.ProductDao"%>
<%@page import="study.beans.ProductDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%
 //scriptlet(스크립트릿)
 int top;
 int low;
 try{
 top = Integer.parseInt(request.getParameter("top"));
 low = Integer.parseInt(request.getParameter("low"));
 }catch(Exception e){
	 top=1;
	 low=10;
 }
 ProductDao productDao = new ProductDao();
List<ProductDto> productRank = productDao.rank(top,low);
 %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>1부터 5까지</title>
</head>

<body>
<h1>1부터 3까지 가장 비싼 상품</h1>
<form action="productRank.jsp">
	<fieldset>
	<legend>범위설정</legend>
	
	<input type="number" name="top">부터
	<input type="number" name="low">까지
	<input type="submit"value="보기">
	
	</fieldset>
	
	
</form>
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
	<%for(ProductDto productDto : productRank){ %>
		<tr>
			<td><%=productDto.getNo() %></td>
			<td><%=productDto.getName() %></td>
			<td><%=productDto.getType() %></td>
			<td><%=productDto.getPrice() %></td>
			<td><%=productDto.getMade() %></td>
			<td><%=productDto.getExpire() %></td>
		</tr>
		<%} %>
	</tbody>
	
</table>
</body>
</html>