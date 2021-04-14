package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class test4 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
			Scanner in = new Scanner(System.in);
			System.out.println("지점 검색 : ");
			String name = in.next();
			
			Class.forName("oracle.jdbc.OracleDriver");
			
			Connection con = DriverManager.getConnection(""
					+ "jdbc:oracle:thin:@localhost:1521:xe", "study", "study");
	
			String sql = "select * from academy"
					+ " where academy_name = ?";
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.print(rs.getString("academy_no")+" ");
				
				System.out.println(rs.getString("academy_name"));
				
			}
			
			
			con.close();
	}

}
