package Api.util.calendar;

import java.util.Calendar;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calendar 클래스 : 시간 생성 및 계산에 특화된 클래스. Date와 호환가능
		Calendar c = Calendar.getInstance();
		System.out.println(Calendar.getInstance());//정보가너무 많음
		
		//필요한 정보만 가져와서 추출(연,월,일,시,분,초,요일)
		
		int year = c.get(Calendar.YEAR);//1이 연도인데 calendar 클래스를 들어가보면 YEAR=1인걸 알 수 있다.
		
		int month = c.get(Calendar.MONTH)+1;//Calendar의 월을 0~11까지로 표현;;;; 이래서 1더해서 해야됨
		//month 조심하자 캘린더에서
		
		int day = c.get(Calendar.DAY_OF_MONTH);
		
		int hour =c.get(Calendar.HOUR);
		int minute =c.get(Calendar.MINUTE);
		int sec =c.get(Calendar.SECOND);
		int week = c.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(year+"-"+month+"-"+day+" "+hour+":"+minute+":"+sec);
		System.out.println(week);
	}

}
