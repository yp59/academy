package input;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in =new Scanner(System.in);
		
		int start_time = in.nextInt();
		int end_time = in.nextInt();
	
	int shour=start_time/100;
	int sminute=start_time%100;	
	int ehour=end_time/100;
	int eminute=end_time%100;		

	int st=shour*60+sminute;
	int et=ehour*60+eminute;
	int time=et-st;
	
	int hour=time/60;
	int minute=time%60;
	
		System.out.println(hour+":"+minute);
	}

}
