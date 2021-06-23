package com.kh.spring04.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

//Repository는 파일 또는 DB 등 영속성을 가진 요소에 접근하는 도구-->Dao 등록할떄 사용함
@Repository
public class ItemDaoImpl implements ItemDao{

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
	
	
	public void insert2(ItemDto itemDto) throws Exception {
		Connection con = JdbcUtils.getConnection(USERNAME, PASSWORD);
		
		String sql = "insert into item values(?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, itemDto.getItemNo());
		ps.setString(2, itemDto.getItemName());
		ps.setInt(3, itemDto.getItemPrice());
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
	public ItemDto get(int itemNo) throws Exception{
		Connection con = JdbcUtils.getConnection(USERNAME, PASSWORD);
		String sql = "select * from Item where item_no = ?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, itemNo);
		
		ResultSet rs = ps.executeQuery();
		
		ItemDto itemDto;
		if(rs.next()) {
			
			itemDto = new ItemDto();
			
			itemDto.setItemNo(rs.getInt("item_no"));
			itemDto.setItemName(rs.getString("item_name"));
			itemDto.setItemPrice(rs.getInt("item_price"));
			
		}
		else
			itemDto=null;
		
		con.close();
		return itemDto;
	}
	
	public boolean delete(int no)throws Exception{
		Connection con = JdbcUtils.getConnection(USERNAME, PASSWORD);
		String sql = "delete item where item_no = ?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, no);
		int count = ps.executeUpdate();
		
		boolean x =count>0;
		
		return x;
	}
	public boolean editPrice(ItemDto itemDto) throws Exception {
		Connection con = JdbcUtils.getConnection(USERNAME, PASSWORD);
		
		String sql = "update item set item_price = ? where item_no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, itemDto.getItemPrice());
		ps.setInt(2, itemDto.getItemNo());
		int count = ps.executeUpdate();
		
		con.close();
		
		return count > 0;
	}
	
	public boolean edit(ItemDto itemDto) throws Exception {
		Connection con = JdbcUtils.getConnection(USERNAME, PASSWORD);
		
		String sql = "update item set item_name = ?, item_price = ? where item_no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, itemDto.getItemName());
		ps.setInt(2, itemDto.getItemPrice());
		ps.setInt(3, itemDto.getItemNo());
		int count = ps.executeUpdate();
		
		con.close();
		
		return count > 0;
	}
	public int sequence() throws Exception{
		Connection con = JdbcUtils.getConnection(USERNAME, PASSWORD);
		
		String sql = "select item_seq.nextval from dual";
		PreparedStatement ps =con.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();
		
		rs.next();
		int i = rs.getInt(1);
		
		con.close();
		return i;
	}
}
