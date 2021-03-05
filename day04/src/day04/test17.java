package day04;
import java.util.*;
public class test17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in =new Scanner(System.in);
		
		
		System.out.println("첫번째 과목 점수");
		int first=in.nextInt();
		System.out.println("두번째 과목 점수");
		int second=in.nextInt();
		
		boolean hell = first<40||second<40;
		boolean score = (first+second)/2.0>=60;
		

		if(hell) System.out.println("과락");
		else
		{
			if(score) System.out.println("이수");
			else System.out.println("미이수");
			
		}
		
	}

}
