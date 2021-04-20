package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class test8 {

	public static void main(String[] args)throws Exception {
		//단일조회 살펴보기
		//결과가 1개만 나오는 조회(안나올 수는 없음)
		//유니크 또는 기본키 항목으로 조회할 경우가 여기에 해당
		//유사검색 수행하면 안되고 일치하는 항ㅂ목만 조회해야 함
		int academy_no =10;
		
		Class.forName("oracle.jdbc.OracleDriver");
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "study", "study");
		
		String sql ="select * from academy where academy_no = ?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, academy_no);
		ResultSet rs = ps.executeQuery();//해당하는 조회값만 커서를 옮겨준다.
		
		if(rs.next()) {
			System.out.println("데이터발견");
			System.out.print(rs.getString("academy_no"));
			System.out.print("/");
			System.out.println(rs.getString("academy_name"));
			
		}
		else {
			System.out.println("그런거 없음");
		}
		con.close();
	}//if else 조건문 사용하는게 while문보다 좋다.

}
