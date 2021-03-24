package api.lang.String;

import java.util.regex.Pattern;

public class test13 {
//우편주소
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String address ="123456";
		String regex = "^[0-9]{5,6}$";
		
		if(Pattern.matches(regex, address)) {
			
			System.out.println("good");
			
		}
		else
			System.out.println("re");
	}

}
