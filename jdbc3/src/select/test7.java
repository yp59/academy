package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class test7 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String type = in.next();
		String keyword = in.next();
		
		
		Class.forName("oracle.jdbc.OracleDriver");
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "study", "study");
		
		String sql="select * from product where "+type+ "= ?";
		
		//String sql="select * from product where #1= ?";
		//sql=sql.replace("#1",type); 2가지 방법

		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, keyword);
		
		ResultSet rs = ps.executeQuery();
		
		
		while(rs.next()) {
			System.out.print(rs.getString("name")+" ");
			System.out.print(rs.getString("type")+" ");
			System.out.println(rs.getInt("price")+" ");
		
		}
		con.close();
	}

}
