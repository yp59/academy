package study.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ItemDao {

	//계정 정보
	public static final String USERNAME = "study";
	public static final String PASSWORD = "study";
	
	//등록 기능
	public void insert(ItemDto itemDto) throws Exception {
		Connection con = JdbcUtils.getConnection(USERNAME, PASSWORD);
		
		String sql = "insert into item values(item_seq.nextval, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, itemDto.getItemName());
		ps.setInt(2, itemDto.getItemPrice());
		ps.execute();
		
		con.close();
	}
	
	public List<ItemDto> list()throws Exception{
		Connection con = JdbcUtils.getConnection(USERNAME, PASSWORD);
		
		List<ItemDto> itemlist = new ArrayList();
		String sql = "select * from item order by item_no asc";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			ItemDto itemDto = new ItemDto();
			itemDto.setItemNo(rs.getInt("item_no"));
			itemDto.setItemName(rs.getString("item_name"));
			itemDto.setItemPrice(rs.getInt("item_price"));
			
			itemlist.add(itemDto);
		}
		
		con.close();	
		return itemlist;
	}
	
}
