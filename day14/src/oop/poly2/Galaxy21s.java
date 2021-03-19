package oop.poly2;

public class Galaxy21s extends Samsung{

	public Galaxy21s(String color){		
		
		super(color);
		
	}
	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("galaxy21s의 전화를 실행합니다.");
	}
	@Override
	public void sms() {
		// TODO Auto-generated method stub
		System.out.println("galaxy21s의 sms 기능을 실행합니다.");
	}
	public void bixby() {
		
		System.out.println("galaxy21s의 빅스비 기능을 실행합니다.");
	}
	public void samsungStore() {
	System.out.println("galaxy21s의 삼성스토어 기능을 실행합니다.");
	
	}
	
}
