package conditon2;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		for(int i=0;i<10;i++) {
			
		int x =	in.nextInt();
			
			if(x%2==1) System.out.println("홀수");

			else System.out.println("짝수");
		}
		
		
	}

}
