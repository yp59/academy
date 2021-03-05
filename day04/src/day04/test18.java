package day04;

public class test18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char a='A';
		System.out.println(a);
		System.out.println((int)a);
		
		int b= a;
		System.out.println(b);
		
		int c = 44032;
		char d = (char) c;
		
		System.out.println(d);
		
		char ch ='H';
		boolean upper = 'A'<=ch&&ch<='Z';
		boolean lower = 'a'<=ch&&ch<='z';
		boolean alpha = upper||lower;
		System.out.println(alpha);
		
	}

}
