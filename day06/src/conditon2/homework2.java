package conditon2;

public class homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int total_push_up=0;
		int daily_push_up=10;
		
		for(int i=0;i<30;i++) {
			int day=i+1;
		
			System.out.println(day+"일 : "+daily_push_up);
			
			total_push_up+=daily_push_up;
			
			daily_push_up+=3;
			
		}
		System.out.println("한달동안 푸쉬업 개수 : "+total_push_up);
	}

}
