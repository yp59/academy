package Exception;
import java.util.Scanner;


public class test6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		student x = new student();
		try {
			
		String name=in.next();
		x.setName(name);
		
		int lang =in.nextInt();
		x.setLang(lang);
		
		int math= in.nextInt();
		x.setMath(math);
		
		int eng=in.nextInt();
		x.setEng(eng);
		
		int total = lang+math+eng;
		int avr = Math.round(total/3);
		
		System.out.println(name+"  "+total+"  "+avr);
		}
		
		
		catch(Exception e) {
			
			e.printStackTrace();//개발용으로 사용 이게 메인임
			
		}
		finally {
			in.close();//마지막에 실행되는 코드
		}
		
		
	}

}
