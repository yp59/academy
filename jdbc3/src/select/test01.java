package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class test01 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		//R 작업을 JDBC로 진행
		// 목록조회(데이터 여러개 = 0개 이상)
		// 단일 조회(PK/Unique 조회 = 0개 or 1개)
		// 집계함수 조회
		Class.forName("oracle.jdbc.OracleDriver");
		
		Connection con = DriverManager.getConnection(""
				+ "jdbc:oracle:thin:@localhost:1521:xe", "study","study");
		
		String sql = "select * from academy order by academy_no asc";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();// 실행 후 결과집합에 접근할 수 있도록 참조(rs) 제공

		
		while(rs.next()) {//rs.next는 DB에 데이터가 있을 경우 true를 return한다.
			
			System.out.print(rs.getInt("academy_no"));//java에서 보는거면 DB입장 고려하지말고 JAVA에서 보자
			System.out.print(" ");
			System.out.println(rs.getString("academy_name"));
			
		}
		
		con.close();//rs는 connection을 통해 DB를 보고 있는 상황이기 때문에 con이 윗줄에 있으면 rs는 작동하지 않는다.
		
		
	}

}
