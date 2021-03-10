package loop;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		
		
		int total=0;
		int count=0;
		while(total<100) {
			
			int x =in.nextInt();
			
			total+=x;
			count++;
			if(total>100)break;
			System.out.println(count+": 입력횟수 "+total+": 더한합계");
			
			
		}
	}

}
