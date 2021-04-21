package study.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {
	public static final String USERNAME = "study";
	public static final String PASSWORD = "study";
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
	public List<ProductDto> list()throws Exception{
		Connection con = JdbcUtils.getConnection(USERNAME, PASSWORD);
	
		List<ProductDto> productlist = new ArrayList();
		String sql = "select * from product order by no asc";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			ProductDto productDto = new ProductDto();
			productDto.setNo(rs.getInt("no"));
			productDto.setName(rs.getString("name"));
			productDto.setType(rs.getString("type"));
			productDto.setPrice(rs.getInt("price"));
			productDto.setMade(rs.getString("made"));
			productDto.setExpire(rs.getString("expire"));
			productlist.add(productDto);
		}
		con.close();
		return productlist;
		
	}
	public List<ProductDto> rank(int top ,int low)throws Exception{
		Connection con = JdbcUtils.getConnection(USERNAME, PASSWORD);
	
		List<ProductDto> productlist = new ArrayList();
		String sql = "select rownum, TMP.* from "
				+"(select * from product order by price desc) TMP "
				+"where rownum between ? and ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, top);
		ps.setInt(2, low);
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			ProductDto productDto = new ProductDto();
			productDto.setNo(rs.getInt("no"));
			productDto.setName(rs.getString("name"));
			productDto.setType(rs.getString("type"));
			productDto.setPrice(rs.getInt("price"));
			productDto.setMade(rs.getString("made"));
			productDto.setExpire(rs.getString("expire"));
			productlist.add(productDto);
		}
		con.close();
		return productlist;
		
	}
	
	public List<ProductDto> search(String type ,String keyword)throws Exception{
		Connection con = JdbcUtils.getConnection(USERNAME, PASSWORD);
	
		List<ProductDto> productlist = new ArrayList();
		String sql = "select * from "
				+ "(select * from product where type = ?)"
				+ " where instr(name,?)>0";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, type);
		ps.setString(2, keyword);
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			ProductDto productDto = new ProductDto();
			productDto.setNo(rs.getInt("no"));
			productDto.setName(rs.getString("name"));
			productDto.setType(rs.getString("type"));
			productDto.setPrice(rs.getInt("price"));
			productDto.setMade(rs.getString("made"));
			productDto.setExpire(rs.getString("expire"));
			productlist.add(productDto);
		}
		con.close();
		return productlist;
		
	}
}
