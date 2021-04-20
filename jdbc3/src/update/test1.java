package update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class test1 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		//academy 테이블의 데이터 수정
		//준비물 : 번호 , 이름
		int academy_no=10;
		String academy_name = "도쿄점";
		
		
		Class.forName("oracle.jdbc.OracleDriver");
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "study", "study");
		
		String sql="update academy set academy_name = ? where academy_no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, academy_name);
		ps.setInt(2, academy_no);
		//ps.execute();
		int count = ps.executeUpdate();//실행을 한뒤 적용된 행 수를 반환 update delete에서 사용?
		
		con.close();
		
		if(count>0)
		System.out.println(count+"행 변경 완료");
		
		else
			System.out.println("해당 지점 존재하지 않음");
		
	}

}
