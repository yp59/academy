package oop.method4;

public class homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//오버로딩 말하는거 같은데
		
		hotel2 a = new hotel2();
		hotel2 b = new hotel2();
		hotel2 c = new hotel2();
		
		a.set("스탠다드룸",4,10,20,25);
		a.result();
		b.set("슈페리어룸",4,15,25,30);
		b.result();
		c.set("디럭스룸",6,30,45,55);
		c.result();
		
		a.setAvr(); c.setAvr();
		
		System.out.println();
		System.out.println("standard평균가 : "+a.getAvr());
		System.out.println("deluxe평균가 : "+c.getAvr());
		System.out.println(a.difference(a.getAvr(), c.getAvr())+"만원");
		
		//만원단위로 맞추고 나머지는 버렸습니다.
	}

}
