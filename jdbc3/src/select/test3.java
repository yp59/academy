package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class test3 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		//R 작업을 JDBC로 진행
		// 목록조회(데이터 여러개 = 0개 이상)
		// 단일 조회(PK/Unique 조회 = 0개 or 1개)
		// 집계함수 조회
		Class.forName("oracle.jdbc.OracleDriver");
		
		Connection con = DriverManager.getConnection(""
				+ "jdbc:oracle:thin:@localhost:1521:xe", "study","study");
		//W.*, 
		String sql = "select W.*,C.client_id,I.item_name,I.item_price from "
				+ "wishlist W "
				+ "inner join client C on "
				+ "W.client_no=C.client_no "
				+ "inner join item I on "
				+ "W.item_no = I.item_no "
				+ "order by C.client_no asc";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();// 실행 후 결과집합에 접근할 수 있도록 참조(rs) 제공

		
		while(rs.next()) {//rs.next는 DB에 데이터가 있을 경우 true를 return한다.
			System.out.print(rs.getInt("client_no"));
			System.out.print(" ");
			System.out.print(rs.getInt("Item_no"));
			System.out.print(" ");
			System.out.print(rs.getDate("wish_time"));
			System.out.print(" ");
			System.out.print(rs.getString("client_id"));
			System.out.print(" ");
			System.out.print(rs.getString("item_name"));
			System.out.print(" ");
			System.out.println(rs.getInt("item_price"));

			
		}
		
		con.close();//rs는 connection을 통해 DB를 보고 있는 상황이기 때문에 con이 윗줄에 있으면 rs는 작동하지 않는다.
		
		System.out.println("완료");
	}

}
