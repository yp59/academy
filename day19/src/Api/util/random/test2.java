package Api.util.random;

import java.util.Random;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// random 클래스 
		//의도적으로 Random 클래스의 seed를 통일하면 동일한 결과가 나오게 할 수 있다.
		// 특정 시점동안 seed를 통일시켜 원하는 로직을 구현할 수 있다. ex OTP
		Random r =new Random();
		
		String id = "jyp5760";//id를 해쉬코드로 해서 current에 넣어주면 OTP 완성
		
		
	
	while(true) {
	long current = System.currentTimeMillis()/10000;
	r.setSeed(current+id.hashCode());
	int otp = r.nextInt(1000000);
	
	System.out.println(current+"       "+otp);
	}
	}

}
