package oop.modifier2;

public class UsePrice {
	private String day;
	private int StartTime;
	private int EndTime;
	private int Adultfee;
	private int Kidsfee;
	
	
	UsePrice(String day,int StartTime,int EndTime,int Adultfee,int Kidsfee) {//set 메소드를 편하게 쓰기 위함
																			 //set= 생성자를 몰랐을때 썼던거
		
		this.setName(day);
		this.setStartTime(StartTime);
		this.setEndTime(EndTime);
		this.setAdultfee(Adultfee);
		this.setKidsfee(Kidsfee);
	}
	
	
	public void setName(String day) {
		this.day=day;
		
	}
	public void setStartTime(int StartTime) {
		if(StartTime>=0||StartTime<2400) this.StartTime=StartTime;
		
	}
	public void setEndTime(int EndTime) {
		if(EndTime>=0||EndTime<2400) this.EndTime=EndTime;
		
	}
	public void setAdultfee(int Adultfee) {
		if(Adultfee<0) return;
		this.Adultfee=Adultfee;
		
	}
	public void setKidsfee(int Kidsfee) {
		if(Kidsfee<0) return;
		this.Kidsfee=Kidsfee;
		
	}
	
	public void out() {
		
		System.out.println(day+"  "+StartTime+"  "+EndTime+"  "+Adultfee+"  "+Kidsfee+"  "+getUseHour()+"  ");
	}
	
/*	생성자 있으면 필요가 없다.
 * public void set(String day,int StartTime,int EndTime,int Adultfee,int Kidsfee) {
		
		this.setName(day);
		this.setStartTime(StartTime);
		this.setEndTime(EndTime);
		this.setAdultfee(Adultfee);
		this.setKidsfee(Kidsfee);
	}*/
	
	public int getUseHour() {
		int Ehour=EndTime/100;
		int Eminute=EndTime%100;
		int ETime = Ehour*60+Eminute;
		
		int Shour=StartTime/100;
		int Sminute=StartTime%100;
		int STime = Shour*60+Sminute;
		
		int Calculate = ETime-STime;
		
		int hour = Calculate/60*100;
		int minute =Calculate%60;
		return (hour+minute);
	}
	
	
}
