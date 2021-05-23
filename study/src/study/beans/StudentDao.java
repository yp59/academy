package study.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentDao {

	public static String USERNAME = "study";
	public static String PASSWORD = "study";
	public int getSequence() throws Exception{
		Connection con = JdbcUtils.getConnection(USERNAME, PASSWORD);
		
		String sql = "select student_seq.nextval from dual";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		rs.next();
		int studentNo = rs.getInt(1);
		
		con.close();
		return studentNo;
	}
	
	public void insert(StudentDto studentDto) throws Exception {
		Connection con = JdbcUtils.getConnection(USERNAME, PASSWORD);
		
		String sql = "insert into student values(?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, studentDto.getStudentNo());
		ps.setString(2, studentDto.getStudentName());
		ps.setString(3, studentDto.getStudentEmail());
		ps.execute();
		
		con.close();
	}
	
}
