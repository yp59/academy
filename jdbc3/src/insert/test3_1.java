package jdbc3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Scanner;

public class test3_1 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		//unique 예외문 try catch
		Scanner in = new Scanner(System.in);
		
		Class.forName("oracle.jdbc.OracleDriver");
		
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "study", "study");
	
		
		
	
	try {	
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
	
	con.close();
	System.out.println("DB종료");
	}catch(SQLIntegrityConstraintViolationException e) {//Sql
		System.out.println("중복된 이름입니다.");
	};
	}

}
