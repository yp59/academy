package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class test5_2 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		String name = in.next();
		
		
		Class.forName("oracle.jdbc.OracleDriver");
		
		Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "study", "study"); 
		
		String sql = "select * from product where type = (select type from product where name =?)";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, name);
		

		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			System.out.print(rs.getString("name")+" ");
			System.out.print(rs.getString("type")+" ");
			System.out.println(rs.getInt("price")+" ");
		}
		
		con.close();
	}

}
