package oop.poly2;

public class test {// 메인문으로 랜덤 핸드폰 뽑기

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Samsung []a =new Samsung[10]; 
		
		Apple []b = new Apple[10];
		
		Phone []c =new Phone[10];
		
		
		Pick.SamsungPhone(a);
		
		Pick.ApplePhone(b);
		
		Pick.SmartPhone(c);
	}

}
