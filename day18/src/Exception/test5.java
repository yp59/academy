package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//예외와 오류 (Exception and error)
		//자바가 이해하지 못하는 예외를 강제로 지정해줘야 하는 경우가 있다.
		//강제 예외라 한다.
		
		try {
		Scanner in = new Scanner(System.in);
		System.out.println("정산금액 :");
		int money = in.nextInt();
		if(money<0) {
			//실행을 멈추고 catch블록으로 집어 던지는 코드
			throw new InputMismatchException("정산 금액이 음수일 수 없다.");
		}
		
		System.out.println("인원 수 : ");
		int people = in.nextInt();
		if(people<0) {
			//실행을 멈추고 catch블록으로 집어 던지는 코드
			throw new InputMismatchException("사람이 음수일 수 없다.");
		}
		int pricePerPerson = money/people;
		int change = money%people;
		
		System.out.println("내야할 돈은 인당 "+pricePerPerson);
		System.out.println("지원금 : "+change);
		}
		catch(Exception e) {//RuntimeException 과 자시글래스들을 처리하는 블록
			
			e.printStackTrace();//개발용으로 사용 이게 메인임
			
		}
		
	}

}
