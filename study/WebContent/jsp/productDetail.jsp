<%@page import="study.beans.ProductDto"%>
<%@page import="study.beans.ProductDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    int productNo = Integer.parseInt(request.getParameter("productNo"));
    
    ProductDao productDao = new ProductDao();
    ProductDto productDetail = productDao.get(productNo);
    
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>detail</title>
</head>
<body>
상품번호 : <%=productDetail.getNo() %><br>
상품이름 : <%=productDetail.getName() %><br>
상품가격 : <%=productDetail.getPrice() %><br>
<a href="productDelete.kh?productNo=<%=productDetail.getNo()%>">삭제하기</a>
</body>
</html>