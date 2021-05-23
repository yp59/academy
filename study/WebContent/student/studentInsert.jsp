<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="studentInsert.kh" method = "post" enctype = "multipart/form-data">
이름 : <input type="text" name="studentName" required>
	<br><br>
	이메일 <input type="text" name="studentEmail" required>
	<br><br>
	프로필 사진 : <input type="file" name="studentProfile" accept=".png, .jpg, .gif">
	<br><br>
	<input type="submit" value="등록">	 

</form>
</body>
</html>