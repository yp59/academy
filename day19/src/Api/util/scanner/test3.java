package Api.util.scanner;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문장읽기
		
		String song = "떳따떴따\n뺑기\n나라라\n나라라";
		
		Scanner in = new Scanner(song);
		
		while(in.hasNext()) {
			
			System.out.println(in.nextLine());
		}
		
	}

}
