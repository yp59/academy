package api.lang.String;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in= new Scanner(System.in);
		
		
		String ban = new String("운영자");
		
		while(true) {
			
			String name = new String(in.next());
			
		if(name.equals(ban)) {
			System.out.println("이름바꿔 운영자 안됨");
			continue;
		}
		
		if(name.length()>10||name.length()<3) {
			System.out.println("너무 짧거나 길어");
			continue;
		}
		if(name.charAt(0)>='0'&&'9'>=name.charAt(0)) {
			
			System.out.println("이름 바꿔 숫자 안됨");
			continue;
		}
			break;
		}
		System.out.println("ㅇㅋ 완료");
	}

}
