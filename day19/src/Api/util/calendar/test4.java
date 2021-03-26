package Api.util.calendar;

import java.util.Date;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar today = Calendar.getInstance();
		Calendar Dday = Calendar.getInstance();
		
		Dday.set(2021, 7, 4);
		
		long x= (Dday.getTimeInMillis()-today.getTimeInMillis())/(1000*60*60*24);
		System.out.println(x);
	//////////////////////////////////////////////
	//Dday로부터 77이전 날짜를 계싼
		
		Calendar c = Calendar.getInstance();
		
		c.set(2021, 7,4);
		c.add(Calendar.DATE, -77);
		Date seven = c.getTime();
		Format a = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println(a.format(seven));
		
	}

}
