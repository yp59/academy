package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class test9 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int no = in.nextInt();
		
		
		Class.forName("oracle.jdbc.OracleDriver");
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "study", "study");
		
		String sql = "select * from product where no = ?";
	
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, no);
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()) {
			System.out.print(rs.getString("name")+"/");
			System.out.print(rs.getString("type")+"/");
			System.out.println(rs.getString("price"));
		}
		else
			System.out.println("그런 거 ㅇ벗음");
		
		con.close();
	}

}
