package oop.constructor2;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameData a = new GameData("뽀로로", "전사",50,50000);
		GameData b = new GameData("크롱", "마법사",35,20000);
		GameData c = new GameData("루피", "전사");
		
		a.result();
		b.result();
		c.result();
		
	}

}
