package oop.inherit1;

public class Phone {
	
	public Phone(String number) {
		this.number=number;
	}
	private String number;
	
	public static void call() {
		
		System.out.println("전화기능");
	}
	
	public void sms() {
		
		System.out.println("문자기능");
	}
	
	public void camera() {
		
		System.out.println("사진기능");
	}
}
