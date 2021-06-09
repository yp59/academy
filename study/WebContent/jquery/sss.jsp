<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<title></title><script src="https://code.jquery.com/jquery-3.6.0.js"></script>
    <script>
 $(function(){
	
	$('#d').click(function(){
		console.log($('#d:checked').val()); 
		$('#x').click(function(){
			$('#s').html($('#d').val());
		});	
	});
	
	/*$('#y').click(function(){
		opener.window.location = 'popuptest.jsp'; //호출한 부모창 새로열기 
	    // 호출 한 뒤 현재 팝업 창 닫기 이벤트
	    close();
		
	});	
	*/
	
	$('#y').click(function(){
		window.opener.name="popuptest.jsp";
		
		
	});
 });
       
    </script>
</head>
    <body>
    <input id = "d" type= "checkbox" value = "xxx">
    <br>
    <input type = "button" id ="x"><span id ="s"></span>
    <input type = "button" id ="y">
       </body>
</html>