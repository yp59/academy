package com.kh.spring04.beans;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcUtils {
	
	
	//연결기능
	//테이블 종류와 무관하게 전체적을 ㅗ이용해야 하므로  객체의 생성 없이 쉽게 접근하도록 정적 등록
	public static Connection getConnection(String username, String password)throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe",username,password);
		
		return con;
		
	}
}
