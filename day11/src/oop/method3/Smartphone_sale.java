package oop.method3;

public class Smartphone_sale {

	private String name;
	private String telecom;
	private int agreement;
	private int price;
	
	void set(String name,String telecom,int agreement, int price) {
		
		this.setName(name);
		this.setTelecom(telecom);
		this.setAgreement(agreement);
		this.setPrice(price);
	}
	
	void setName(String name) {
		this.name=name;
	}
	void setTelecom(String telecom) {
		if(telecom.equals("SK")||telecom.equals("LG")||telecom.equals("KT"))	
			
			this.telecom=telecom;

	}		
	void setAgreement(int agreement) {
		
		if(agreement==24||agreement==30||agreement==36)
			
			this.agreement=agreement;

	}
	void setPrice(int price)
	{
		if(price>0)
		this.price=price;
	}
	
	void result() {
		
		System.out.println(name+"\n"+telecom+"\n"+agreement+"\n"+price+"\n");
	}
}
