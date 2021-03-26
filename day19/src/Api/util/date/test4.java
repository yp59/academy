package Api.util.date;

import java.util.Date;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Locale;
public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//지역설정
		//지역은 고정되어 있기 때문에 미리 만들어진 상수 객체를 사용한다.(Public static final)
		
		Date a = new Date();
		
		Format f = new SimpleDateFormat("yyyy-MM-dd E HH:mm:ss",Locale.KOREA);
		System.out.println(f.format(a));
	}

}
