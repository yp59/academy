package Api.util.calendar;

import java.util.Date;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class test3 {
public static void main(String[] args) {
	//Calendar에서 Date로 변경할 수 있는가?
	//Date로 바꿀 수 있다면 SimpleDateFormat을 쓸 수 있어 출력이 편해진다.
	
	Calendar c = Calendar.getInstance();
	
	//시간 설정
	c.set(Calendar.YEAR, 2000);
	c.set(Calendar.MONTH, 0);//월은 보정을 해줘야 ㅇ
	c.set(Calendar.DATE, 1);
	
	c.set(2017-2000, 0,2);//캘린더를 쓰는 이유 날짜와 시간을 수정할 수 있기 떄문에
	c.add(Calendar.DATE, 7);
	
	//출력설정
	Date a = c.getTime();
	
	Format f =new SimpleDateFormat("yyyy-MM-dd E HH:mm:ss.SSS");

	System.out.println(f.format(a));
	
}
}