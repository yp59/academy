<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
<meta charset="UTF-8" />
<title>jQuery</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/design/common.css" />
<style></style>
<!-- 개발할 때는 uncompressed 버전, 개발 후 배포시에는 compressed(minify) 버전을 사용 -->
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<!-- <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script> -->
<script>
$(function () {
$('.total').click(function () {
					
$('.lang').each(function (index, data) {
						
if ($(this).prop("checked")) {
							
alert($(this).val());
					}
			});
		});
	});
</script>
</head>
<body>
<input type="checkbox" class="lang"  value="자바">
자바<br>							
<input type="checkbox" class="lang"  value="데이터베이스">
데이터베이스<br>								
<input type="checkbox" class="lang" value="JSP/Servlet">
JSP/Servlet<br>		
<input type="checkbox" class="lang" value="HTML/CSS">
HTML/CSS<br>
<input type="checkbox" class="lang" value="Javascript/jQuery">
Javascript/jQuery<br>			
<button class="total">제출</button>	
</body>
</html>
