<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>카카오 지도 불러오기</title>
	<style>
		.kakao-map {
			border:1px solid black;
			width:500px;
			height:400px;
		}
	</style>
	<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=1ff5bb7b6670ebd0cf6593dad7903a60"></script>
	<script>
		var map;
	
		function loadMap(){
			
			//지도를 표시할 영역을 선택하는 코드
			var container = document.querySelector(".kakao-map");
			
			//지도의 표시 옵션을 설정하는 코드
			var options = {
				center: new kakao.maps.LatLng(37.566286, 126.977929), //지도의 중심좌표.
				level: 3 //지도의 레벨(확대, 축소 정도)
			};
			//지도 생성 및 객체 리턴 코드
			map = new kakao.maps.Map(container, options); 
		}
		
		function changeMapPosition(){
			var latInput = document.querySelector("input[name=lat]");
			var lngInput = document.querySelector("input[name=lng]");
			
			var lat = parseFloat(latInput.value);
			var lng = parseFloat(lngInput.value);
			
			//위도 : 0~90
			//경도 : 0~180
			var correct = lat && lat >= 0 && lat <= 90 && lng && lng >= 0 && lng <= 180;
			if(correct){
				var loc = new kakao.maps.LatLng(lat, lng);
// 				map.setCenter(loc);
				map.panTo(loc);
			}
			else{
				window.alert("올바른 위도 경도를 입력하세요");
			}
		}
	</script>
</head>
<!-- onload는 로딩이 완료된 시점을 의미한다 -->
<body onload="loadMap();">
	<input type="text" name="lat" placeholder="위도">
	<input type="text" name="lng" placeholder="경도">
	<input type="button" value="보기" onclick="changeMapPosition();">
	<hr>
	<div class="kakao-map"></div>
</body>
</html>