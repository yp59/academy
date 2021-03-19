package oop.poly2;

public class Random {// 색상 랜덤으로 뽑아주는 기능 구현

	public static String Gpick() {
		String color ="";
		double ran = Math.random();
		
		if(ran<(1/3.0)) color = "골드";
		else if(ran<(2/3.0)) color = "실버";
		else if(ran<1.0) color = "아쿠아블루";
		
		return color;
	}
	public static String Ipick() {
		String color ="";
		double ran = Math.random();
		
		if(ran<(1/3.0)) color = "화이트";
		else if(ran<(2/3.0)) color = "블랙";
		else if(ran<1) color = "핑크";
		
		return color;
	
}

}