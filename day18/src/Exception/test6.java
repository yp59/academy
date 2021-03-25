package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		try {
		String name=in.next();
		String regex = "^[가-힣]{2,7}$";
		
		
		if(!Pattern.matches(regex, name)) {
			throw new InputMismatchException("2~7자 사이의 이름을 입력해주세요");
		}
		
		int lang =in.nextInt();
		int math= in.nextInt();
		int eng=in.nextInt();
		
		if(lang<0||lang>100||math<0||math>100||eng<0||eng>100) {
			throw new InputMismatchException("0~100사이의 점수를 입력해주세요");
		}
		
		int total = lang+math+eng;
		int avr = Math.round(total/3);
		
		System.out.println(total+"  "+avr);
		}
		
		
		catch(Exception e) {
			
			e.printStackTrace();//개발용으로 사용 이게 메인임
		}
		
		
		
	}

}
