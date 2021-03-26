package Api.util.date;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//date 클래스
		//java.util 패키지는 필수는 아니지만 매우 유용한 도구들이 존재 lang은 없으면 안되는 애들
		
		Date a =new Date();
		Date b = new Date(2021,3,26);
		System.out.println(a);
		System.out.println(b);

		int year = 1900+a.getYear();
		int month = 1+a.getMonth();
		int day = a.getDate();
		String x= year+" "+month+" "+day;
		
		System.out.println(x);
		///////이렇게 하면 날짜하나뽑는데 너무 많은 코드를 쓴다 비효율적
		//형식 변환 객체를 만들어서 변환하도록 지시
		//java.text 패키지에 형식변환과 관련된 클래스들이 모여있다.(~format)
		
		Format fmt ,fmt2,fmt3,fmt4;
		fmt =new SimpleDateFormat("yyyy-MM-dd E kk:mm:ss");//업캐스팅 어떤  경우든 간에 format을 상속받기 떄문에 보통 이렇게 쓴다.
		fmt2=new SimpleDateFormat("yyyy년 M월 dd일 E요일");//하나만 적어도 문제는 없는데 만약 기원후 7년이라면 yyyy는 0007로 나옴
		fmt3=new SimpleDateFormat("HH시 mm분");
		fmt4=new SimpleDateFormat("a HH시 mm분");
		Date date = new Date();
		System.out.println(fmt.format(date));
		System.out.println(fmt2.format(date));
		System.out.println(fmt3.format(date));
		System.out.println(fmt4.format(date));
	}

	

}
