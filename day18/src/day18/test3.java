package day18;

import java.io.IOException;

public class test3 {

	public static void main(String[] args) throws IOException {//오류가 나면 나도 몰라요...명령어
		// TODO Auto-generated method stub

		//Runtime 클래스
		//외부 실행환경 관리 클래스
		// 생성자가 없음(private)
		//멤버가 존재함
		//미리 객체를 만들어놓고 만들어진 객체만 이용할 수 있도록 제한을 걸어둔 상태(생성제한)
		
//		Runtime r = new Runtime();   직접 생성한다.
		Runtime r = Runtime.getRuntime();//생성을 부탁한다.
		
		//exec()를 이요하면 외부 커맨드를 사용할 수 있다.
		//예외 발생 (100% 실행을 장담할 수 없기 때문에)
//		r.exec("notepad");//실행을 확신할 수 없는 기능
		
		r.exec("cmd /c start https://google.com");
		
		
		
		
	}

}
