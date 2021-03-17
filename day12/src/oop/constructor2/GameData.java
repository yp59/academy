package oop.constructor2;

public class GameData {

	private String ID;
	private String job;
	private int level=1;
	private int gold=0;
	
	GameData(String ID,String job){
		this.setID(ID);
		this.setJob(job);
		}
	GameData(String ID,String job, int level, int gold){
		this.setID(ID);
		this.setJob(job);
		this.setLevel(level);
		this.setGold(gold);
		}
	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		switch(job) {
		case "전사" : 
			this.job=job;
		case "마법사" :
			this.job=job;
		case "궁수" :
			this.job=job;
		default :
			return;
		}
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}
	
	public void result() {
		System.out.println(ID+" "+job+" "+level+" "+gold+" ");
		
	}
	
}
