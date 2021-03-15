package oop.basic6;

class score{
	String name;
	int grade,lang,eng,math;
	int total;
	int avr;
	score(String name,int grade, int lang, int eng,
			int math)
	{
		this.name=name;
		this.grade=grade;
		this.lang=lang;
		this.eng=eng;
		this.math=math;
		this.total = lang+eng+math;
		this. avr =total/3;
		
	}
	void get() {
		System.out.println(name+"\n"+grade+"\n"+lang+"\n"+eng+"\n"+math+"\n"+total+"\n"+avr+"\n");
	}
}

public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		score a =new score("마리오",1,90,80,70);
		score b =new score("루이지",1,85,85,83);
		score c =new score("쿠파",3,70,60,55);
		
		a.get();
		b.get();
		c.get();

	}

}
