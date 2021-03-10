package loop;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
	
	Scanner in =new Scanner(System.in);
	
	int x= in.nextInt();
	
	while(x!=0) {
		
		System.out.println("0입력시 종료");
		x= in.nextInt();
	}
		
	}
}
