package api.lang.String;

import java.util.regex.Pattern;

public class test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정규표현식(Regular Expression, regex라 부름)
		//http://www.regexper.com  사이트 참조해서 사용하면 매우 편하다.
		
		String id= "@@@khs-_tudent1234";
		String regex="^[a-z0-9-_]{5,20}$";
		
		if(Pattern.matches(regex, id)) {
			
			System.out.println("good");
		}
		else
			System.out.println("mno");
	}
	

}
