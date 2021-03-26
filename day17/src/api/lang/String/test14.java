package api.lang.String;

import java.util.regex.Pattern;

public class test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name2= "송이";
		String name = "장미꽃이";
		
		String regex = String.format("^[가-힣]{2,%d}$", name.length());
		String regex2 = "^[가-힣]{2,%d}$";
		System.out.println(Pattern.matches(regex, name));
	}

}
