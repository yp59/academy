<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>jQuery</title>
	
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/design/common.css">
	<style>
	
	</style>
	
<!-- 	개발할 때는 uncompressed 버전, 개발 후 배포시에는 compressed(minify) 버전을 사용 -->
	<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<!-- 	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script> -->
	<script>
		$(function(){
		$(".submit-btn").click(function(){
			var text = "";
			
			$(".item-all").each(function(idx){
				if($(this).is(":checked")){
					text+=$(this).val();
				}
				
			});
			$(".result").text(text);
		});	
	});
	</script>
</head>
<body>
	<h2>가장 재미있는 과목은? (복수선택 가능)</h2>
	<hr>
	<label><input type="checkbox" class="item-all" value="자바"><span>자바</span></label><br>
	<label><input type="checkbox" class="item-all" value="데이터베이스"><span>데이터베이스</span></label><br>
	<label><input type="checkbox" class="item-all" value="JSP/Servlet"><span>JSP/Servlet</span></label><br>
	<label><input type="checkbox" class="item-all" value="HTML/CSS"><span>HTML/CSS</span></label><br>
	<label><input type="checkbox" class="item-all" value="Javascript/JQuery"><span>Javascript/jQuery</span></label>
	<hr>
	<button class="submit-btn">제출</button>
	<div class="result"></div>
</body>
</html>