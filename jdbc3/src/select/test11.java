package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class test11 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		//String id = in.nextLine();
		//String pw = in.nextLine();
	
		String id ="test0001";
		String pw ="test0001";
		
		Class.forName("oracle.jdbc.OracleDriver");
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "study", "study");
		
		
		
		String sql = "select * from "
				+ "(select * from member where member_id = ?) "
				+ "where member_pw = ?";
	
		
		//String sql = "select * from member where member_id = ? and member_pw = ?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()) {
			System.out.print(rs.getString("member_id")+"/");
			System.out.print(rs.getString("member_pw")+"/");
			System.out.print(rs.getString("member_nick")+"/");
			System.out.println(rs.getDate("member_join"));
		}
		else
			System.out.println("그런 거 ㅇ벗음");
		
		con.close();
	}

}
