<%@page import="study.beans.ItemDto"%>
<%@page import="study.beans.ItemDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    int itemNo = Integer.parseInt(request.getParameter("itemNo"));
    
    ItemDao itemDao = new ItemDao();
    ItemDto itemDto = itemDao.get(itemNo);
    
    
    %>
    
    <!-- 화면출력 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>번호 : <%=itemDto.getItemNo() %></h1>
<h1>이름 : <%=itemDto.getItemName() %></h1>
<h1>가격 : <%=itemDto.getItemPrice() %></h1>


<h3><a href="/study/jsp/ItemEdit.jsp?itemNo=<%=itemNo%>">아이템 수정하기(절대경로)</a></h3>
<h3><a href="ItemEdit.jsp?itemNo=<%=itemNo%>">아이템 수정하기(상대경로)</a></h3>
<h3><a href="itemDelete.kh?itemNo=<%=itemDto.getItemNo()%>">상품 삭제하기</a></h3>
</body>
</html>