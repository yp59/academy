package condition;

import java.util.Calendar;
import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in =new Scanner(System.in);
		Calendar date= Calendar.getInstance();
		
		
		int charge =0;
		
		int birthday=in.nextInt();
		
		int year= date.get(Calendar.YEAR);
		
		int age = year-birthday+1;
		
		boolean old_and_baby=age>=65&&age<8;
		
		boolean adult=age<65&&age>=20;
		
		boolean youth=age<20&&age>=14;
		
		boolean child=age<14&&age>=8;
		
		
		
		if(old_and_baby) charge=0;
			
		else if(adult) charge=1250;
			
		else if(youth) charge=720;
		
		else if(child) charge=450;
		
		System.out.println(charge);
		
		
	}

}
