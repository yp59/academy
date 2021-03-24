package api.lang.String;

public class test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문자열과 원시 자료형의 변환
		//int를 string으로 변환 또는 String을 int로 변환해야하는 경우
		//외부로 나가는코드는 아스키 코드만 가능하다.
		
		int a =10;
		
		String b = ""+a;//편법 문자열은 어떤 값과 더해도 문자열이  된다.
		System.out.println(b);
		
		String c =String.valueOf(a);
		System.out.println(c);

		int d= Integer.valueOf(c);//or parseInt써도 된다.
		
		System.out.println(d);
	}

}
