package oop.constructor;

public class Student {

	private String name;
	private int java;
	private int database;
	
	Student(String name){//생성자는 필수 정보 설정을 할때 기본값으로 넣어야 하는 값들을 
		this.setName(name);

	}
	Student(String name, int java, int database){
		this.setName(name);
		this.setJava(java);
		this.setDatabase(database);
	}
	
	 public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getDatabase() {
		return database;
	}

	public void setDatabase(int database) {
		this.database = database;
	}

	
}
