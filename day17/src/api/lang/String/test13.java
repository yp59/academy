package api.lang.String;

import java.util.regex.Pattern;

public class test13 {
//우편주소
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String address ="123456";
		String regex = "^[0-9]{5,6}$";
		String regex2 = "^([0-9]{5}|[0-9]{6})$";//괄호안 둘 중 하나 가능
		String regex3 = "^\\d{5,6}$"; //\\d는 모든 숫자와 같음 즉[0-9] = \\d
		if(Pattern.matches(regex3, address)) {
			
			System.out.println("good");
			
		}
		else
			System.out.println("re");
	}

}
