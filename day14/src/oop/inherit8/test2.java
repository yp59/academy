package oop.inherit8;

public class test2 {

	public static void main(String[] args) {
		
		//상위형태의 리모컨으로 하위 형태의 객체를 관리할 수 있다.
		//상속구조의 응용 -----> 다형성
		//upcasting 하는 이유 상위 클래스로 묶어서 관리를편하게 하기 위함
		
		//다형성
		
		//전제조건이 성립되었을 때 상위 형태로 다양한 하위 형태를 관리할 수 있는 구조
		
		//상속관계가 성립하여 상위와 하위의 개념이 존재해야 함
		//메소드 재정의가 이루어져 있어야 한다.

		
		Media a=new MP3("아이리버");
		Media b=new AVI("test.avi");
		Media c=new PPT("powerpoint");
		
		a.excute();
		b.excute();
		c.excute();
		
	}
}
