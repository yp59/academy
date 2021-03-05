package day04;
import java.util.*;
public class test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input =new Scanner(System.in);
		
		System.out.println("생년월일 입력");
		
		
		int birth = input.nextInt()-1;
		int line = 2021;
		boolean age=line-birth>=20;
		
		System.out.println(age);
		
	}

}
