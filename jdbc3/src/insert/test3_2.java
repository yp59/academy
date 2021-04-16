package jdbc3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Scanner;

public class test3_2 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		//commit자동으로 된다
		Scanner in = new Scanner(System.in);
		
		Class.forName("oracle.jdbc.OracleDriver");
		
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "study", "study");
	
		
	
	try {	
		con.setAutoCommit(false);//자동 커밋 모드를 해제하는 구문 롤백도 해줘야 함

		
	String sql ="insert into character values"
			+ "(character_seq.nextval,?,?,?)";
	
	PreparedStatement ps = con.prepareStatement(sql);
	
	System.out.println("아이디 : ");
	ps.setString(1, in.nextLine());
	System.out.println("레벨 : ");
	ps.setInt(2, in.nextInt());
	System.out.println("돈 : ");
	ps.setInt(3, in.nextInt());
	
	
	ps.execute();
	
	//커밋 롤백 선택가능
	//con.commit();
	
	con.rollback();
	
	con.close();
	System.out.println("DB종료");
	}catch(SQLIntegrityConstraintViolationException e) {
		System.out.println("중복된 이름입니다.");
	};
	}

}
