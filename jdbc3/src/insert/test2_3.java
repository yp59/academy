package insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class test2_3 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		// SQL injection을 해결하기 위해선 동적 SQL 생성
		// 값을 구문과 섞이지 않도록 자체적으로 변조하여 전송한 뒤 조립하여 실행(DIY)
		
		
		
		String menuName = "푸라푸치노";//작성 불가 글자가 발생(외따옴표)
		
		int menuPrice = 3000;
		
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("드라이버 설치 완료");
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
				"study","study");
		System.out.println("DB연결완료");

		String sql = "insert into menu values(menu_seq.nextval,?,?)";
		System.out.println(sql);
		
		
		//전송도구 구문의 값 자리(위치,홀더,?)에 연결될 데이터를 지정
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, menuName);//1번째 위치홀더에 menuName을 String 형태로 연결(따옴표 생성)
		ps.setInt(2, menuPrice);//2번째 위치 홀더에 menuPrice를 int형태로 연결(따옴표 생성안함)
		
		ps.execute();
		con.close();
		System.out.println("DB종료");
		
	}
}
