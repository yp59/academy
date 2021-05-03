package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class sysoutDao {

	public static String USERNAME = "kh75";
	public static String PASSWORD = "kh75";
	
	public List<sysoutDto> sysList()throws Exception{
		
		Connection con = jdbcUtils.con(USERNAME, PASSWORD);
		
		String sql = "select * from employees";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();
		
		List<sysoutDto> syslist =new ArrayList();
		
		while(rs.next()) {
		sysoutDto sysoutdto = new sysoutDto();
		sysoutdto.setEmpNo(rs.getInt(1));
		sysoutdto.setEmpPw(rs.getString(2));	
		sysoutdto.setPoNo(rs.getInt(3));
		sysoutdto.setEmpName(rs.getString(4));
		sysoutdto.setJoinDate(rs.getString(5));
		sysoutdto.setEmpPhone(rs.getString(6));
		sysoutdto.setEmail(rs.getString(7));
		sysoutdto.setAddress(rs.getString(8));
		syslist.add(sysoutdto);
		}
		
		con.close();
		
		return syslist;
		
	}

	
	}
	
	

