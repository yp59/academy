package oop.modifier2;

public class Ski {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UsePrice a = new UsePrice("주간권",  900, 1800, 80000, 64000);
		UsePrice b = new UsePrice("야간권", 1900, 2200, 60000, 42000);
		UsePrice c = new UsePrice("심야권", 2000, 2359, 45000, 32000);
		
//		a.set("주간권",  900, 1800, 80000, 64000);//0900으로 하면 범위를 벗어났다는 에러는 int 문으로 0으로 시작하면byte로 인식
//		b.set("야간권", 1900, 2200, 60000, 42000);
//		c.set("심야권", 2000, 2359, 45000, 32000);
		a.out();
		b.out();
		c.out();
	}

}
