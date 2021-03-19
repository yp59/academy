package oop.poly2;

public class Iphone12 extends Apple{

	public Iphone12(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("Iphone12의 전화를 실행합니다.");
	}

	@Override
	public void sms() {
		// TODO Auto-generated method stub
		System.out.println("Iphone12의 sms를 실행합니다.");

	}

	@Override
	public void Siri() {
		// TODO Auto-generated method stub
		System.out.println("Iphone12의 Siri를 실행합니다.");

	}

	public void ICloud() {
		System.out.println("Iphone12의 ICloud를 실행합니다.");

		
	}

}
