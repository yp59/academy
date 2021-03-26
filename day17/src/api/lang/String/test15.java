package api.lang.String;

import java.util.regex.Pattern;

public class test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String number = "010-4224-4840";
//		String regex ="^[0-9]{3}[-][0-9]{4}[-][0-9]{4}$"; 이전 식
		String regex ="^010-[1-9][0-9]{3}[-][0-9]{4}$";//() | 쓰면 (|) 둘중에 하나?
		
		if(Pattern.matches(regex, number)) {
			System.out.println("good");
			
		}
		else
			System.out.println("re");
	}

}
