package api.lang.String;

import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in =new Scanner(System.in);
		
		String front = "바나나";
		
		int FWord = front.length()-1;
		
		String back= in.next();
		
		int Bword = 0;
		
		boolean chain = back.charAt(Bword)==front.charAt(FWord);
		
		
			if(back.length()==3&&chain) {
				System.out.println("success");
				
			}
			
			
		
		
		
		
	}

}
