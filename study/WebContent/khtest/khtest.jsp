<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="kr">
<head>

  <meta charset="UTF-8">  
 
  <title>색상선택</title>
  <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
  <style>
  
    #box{
      background-color: black;
      width: 100px;
      height: 100px;
    }
    p>span{
      font-weight: bold;
    }
  </style>
</head>
<body>
  <h2>사각형의 색상을 선택하세요</h2>
  <hr>
  <button class="butt">red</button>
  <button class="butt">orange</button>
  <button class="butt">yellow</button>
  <button class="butt">green</button>
  <button class="butt">blue</button>
  <hr>
  <div id="box"></div>
  <p>선택한 색상은 <span id="color">검정색</span>입니다.</p>
  <script>
    var btn = document.getElementsByTagName('button');    
    $(function(){
		$(".butt").click(function(){
			
			 var box = document.getElementById('box');
		        
		        box.style.backgroundColor = "#000000";
		
		});
	}); 
    for(var i=0;i<btn.length;i++){
      
    	btn.onclick = function(){
	        var selectedColor = this.innerHTML;
	        var box = document.getElementById('box');
	        
	        box.style.backgroundColor = "#000000";
	        
	        var color = document.getElementById('color');
	        
	        color.innerHTML = selectedColor;        
      }
    }
  </script>
</body>
</html>​​