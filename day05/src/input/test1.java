package input;

import java.util.*;

public class test1 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		Scanner input =new Scanner(System.in);
		
		int birthday = input.nextInt();
		
		boolean adult = 2022-birthday>=20;
		
		int age = 2022-birthday;
		
		if(adult) System.out.println("성인입니다. 나이는 "+age);
			
		else System.out.println("급식입니다 나이는 "+age);
	}

}
