package Api.text.format;

import java.text.DecimalFormat;
import java.text.Format;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//숫자형식을 반환
		//##숫자가 없는 것으로 표현됨
		
		// 소수점 자리수 
		double a =12345.6789;
		
		System.out.println(a);
		
		Format f1 =new DecimalFormat("#####.##");
		System.out.println(f1.format(a));
		
		Format f2 =new DecimalFormat("00000.00");
		System.out.println(f2.format(a));
		
		Format f3 =new DecimalFormat("0.00");
		System.out.println(f3.format(a));
		
		long b =123456789l;
		System.out.println(b);
		Format f4 =new DecimalFormat("#,###");//패턴으로 인식한다.
		System.out.println(f4.format(b));

}
}