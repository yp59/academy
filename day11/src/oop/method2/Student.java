package oop.method2;

public class Student {

	String name;
	int java;
	int database;
	
	//변수마다 설정하는 메소드를 1개씩은 만들자 setter method?
	//메소드로 값을 설정하는이유는 값을 필터링 하기 위해서
	//클래스를 복잡하게 만들어도 메인문은 깔끔하게 만들자 
	
	//filtering 메소드를 이해하자.
	void set(String name, int java,int database)
	{
		
		this.setName(name);
		this.setJava(java);
		this.setDatabase(database);
	}

	void setName(String name)
	{
		this.name=name;
	}
	
	void setJava(int java)
	{	if(java>=0 && java<=100)
		this.java=java;
	}
	
	void setDatabase(int database)
	{	if(database>=0 && database<=100)
		this.database=database;
	}
	
	void result() {
		System.out.println(name);
		System.out.println(java);
		System.out.println(database);
		
	}
}
