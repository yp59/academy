package jdbc3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class test01 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("드라이버 설치 완료");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
				"study","study");
		System.out.println("DB연결완료");
		
		//	Connection con = DriverManeger.getConnection(
		//	"jdbc.oracle:thin:@localhost:1521:xe","study","study");
		
		String sql = "insert into menu values(menu_seq.nextval,'아메리카노',1200)";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.execute();
		
		con.close();
		System.out.println("DB종료");
		
	}
}
