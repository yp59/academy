package oop.poly2;

public abstract class Apple extends Phone{ //애플폰 공통 기능 및 색상 필터링 클래스

	
	public Apple(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void setColor() {
		// TODO Auto-generated method stub
		switch(color) {
		
		case "화이트" : break;
		case "블랙" : break;
		case "핑크" : break;
		default : nonColor();
		}
	}
	public abstract void Siri();
}
