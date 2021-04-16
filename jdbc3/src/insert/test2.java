package jdbc3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class test2 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		// 만양ㄱ 값들을 미리 변수로 준비해둔 상태라면 어떤 식으로 코드를 작성하여 추가할까?
		String menuName = "'카페모카'";
		int menuPrice = 2000;
		
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("드라이버 설치 완료");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
				"study","study");
		System.out.println("DB연결완료");
		
		//	Connection con = DriverManeger.getConnection(
		//	"jdbc.oracle:thin:@localhost:1521:xe","study","study");
		
		String sql = "insert into menu values(menu_seq.nextval,"+menuName+","+menuPrice+")";
		
		/*String sql = "insert into menu values(menu_seq.nextval,'#1','#2')";
		sql = sql.replace("#1", menuName);
		sql = sql.replace("#2", String.valueOf(menuPrice));*/
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.execute();
		con.close();
		System.out.println("DB종료");
		
	}
}
