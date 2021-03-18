package oop.inherit2;

public class Doll {
	
	private String name;
	private int price;
	
	public Doll(String name, int price) {
		this.name=name;
		this.price=price;
	}
	
	
	public void Hello() {
		
		System.out.println("안녕");
	}
	public void x() {
		
		System.out.println(name+price);
	}
}
