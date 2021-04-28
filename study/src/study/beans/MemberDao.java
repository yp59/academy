package study.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

//DAO(database Access object)
// 데이터 베이스 관련 코드 작업을 수행하는 객체

public class MemberDao {

	public static final String USERNAME ="study";
	public static final String PASSWORD ="study";
	//필요한 데이터베이스 작업들을 메소드로 구현
	
	//회원 탈퇴 메소드
	//String 2개 (아이디,비밀번호)를 이용하여 int(결과행수)를 반환하는 메소드

	
	public int exit(String memberId, String memberPw) throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
				"study", "study");
		
		String sql = "delete from member where member_id = ? and member_pw = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, memberId);
		ps.setString(2,memberPw);
		
		int count = ps.executeUpdate();
		con.close();
		return count;
		
	}
	
	public int exit(MemberDto memberDto) throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
				"study", "study");
		
		String sql = "delete from member where member_id = ? and member_pw = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, memberDto.getMember_id());
		ps.setString(2,memberDto.getMember_pw());
		
		int count = ps.executeUpdate();
		
		con.close();
		return count;
		
	}
	
		
	public int givePoint(String id, int point)throws Exception {
	Class.forName("oracle.jdbc.OracleDriver");
	
	Connection con = DriverManager.getConnection(
			"jdbc:oracle:thin:@localhost:1521:xe", "study", "study");
	
	String sql = "update member set member_point = member_point + ? where member_id = ?";
	PreparedStatement ps = con.prepareStatement(sql);
	
	ps.setInt(1, point);
	ps.setString(2,id);

	int count =ps.executeUpdate();
	con.close();
	return count;
}
	public int givePoint(MemberDto memberDto)throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "study", "study");
		
		String sql = "update member set member_point = member_point + ? where member_id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, memberDto.getMember_point());
		ps.setString(2,memberDto.getMember_id());

		int count =ps.executeUpdate();
		con.close();
		return count;
	}
	
	public boolean changePassword(String aftPw,String id,String priPw)throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "study", "study");

		String sql = "update member set member_pw = ? where member_id = ? and member_pw = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, aftPw);
		ps.setString(2, id);
		ps.setString(3, priPw);
		
		int count = ps.executeUpdate();
		con.close();
		
		return count>0;
	}
	
	public boolean changePassword(MemberDto memberDto1,MemberDto memberDto2)throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "study", "study");

		String sql = "update member set member_pw = ? where member_id = ? and member_pw = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, memberDto2.getMember_pw());
		ps.setString(2, memberDto1.getMember_id());
		ps.setString(3, memberDto1.getMember_pw());
		
		int count = ps.executeUpdate();
		con.close();
		
		return count>0;
	}
	
	public void regist(String memberId ,
	String memeberpw ,
	String memebernick ,
	String memberBirth,
	String memberPhone ,
	String memberEmail )throws Exception {
Class.forName("oracle.jdbc.OracleDriver");
		
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "study", "study");
	
		String sql = "insert into member values(member_seq.nextval,?,?,?,?,?,sysdate,?,0,'일반')";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, memberId);
		ps.setString(2, memeberpw);
		ps.setString(3, memebernick);
		ps.setString(4, memberBirth);
		ps.setString(5, memberPhone);
		ps.setString(6, memberEmail);
		ps.execute();
		
		con.close();
	}
	public void regist(MemberDto memberDto)throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
				
				Connection con = DriverManager.getConnection(
						"jdbc:oracle:thin:@localhost:1521:xe", "study", "study");
			
				String sql = "insert into member values(member_seq.nextval,?,?,?,?,?,sysdate,?,0,'일반')";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, memberDto.getMember_id());
				ps.setString(2, memberDto.getMember_pw());
				ps.setString(3, memberDto.getMember_nick());
				ps.setString(4, memberDto.getMember_birth());
				ps.setString(5, memberDto.getMember_phone());
				ps.setString(6, memberDto.getMember_email());
				ps.execute();
				
				con.close();
			}
	
	
	
