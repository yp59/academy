package oop.inherit6;

//전자제품 클래스
//형태는 있지만 내용은 알 수 없는 애매한 메소드를 가져야 한다.
//추상클래스(abstract class)

public abstract class Electronic {
	
	
	public abstract void on();
	public abstract void off();
	//추상 메소드 : 형태만 있는 메소드(자식 클래스가 반드시 재정의해야함)
	
	
}
