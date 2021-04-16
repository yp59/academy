package update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class test3 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		int point = 1000;
		String id = "test0001";
		
		Class.forName("oracle.jdbc.OracleDriver");
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "study", "study");
		
		String sql = "update member set member_point = member_point + ? where member_id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, point);
		ps.setString(2,id);

		int count =ps.executeUpdate();
			
		if(count>0) {
			System.out.println("증정 포인트 : " +point);
			
			sql = "select * from member where member_id = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.print(rs.getInt("member_no")+"/");
				System.out.print(rs.getString("member_id")+"/");
				System.out.print(rs.getInt("member_point"));
				
			}
		}
		else {
			System.out.println("해당하는 아이디가 없습니다.");
		}

		con.close();

	}

}
