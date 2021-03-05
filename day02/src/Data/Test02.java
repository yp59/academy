package Data;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int black_noodle = 5000;		
		int red_noodle = 6000;
		
		int black_order =2;
		int red_order =3;
		
		int discount=2000;
		int total=black_noodle*black_order+red_noodle*red_order-discount;
		
		
		System.out.println("짜장면 "+black_order+"개 :"+black_noodle*black_order+"원");
		System.out.println("짬뽕 "+red_order+"개 :"+red_noodle*red_order+"원");
		System.out.println("할인금액 :"+discount+"원");
		System.out.println("-------------");
		System.out.println("총액 : "+total+"원");
	
	
	
	
	}

}
