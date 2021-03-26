package Api.util.calendar;

import java.util.Date;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class test2 {
public static void main(String[] args) {
	//Calendar에서 Date로 변경할 수 있는가?
	//Date로 바꿀 수 있다면 SimpleDateFormat을 쓸 수 있어 출력이 편해진다.
	
	Calendar c = Calendar.getInstance();
	
	Date a = c.getTime();
	
	Format f =new SimpleDateFormat("yyyy-MM-dd E HH:mm:ss.SSS");

	System.out.println(f.format(a));//이러면 캘린더 쓰는 이유가...? 바로 시간을 변환할 수 있기 떄문에 사용함
	
}
}