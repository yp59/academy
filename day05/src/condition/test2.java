package condition;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in =new Scanner(System.in);
		
		int money= in.nextInt();
		
		int rice =3000;
		int omelt =7000;
		int black=5000;
		int chicken=15000;
		
	
		
		if(money>=15000)
			System.out.println("치킨가능");
		
		if(money>=7000)
			System.out.println("오므라이스가능");
		
		if(money>=5000)
			System.out.println("짜짱가능");
		
		if(money>=3000)
			System.out.println("떡가능");
		
	}
	
	}


