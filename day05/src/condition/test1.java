package condition;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//7의 배수 판별
		
		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt();
		
		if(x%7==0) {
			
			System.out.println("7 배수");
		}
		else
			System.out.println("아님 ");
		
		
	}

}
