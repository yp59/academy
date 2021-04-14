package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class test5 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		String product_name = in.next();
		
		//product_name=product_name.substring(0, 1);
		
		System.out.println(product_name);
		Class.forName("oracle.jdbc.OracleDriver");
		
		Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "study", "study"); 
		
		String sql = "select * from product where instr(name, ?)>0";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, product_name);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			System.out.print(rs.getString("name")+" ");
			System.out.print(rs.getString("type")+" ");
			System.out.println(rs.getInt("price")+" ");
		}
		
		con.close();
		
		
	}

}
