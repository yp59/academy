package api.lang.String;

import java.util.regex.Pattern;

public class test16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1900-01-01 부터 2099-12-31까지 생년월일

		String birthday="1900-04-30";
		String regex="^((19|20)[0-9]{2})-(0[1-9]|1[0-2])-(0[1-9]|1[0-9]|2[0-9]|3[01])$";
		String regex2="^((19|20)[0-9]{2})-((0[13578]|1[02])-(0[1-9]|[12][0-9]|3[01])|(0[469]|11)-(0[1-9]|[12][0-9]|30)|02-(0[1-9]|[12][0-9]))$";
		//큰달 작은달 구분하는 표준식																		
		//윤년계산은 자바로 따로해야함
		if(Pattern.matches(regex2, birthday)) {
			
			System.out.println("good");
		}
		
		else
			System.out.println("re");
	}

}
