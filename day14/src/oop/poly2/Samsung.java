package oop.poly2;

public abstract class Samsung extends Phone{//삼성폰 공통 기능 및 색상 필터링 클래스
	
	public Samsung(String color) {
			super(color);
	}
	
	public void setColor() {
		switch(color) {
		
		case "골드" : break;	
		case "실버" : break;
		case "아쿠아블루" :break;
		default : nonColor();
					
		
		}
	}
	public abstract void samsungStore() ;

	
}
