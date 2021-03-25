package day18;

import java.util.regex.Pattern;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System 클래스 : 외부 시스템에 대한 기능, 정보등을 이용
		
	//시스템의 통로를 이용할 수 있다.	
		// - 표준 출력 스트림 : System.out
		// - 표준 에러 스트림 : System.err
		// _ 표준 입력 스트림 : System.in
		
		System.out.println("표준메세지");
		System.err.println("오류메세지");
	
	// 시스템의 시간을 불러올 수 있다.
	// 시간은 "기준시"로부터 계산을 하도록 약속되어 있다.
	// "기준시"는 1970년 1월 1일 0시 0분 0초를 말한다.
	// =currentTimeMillis()는 "기준시"로부터 현재까지의 "밀리초"를 계산한다.
		
		long time = System.currentTimeMillis();
		System.out.println(time);
	
	// 시스템의 정보를 불러올 수 있다
	System.out.println(System.getProperties());
	System.out.println(System.getProperty("java.specification.version"));
	System.out.println(System.getProperty("os.name"));
	
	String x ="^Windows.*$";
	if(Pattern.matches(x, System.getProperty("os.name"))){
		
		System.out.println("윈도우입니다.");
	}

	//시스템의 명령으로 종료가능
	// 안에 들어가는 숫자는 종료 상태를 의미하며 0이 정상 나머지는 비정상으로 간주
	
	System.exit(0);
	System.out.println("이 메세지는 나오지 않습니다");
	
	}

}
