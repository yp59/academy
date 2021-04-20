package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ProductDao {
	public void registItem (
			String name,
			String type,
			int price,
			String date)throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
				
				Connection con = DriverManager.getConnection(
						"jdbc:oracle:thin:@localhost:1521:xe", "study", "study");
			
				String sql = "insert into product values(character_seq.nextval,?,?,?,sysdate,?)";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, name);
				ps.setString(2, type);
				ps.setInt(3, price);
				ps.setString(4, date);
				ps.execute();
				
				con.close();
			}
	
	public void registItem (ProductDto productDto
			)throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
				
				Connection con = DriverManager.getConnection(
						"jdbc:oracle:thin:@localhost:1521:xe", "study", "study");
			
				String sql = "insert into product values(character_seq.nextval,?,?,?,sysdate,?)";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, productDto.getName());
				ps.setString(2, productDto.getType());
				ps.setInt(3, productDto.getPrice());
				ps.setString(4, productDto.getExpire());
				ps.execute();
				
				con.close();
			}
}