/*	public List<MemberDto> selectList()throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "study", "study");
		
		MemberDto memberDto = new MemberDto(); //위치가 중요하다>??
		
		String sql = "select * from member order by member_no";
	
		PreparedStatement ps = con.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();
		List<MemberDto> list =new ArrayList();
		while(rs.next()) {
			memberDto.setMember_id(rs.getString("member_id"));
			memberDto.setMember_pw(rs.getString("member_pw"));
			memberDto.setMember_nick(rs.getString("member_nick"));
			memberDto.setMember_birth(rs.getString("member_birth"));
			memberDto.setMember_phone(rs.getString("member_phone"));
			memberDto.setMember_email(rs.getString("member_email"));
			
			list.add(memberDto);//값이 어떤 식으로 저장되는 거지?
			}
		
		con.close();
		
		return list;
	}
	
	public List<MemberDto> selectList() throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "study", "study");
		
		String sql = "select * from member order by member_no asc";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		//ResultSet --> List
		List<MemberDto> list = new ArrayList<>();
		while(rs.next()) {
			MemberDto memberDto = new MemberDto();
			
			//복사 코드(컬럼 개수만큼)
			memberDto.setMember_id(rs.getString("member_id"));
			memberDto.setMember_pw(rs.getString("member_pw"));
			memberDto.setMember_nick(rs.getString("member_nick"));
			memberDto.setMember_birth(rs.getString("member_birth"));
			memberDto.setMember_phone(rs.getString("member_phone"));
			memberDto.setMember_email(rs.getString("member_email"));
			
			list.add(memberDto);
		}
		
		con.close();
		
		return list;
	}
	*/
	public List<MemberDto> selectList()throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "study", "study");
		
		List<MemberDto> list = new ArrayList();
		String sql = "select * from member order by member_no";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			MemberDto memberDto = new MemberDto();//반복문 실행시 매번 새로운 Dto를 만들어서 list에 들어가는
													//값이 다르게 들어가게끔 한다.
			
			memberDto.setMember_id(rs.getString("member_no"));
			memberDto.setMember_pw(rs.getString("member_pw"));
			memberDto.setMember_nick(rs.getString("member_nick"));
			memberDto.setMember_birth(rs.getString("member_birth"));
			memberDto.setMember_phone(rs.getString("member_phone"));
			memberDto.setMember_email(rs.getString("member_email"));
			
			list.add(memberDto);
		}
		con.close();
		
		return list;
	}
	
	public List<MemberDto> searchList(String type,String keyword)throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "study", "study");
	
		String sql = "select * from member where instr("+type+",?)>0 order by member_no asc";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, keyword);
		ResultSet rs = ps.executeQuery();
		
		List<MemberDto> list =new ArrayList();
		while(rs.next()) {
			
			MemberDto memberDto = new MemberDto();
			memberDto.setMember_id(rs.getString("member_id"));
			memberDto.setMember_pw(rs.getString("member_pw"));
			memberDto.setMember_nick(rs.getString("member_nick"));
			memberDto.setMember_birth(rs.getString("member_birth"));
			memberDto.setMember_phone(rs.getString("member_phone"));
			memberDto.setMember_email(rs.getString("member_email"));
			
			list.add(memberDto);
			}
		
		con.close();
		
		return list;
	}
	
	public MemberDto find(int member_no)throws Exception{//단일조회는 list를 굳이 안써도 된다.
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "study", "study");
	
		String sql = "select * from member where member_no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, member_no);
		ResultSet rs = ps.executeQuery();
		
		MemberDto memberDto;
		if(rs.next()) {//while을 안쓴 이유는 어차피 1개만 조회할꺼라서 if로 rs에 해당값이 있는지만 알면 된다.
			memberDto=new MemberDto();
			memberDto.setMember_id(rs.getString("member_id"));
			memberDto.setMember_nick(rs.getString("member_nick"));
			memberDto.setMember_email(rs.getString("member_email"));
		}
		else memberDto=null;
		
		con.close();
		
		return memberDto;
	}
	
	public MemberDto login(String id , String pw)throws Exception{
		Connection con =JdbcUtils.getConnection(USERNAME, PASSWORD);
		String sql = "select * from"
				+ " member where member_id=? and member_pw=?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, id);
		ps.setString(2, pw);
		
		ResultSet rs = ps.executeQuery();
		MemberDto memberDto ;
		if(rs.next()) {
			memberDto = new MemberDto();
			memberDto.setMember_nick(rs.getString("member_nick"));		
		}
		else
			memberDto=null;
		
		con.close();
		return memberDto;
	}
}
