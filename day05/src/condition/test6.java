package condition;

import java.util.Scanner;

public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in =new Scanner(System.in);
		
		int person ;
		
		int term ;
		
		int month ;

		do{
			
			
		person = in.nextInt();
		
		term = in.nextInt();
		
		month =in.nextInt();
		
		}while(month>13) ;
		
		int price = 200000;
		
		int sale =0;
		
		int total=0;
		
		boolean spring =month>=3&&month<6; 
		boolean summer =month<9&&month>=6; 
		boolean authumn =month<12&&month>=9; 
		
		
		if(spring) sale=20;
		else if(summer) sale=5;
		else if(authumn) sale=10;
		else sale=25;
		
		total=person*price*term*(100-sale)/100;
		System.out.println(total);
		
	}

}
