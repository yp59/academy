<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
.navi{
width : 700px;
height : 50px;
padding : 0px;

}

.navi>li{
float : left;
list-style-type: none;
width: 25%;
height: 100%;
line-height : 50px;
background-color:black;/*a태그에 백그라운드가 아닌 리스트에 배경색을 넣어야함*/
text-align : center;/*가운데 정렬*/
}

.navi>li>a{
display : black;
width : 100%;
height : 100%;
/*background-color : black;*/
color : white;
text-align:left;
text-decoration : none;/*a태그 밑줄 제거*/
}

.navi>li:hover{/*a태그에 호버x*/
font-size: 130%;/*1.3배는 130%*/
font-weight: bold;
background-color : #212121;
}
</style>
</head>
<body>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<ul class="navi">

<li><a id="H" href="/html5.html">HTML5</a></li>

<li><a id="C" href="/css3.html">CSS3</a></li>

<li><a id="S" href="/javascript.html">JavaScript</a></li>

<li><a id="Q" href="/jQuery.html">jQuery</a></li>

</ul>
<script>
$(function(){
	$('a').click(function(){
		
		alert($(this).text()+" 페이지로 이동합니다.");//a태그에는 value가 없다	
	});
	
});
</script>
</body>
</html>