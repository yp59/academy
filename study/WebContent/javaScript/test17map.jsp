<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8"/>
	<title>Kakao 지도 시작하기</title>
	<style>
	.kakao-map{
	width:500px;
	height:400px;
	}
	
	</style>
	<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=1ff5bb7b6670ebd0cf6593dad7903a60"></script>
	<script>
	function loadMap(){
		var container = document.querySelector(".kakao-map");
		var options = {
			center: new kakao.maps.LatLng(33.450701, 126.570667),
			level: 3
		};

		var map = new kakao.maps.Map(container, options);
	}
		</script>
</head>
<body onload="loadMap();">
	<div class="kakao-map"></div>
	
</body>
</html>