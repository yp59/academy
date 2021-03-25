package day18;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Math 클래스 : 수학 계산 클래스
		//=생성자가 잠겨있다(private)
		//new를 쓸 수 없다
		//아무데서나 편하게 불러오도록 전부다 static 등록
		
		float a =1.5f;
		int b=(int)(a+0.5f);
		System.out.println(b);
		
		int c = Math.round(a);
		System.out.println(c);
		
		//2의 10제곱
		
		int f = (int) Math.pow(2, 10);//데이터 타입이 더블이다 
		
		System.out.println(f);
		
		//제곱근
		
		double g = Math.sqrt(9);
		System.out.println(g);
	}

}
