package update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class test2 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		//academy 테이블의 데이터 수정
		//준비물 : 번호 , 이름
		int no=1;
		int price = 2000;
		
		
		Class.forName("oracle.jdbc.OracleDriver");
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "study", "study");
		
		
		String sql = "update product set price = ? where no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, price);
		ps.setInt(2, no);
		//ps.execute();
		int count = ps.executeUpdate();//실행을 한뒤 적용된 행 수를 반환
		
		
		
		if(count>0) {
					
		System.out.println(count+"행 변경 완료");
		}
		else {
			System.out.println("해당 상품 존재하지 않음");
		}
	
		con.close();
		
	}

}
