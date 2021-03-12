package loop;

public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double up=3;
		double down=2.5;	
		double height = 15;
		double key=0;
		int count=0;
		while(true) {
			
			key+=(up-down);
			
			if(height<key) break;
			count++;
			
		}
		System.out.println(count);
	}

}
