package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class test6 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int min_price = in.nextInt();
		int max_price = in.nextInt();
		
		
		Class.forName("oracle.jdbc.OracleDriver");
		
		Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "study", "study"); 
		
		String sql = "select * from product where price between ? and ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, min_price);
		ps.setInt(2, max_price);

		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			System.out.print(rs.getString("name")+" ");
			System.out.print(rs.getString("type")+" ");
			System.out.println(rs.getInt("price")+" ");
		}
		
		con.close();
	}

}
