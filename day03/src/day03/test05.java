package day03;

public class test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//시간더하기
		
		int hour1=10 ,minute1=20,sec1=30;
		int hour2=15, minute2=10,sec2=25;
		 
		int time1=hour1*3600+minute1*60+sec1;
		int time2=hour2*3600+minute2*60+sec2;
		
		int total = time2-time1;
		
		int T_hour=total/3600;
		int T_minute=total%3600/60;
		int T_sec=total%60;
		
	
		double PC_charge=Math.ceil(total/3600.0)*1000;
		int Fee=(int) (PC_charge);

		System.out.println(T_hour+"시간"+T_minute+"분"+T_sec+"초");
		System.out.println(Fee+"원 입니다.");
	}

}
