<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아이템 등록</title>
</head>
<body>

<h1>아이템 정보 입력</h1>
<form action="itemInsert2.kh" method="post">

이름 : <input type = "text" name="itemName" required>

<br>

가격 : <input type = "number" name="itemPrice" required>

<br>

<input type="submit" value="입력">

</form>



</body>
</html>