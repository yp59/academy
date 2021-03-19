package oop.poly1;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//다형성으로 상위 클래스로 타입을 통합시키면 뭐가좋다?
		//동적 타입(다형성)
		Phone a = new Galaxy21();
		Phone b = new Iphone();
		a.call();	
		b.call();
	}

}
