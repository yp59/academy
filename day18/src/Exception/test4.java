package Exception;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//예외와 오류 (Exception and error)
		//오류 실행이 절대 불가능한 상황
		//예외 실행 이후에 발생하는 돌발 상황(오류가 날 수도 안날 수도 있다.)
		try {
		Scanner in = new Scanner(System.in);
		System.out.println("정산금액 :");
		int money = in.nextInt();
		System.out.println("인원 수 : ");
		int people = in.nextInt();
		
		int pricePerPerson = money/people;
		int change = money%people;
		
		System.out.println("내야할 돈은 인당 "+pricePerPerson);
		System.out.println("지원금 : "+change);
		}
		catch(RuntimeException e) {//RuntimeException 과 자시글래스들을 처리하는 블록
			e.printStackTrace();//개발용으로 사용 이게 메인임
			System.err.println("오류발생");
			System.out.println(e.getClass());
			System.out.println(e.getMessage());
		}
		
	}

}
