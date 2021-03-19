package oop.poly1;

public class test2 {
public static void main(String[] args) {
	
	//배열을 이용하여 갤럭시 21s 5개와 아이폰 12 5개를 보관시켜보세요
	//정적타입으로 보면 갤럭시 배열과 아이폰 배열이 각각 필요하다.
	//동적타입으로 보면 phone 배열 10칸만 있으면 가능하다.!!!!!!!!!!!!!!!!!!!!!!!!! 다형성의 장점
	
	Galaxy21 []a = new Galaxy21[5];
	Iphone []b =new Iphone[5];
	
	Phone[] c = new Phone[10];
	
	//동적타입으로 하는 것이 훨 간단
	
	for(int i=0;i<10;i++) {
		
		if(i<5)
		c[i]= new Galaxy21();
		else
		c[i]=new Iphone();
		c[i].call();
		//개쩐다.......
	}
}
}
