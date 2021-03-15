package oop.basic3;

public class Olympic_record {

	String name;
	String event;
	int gold;
	int silver;
	int bronze;
	
	 Olympic_record(String name,String event,int gold, int silver, int bronze) {
	
		 this.name=name;
		 this.event=event;
		 this.gold=gold;
		 this.silver=silver;
		 this.bronze=bronze;
	 }
	
	 void output() {
		 
		 System.out.println(name+"\n"+event+"\n"+gold+"\n"+silver+"\n"+bronze);
		 
	 }
	 
	
}
