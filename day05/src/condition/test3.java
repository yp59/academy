package condition;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner in = new Scanner(System.in);
		
		int month = in.nextInt();
		
		int day=in.nextInt();
		
		boolean sale_month = month>=6&&month<=8;
		
		int price=100000;
		
		int sale=20;
		
		int total;
		if(sale_month) {
			
		total=day*price*(100-sale)/100;
			
		}
		else {
			total=day*price;
		
		}
		System.out.println(total);
	}

}
