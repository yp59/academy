package jdbc3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLIntegrityConstraintViolationException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class test4_1 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		try {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "study", "study");
		
		String sql ="insert into member("
				+ "member_no,member_id,member_pw,member_nick,member_birth,member_phone,member_email,member_point,member_grade) values"
				+ "(character_seq.nextval,?,?,?,?,?,?,?,?)";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, in.next());//아이디
		ps.setString(2, in.next());//비밀번호
		ps.setString(3, in.next());//닉네임
		ps.setString(4, in.next());//생년월일
		ps.setString(5, in.next());//전화번호
		ps.setString(6, in.next());//이메일
		ps.setInt(7, in.nextInt());//포인트
		ps.setString(8, in.next());//회원등급
		
		ps.execute();
		ps.close();
		con.close();
		}catch(SQLIntegrityConstraintViolationException e) {//unique항목 위반 에러만 나타내기 때문에
			//아이디가 중복인지 닉네임이 중복인지 모른다.
			System.out.println("이미 사용중인 아이디입니다.");
			System.out.println("이미 사용중인 닉네임입니다.");
		}
	}

}
