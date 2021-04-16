package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

//DAO(database Access object)
// 데이터 베이스 관련 코드 작업을 수행하는 객체

public class MemberDao {

	//필요한 데이터베이스 작업들을 메소드로 구현
	
	//회원 탈퇴 메소드
	//String 2개 (아이디,비밀번호)를 이용하여 int(결과행수)를 반환하는 메소드

	
	public int exit(String memberId, String memberPw) throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
				"study", "study");
		
		String sql = "delete from member where member_id = ? and member_pw = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, memberId);
		ps.setString(2,memberPw);
		
		int count = ps.executeUpdate();
		con.close();
		return count;
		
	}
	
	public int givePoint(String id, int point)throws Exception {
	Class.forName("oracle.jdbc.OracleDriver");
	
	Connection con = DriverManager.getConnection(
			"jdbc:oracle:thin:@localhost:1521:xe", "study", "study");
	
	String sql = "update member set member_point = member_point + ? where member_id = ?";
	PreparedStatement ps = con.prepareStatement(sql);
	
	ps.setInt(1, point);
	ps.setString(2,id);

	int count =ps.executeUpdate();
	con.close();
	return count;
}
	public boolean changePassword(String aftPw,String id,String priPw)throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "study", "study");
		
		
		String sql = "update member set member_pw = ? where member_id = ? and member_pw = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, aftPw);
		ps.setString(2, id);
		ps.setString(3, priPw);
		
		int count = ps.executeUpdate();
		con.close();
		
		return count>0;
	}
	
}
