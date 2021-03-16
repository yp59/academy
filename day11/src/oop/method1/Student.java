package oop.method1;

public class Student {

	String name;
	int java;
	int database;
	
	
	void set(String name, int java,int database)
	{
		
		this.name=name;
		this.java=java;
		this.database=database;
	}
	
	void set(String name, int java)
	{
		this.name=name;
		this.java=java;
	}
	
	void set(int database)
	{
		this.database=database;
	}
	
	void result() {
		System.out.println(name);
		System.out.println(java);
		System.out.println(database);
		
	}
}
