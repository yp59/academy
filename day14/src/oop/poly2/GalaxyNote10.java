package oop.poly2;

public class GalaxyNote10 extends Samsung{

	
	public GalaxyNote10(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("GalaxyNote10의 전화를 실행합니다.");
	}
	@Override
	public void sms() {
		// TODO Auto-generated method stub
		System.out.println("GalaxyNote10의 sms 기능을 실행합니다.");
	}
	
	public void samsungStore() {
		System.out.println("GalaxyNote10의 삼성스토어 기능을 실행합니다.");
		
		}
	public void bixby() {
		
		System.out.println("GalaxyNote10의 빅스비 기능을 실행합니다.");
	}
	

	
}
