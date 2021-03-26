package Api.util.random;

import java.util.Random;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// random 클래스 
		//의도적으로 Random 클래스의 seed를 통일하면 동일한 결과가 나오게 할 수 있다.
		// 특정 시점동안 seed를 통일시켜 원하는 로직을 구현할 수 있다. ex OTP
		Random r =new Random();
		
		for(int i =0;i<10;i++)
	System.out.println(r.nextBoolean());//true false 랜덤값
	
	
	System.out.println(r.nextDouble());//Math.random()과 같은 메소드
	r.setSeed(1l);
	System.out.println(r.nextInt(5));
	r.setSeed(1l);
	System.out.println(r.nextInt(5));
	System.out.println(r.nextInt(5));
	System.out.println(r.nextInt(5));
	
	while(true) {
	long current = System.currentTimeMillis()/10000;
	r.setSeed(current);
	int otp = r.nextInt(1000000);
	
	System.out.println(current+"       "+otp);
	}
	}

}
