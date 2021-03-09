package conditon2;

public class homework3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long cash=1;
		long total_cash=0;
		int day = 0;
		
		for(int i=0;i<40;i++) {
			
			day=i+1;
			
			if(day<=30) System.out.println(day+"일차 : "+cash);
			
			total_cash+=cash;
			
			cash=2*cash;
			
			if(day==30) System.out.println(day+"일간 받은 총 금액 : "+total_cash);
			
			
		}
		System.out.println(day+"일간 받은 총 금액 : "+total_cash);
	}

}
