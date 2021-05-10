<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
//자바스크립트에서 객체는 복잡한 ㅔ이터를 말한다.
//배열 객체 등을 모두 포함한다.

//1.배열 : 정적배열 동적배열
// 정적배열 : 정해놓고 시작하는 배열

var a = [10,20,30,40,50];
console.log(a);

for(var i=0;i<a.length;i++){
	console.log(a[i]);
	
}
// 동적배열 : 크기만 정해ㅐ두고 시작
var b = new Array(5);
console.log(b);


b[1]=20;
for(var i=0;i<b.length;i++){
	console.log(b[i]);
	
}
	//2.객체 : 정적객체 동적개체
	//정적객체
	var e = {
			name: "홍길동",
			score: 78
	};
	console.log(e);
	console.log(e.name);
	console.log(e.score);
	console.log(e["name"]);
	//동적객체

	function Student(name,score){
		this.name=name;
		this.score=score;
	};
	
	var f = new Student("피카츄",90);
		console.log(f);

</script>
</head>
<body>

</body>
</html>