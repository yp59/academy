<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<jsp:include page="/template/header.jsp"></jsp:include>

<div class="container-600">
<div class="row">
<h2>아이템 정보 입력</h2>
</div>

<form action="productInsert.kh" method="post">

<div class = "row text-left">
<label>상품 이름</label>
<input type="text" name="productName"required class="form-input">
</div>
<div class = "row text-left">
<label>상품 타입</label>
<select name="productType">
<option>주류</option>
<option>아이스크림</option>
<option>사탕</option>
<option>과자</option>
</select>
</div>
<div class = "row text-left">
<label>상품 가격</label>
<input type="number" name="productPrice"required class="form-input">
</div>
<div class = "row text-left">
<label>제조일자</label>
<input type="date" name="productMade"required>
</div>
<div class = "row text-left">
<label>유통기한</label>
<input type="date" name="productExpire"required>
</div>
<div class="row text-left">
<input type="submit" value="등록"class="form-btn form-btn-positive">
</div>
</form>
</div>
<jsp:include page="/template/footer.jsp"></jsp:include>
