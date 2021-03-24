package api.lang.String;

import java.util.regex.Pattern;

public class test16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String birthday="1899-12-31";
		String regex="^[12][09][0-9]{2}[-][01][0-9][-][0-3][0-9]$";
		
		
		if(Pattern.matches(regex, birthday)) {
			
			System.out.println("good");
		}
		else
			System.out.println("re");
	}

}
