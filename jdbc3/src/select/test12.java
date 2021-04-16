package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class test12 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		//집계함수
		//데이터가 있는지 없는지 고려하지 않고 바로 다음 줄로 이동하면 데이터 추출이 가능
		//결과 행이 무조건 1개
		// max, min count, avg sum
		Class.forName("oracle.jdbc.OracleDriver");
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "study", "study");
	
		String sql = "select count(*) from academy";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();//select는 무조건 이 명령어를 사용
		
			rs.next();//이동
			
			System.out.println(rs.getInt("count(*)"));
			
		
		
		con.close();
	}

}
