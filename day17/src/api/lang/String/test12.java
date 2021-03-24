package api.lang.String;

import java.util.regex.Pattern;

public class test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//비밀번호 영문대문자,영문소문자,숫자,특수문자(!@#$)중에서 8~16자 이내로 작성
		
		String password ="jyp5760";
		
		String rule ="^[A-Za-z0-9!@#$]{8,16}$";
		
		if(Pattern.matches(rule, password)) {
			
			System.out.println("good");
			
		}
		else
			System.out.println("re");
	}

}
