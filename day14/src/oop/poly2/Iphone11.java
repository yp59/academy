package oop.poly2;

public class Iphone11 extends Apple{

	public Iphone11(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("Iphone11의 전화를 실행합니다.");
	}

	@Override
	public void sms() {
		// TODO Auto-generated method stub
		System.out.println("Iphone11의 sms를 실행합니다.");

	}

	@Override
	public void Siri() {
		// TODO Auto-generated method stub
		System.out.println("Iphone11의 Siri를 실행합니다.");

	}

	public void ITunes() {
		System.out.println("Iphone11의 ITunes를 실행합니다.");

		
	}

	}


