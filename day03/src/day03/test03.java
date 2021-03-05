package day03;

public class test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//시간더하기
		
		int hour1=1 ,minute1=50,sec1=36;
		int hour2=2, minute2=30,sec2=28;
		 
		int time1=hour1*3600+minute1*60+sec1;
		int time2=hour2*3600+minute2*60+sec2;
		
		int total = time1+time2;
		
		int T_hour=total/3600;
		int T_minute=total%3600/60;
		int T_sec=total%60;
		
		
		System.out.println(T_hour+":"+T_minute+":"+T_sec);
		
	}

}
