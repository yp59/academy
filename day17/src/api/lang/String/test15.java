package api.lang.String;

import java.util.regex.Pattern;

public class test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String number = "010-4224-4840";
		String regex ="^[0-9]{3}[-][0-9]{4}[-][0-9]{4}$";
		
		if(Pattern.matches(regex, number)) {
			System.out.println("good");
			
		}
		else
			System.out.println("re");
	}

}
