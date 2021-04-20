package insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class test2_2 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		// SQL injection 공격이 발생할수 있음.
		
		String menuName = "'돌체'크림'콜드'브루'";//작성 불가 글자가 발생(외따옴표)
		
		int menuPrice = 2000;
		
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("드라이버 설치 완료");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
				"study","study");
		System.out.println("DB연결완료");
		
		String sql = "insert into menu values(menu_seq.nextval,"+menuName+","+menuPrice+")";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		
		ps.execute();
		con.close();
		System.out.println("DB종료");
		
	}
}
