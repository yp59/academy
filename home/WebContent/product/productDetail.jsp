<%@page import="home.beans.ProductDto"%>
<%@page import="home.beans.ProductDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%int productNo = Integer.parseInt(request.getParameter("productNo"));
ProductDao productDao = new ProductDao();
ProductDto productDto = productDao.get(productNo);
%>
<jsp:include page="/template/header.jsp"></jsp:include>

<div class = "container-600">

<div class ="row">
<h2>상품 상세보기</h2>
</div>
</div>

<div class = "row">
<table class = "table table-border">
	<thead>
		<tr>
			<th>상품번호</th>
			<th>상품이름</th>
			<th>상품분류</th>
			<th>상품판매가</th>
			<th>상품제조일</th>
			<th>상품유통기한</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td><%=productDto.getNo() %></td>
			<td><%=productDto.getName() %></td>
			<td><%=productDto.getType() %></td>
			<td><%=productDto.getPrice() %></td>
			<td><%=productDto.getMade() %></td>
			<td><%=productDto.getExpire() %></td>
		</tr>
	</tbody>
</table>
<div class="row text-right" >
<a href = "productEdit.jsp">
수정
</a>
</div>
</div>
<jsp:include page="/template/footer.jsp"></jsp:include>
