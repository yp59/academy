package study.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class HintDao {
	
	//계정 정보
	public static final String USERNAME = "study";
	public static final String PASSWORD = "study";
	
	//등록 기능
	public void insert(HintDto hintDto) throws Exception {
		Connection con = JdbcUtils.getConnection(USERNAME, PASSWORD);
		
		String sql = "insert into hint values(hint_seq.nextval, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, hintDto.getHintContent());
		ps.setInt(2, hintDto.getQuizNo());
		ps.execute();
		
		con.close();
	}
	
}
