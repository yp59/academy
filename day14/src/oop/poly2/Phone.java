package oop.poly2;

public abstract class Phone {//스마트폰의 공통 기능 클래스(조상 클래스)
	
	protected int number;
	protected String color;
	
	
	public Phone(String color) {
			
			this.color=color;//생성자 만들어주면서 setColor 메소드 실행으로 color 유효성 검사
			setColor();// 색상 필터링 기능  apple클래스와 samsung클래스에 구현.
	}				
	
	public String getColor() {
		return color;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public abstract void call();
	public abstract void sms();
	public abstract void setColor() ;
	
	public void nonColor() {
		this.color=null;
		System.out.println("잘못된 색상입니다.");
		
	}
}
