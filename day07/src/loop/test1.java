package loop;
import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		
		
		int hour=in.nextInt();
		int min =in.nextInt();
		int sec=in.nextInt();
		
		int rhour=0;
		int rmin=0;
		int rsec=0;
		int time = hour*3600+min*60+sec;
		
		
		for(int i=time;i>0;i--) {
			rhour=i/3600;
			rmin=i/60%60;
			rsec=i%60;
			System.out.println(rhour+"시간"+rmin+"분"+rsec+"초");
			
			try {
				
				Thread.sleep(1000);
				
			}catch(Exception e) {//지연 코드
				
				
				
			}
			
		}
		
				
			}
		
		
	}


