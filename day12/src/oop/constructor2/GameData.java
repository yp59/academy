package oop.constructor2;

public class GameData {

	private final String ID; //final은 최초 한번만 값을 지정하고 잠그기 때문에 set메소드를 또 생성은 불가함 set가 ID란 값을 바꾸기 위해 존재하는 메소드이기 때문에
	private String job;
	private int level;
	private int gold;
	
	GameData(String ID,String job){
		this.ID=ID;
		this.setJob(job);
		this.setLevel(1);
		this.setGold(0);
		}
	GameData(String ID,String job, int level, int gold){
		this.ID=ID;
		this.setJob(job);
		this.setLevel(level);
		this.setGold(gold);
		}
	public String getID() {
		return ID;
	}

	/*public void setID(String iD) {
		  this.ID = iD;
	}
*/
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
