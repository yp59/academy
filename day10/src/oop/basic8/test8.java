package oop.basic8;
import java.util.Scanner;
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

public class test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int [][]gr= new int[5][4];
		
		for(int i=0;i<gr.length;i++) {
			
			for(int j=0;j<gr[i].length;j++)
			gr[i][j]=in.nextInt();
		}
		
		score a =new score("마리오",gr[0][0],gr[0][1],gr[0][2],gr[0][3]);
		score b =new score("루이지",gr[1][0],gr[1][1],gr[1][2],gr[1][3]);
		score c =new score("쿠파",gr[2][0],gr[2][1],gr[2][2],gr[2][3]);
		score d =new score("피치공주",gr[3][0],gr[3][1],gr[3][2],gr[3][3]);
		score e =new score("버섯돌이",gr[4][0],gr[4][1],gr[4][2],gr[4][3]);

		a.get();
		b.get();
		c.get();
		d.get();
		e.get();
	}

}
