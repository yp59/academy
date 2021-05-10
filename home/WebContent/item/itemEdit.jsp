<%@page import="home.beans.ItemDto"%>
<%@page import="home.beans.ItemDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	int itemNo = Integer.parseInt(request.getParameter("itemNo"));
	ItemDao itemDao = new ItemDao();
	ItemDto itemDto = itemDao.get(itemNo);
%>
    
<jsp:include page="/template/header.jsp"></jsp:include>

<div class="container-600">
	
	<div class="row">
		<h2>아이템 정보 수정</h2>
	</div>
	
	<form action="itemEdit.kh" method="post">
		<input type="hidden" name="itemNo" value="<%=itemDto.getItemNo()%>">
	
		<div class="row text-left">
			<label>아이템 이름</label>
			<input type="text" name="itemName" value="<%=itemDto.getItemName()%>" class="form-input">
		</div>
		
		<div class="row text-left">
			<label>아이템 판매가</label>
			<input type="text" name="itemPrice" value="<%=itemDto.getItemPrice()%>" class="form-input">
		</div>
		
		<div class="row">
			<input type="submit" value="수정" class="form-btn form-btn-positive">
		</div>
		
	</form>
	
</div>

<jsp:include page="/template/footer.jsp"></jsp:include>
