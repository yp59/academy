package Exception;

public class calculate {

	//이 메소드는 예외가 발생할 수 있는 메소드(위험한 메소드, 폭탄 신입사원)
	//throws를 이용해서 위험한 메소드임을 표시(어떤위험인지도 표시)
	public static int div(int a, int b) throws Exception{
		//throws Exception을 사용하면 이 메소드를 쓸때 예외 처리문(try-catch문)을 메인문에서 써야 쓸 수 있다.
		return (a/b);
	}

	
	}
