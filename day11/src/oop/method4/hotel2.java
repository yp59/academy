package oop.method4;

public class hotel2 {

	private String roomName;
	private int person;
	private int lowSeason;
	private int peakSeason;
	private int midSeason;
	private int avrPrice;
	void set(String roomName,int person,int lowSeason,int midSeason, int peakSeason) {
		
		this.setRoomName(roomName);
		this.setPerson(person);
		this.setlowSeason(lowSeason);
		this.setmidSeason(midSeason);
		this.setpeakSeason(peakSeason);

	}
	
	void setRoomName(String roomName) {
		this.roomName=roomName;
	}
	void setPerson(int person) {
		if(person>=2)
			this.person=person;

	}		
	void setlowSeason(int lowSeason) {
		if(lowSeason<0)	
			return;
		this.lowSeason=lowSeason;
		
	}
	void setmidSeason(int midSeason) {
		if(midSeason<0)	
			return;
		this.midSeason=midSeason;
	
}
	void setpeakSeason(int peakSeason) {
		if(peakSeason<0)	
			return;
		this.peakSeason=peakSeason;
	
}
	
	
	void result() {
		
		System.out.println(roomName+"  "+person+"  "+lowSeason+"  "+midSeason+"  "+peakSeason);
	}
	
	void setAvr() {
		avrPrice=(lowSeason+midSeason+peakSeason)/3;
		
	}
	int getAvr() {
		
		return avrPrice;
	}
	
	int difference(int standard,int deluxe) {
		
		return (deluxe-standard);
	}
}
