package oop.modifier1;

public class Student {
	private String name;
	private	int java;
	private int database;
	//private 클래스 외부의 접근을 차단하는 키워드 (메소드로 접근시켜야 조건을 달아 필터링이 가능하다.)
	//setter method : 변수당 1개씩, 필요하다면 여러개 설정하는 것 추가
	//변수를 제외한 나머지는 거의 다 public 하는게 좋다.
	public void setName(String name) {
		this.name = name;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public void setDatabase(int database) {
		this.database = database;
	}
	public void set(String name, int java, int database) {
		this.setName(name);
		this.setJava(java);
		this.setDatabase(database);
	}
	
	//getter method : 변수당 1개씩, 필요하다면 다른 계산을 할 수 있는 것 추가
	public String getName() {
		return this.name;
	}
	public int getJava() {
		return this.java;
	}
	public int getDatabase() {
		return this.database;
	}
	//가상의 getter method도 추가 가능
	public int getTotal() {
		return this.java + this.database;
	}
	public double getAverage() {
		//return (this.java + this.database) / 2.0;
		return this.getTotal() / 2.0;
	}
}

