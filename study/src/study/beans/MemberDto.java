package study.beans;

public class MemberDto {//Dto는 클래스로 DB에 포장해서 Dao를 통해 한꺼번에 넣으려는 클래스....

	private String member_id;
	private String member_pw;
	private String member_nick;
	private String member_birth;
	private String member_phone;
	private String member_email;
	private int member_point;
	
	
	
	

	public MemberDto(String member_id, String member_pw, String member_nick, String member_birth, String member_phone,
			 String member_email) {
		super();
		this.member_id = member_id;
		this.member_pw = member_pw;
		this.member_nick = member_nick;
		this.member_birth = member_birth;
		this.member_phone = member_phone;
		this.member_email = member_email;
	
	}
	
	public MemberDto() {
		
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getMember_pw() {
		return member_pw;
	}
	public void setMember_pw(String member_pw) {
		this.member_pw = member_pw;
	}
	public String getMember_nick() {
		return member_nick;
	}
	public void setMember_nick(String member_nick) {
		this.member_nick = member_nick;
	}
	public String getMember_birth() {
		return member_birth;
	}
	public void setMember_birth(String member_birth) {
		this.member_birth = member_birth;
	}
	public String getMember_phone() {
		return member_phone;
	}
	public void setMember_phone(String member_phone) {
		this.member_phone = member_phone;
	}
	
	public String getMember_email() {
		return member_email;
	}
	public void setMember_email(String member_email) {
		this.member_email = member_email;
	}
	public int getMember_point() {
		return member_point;
	}

	public void setMember_point(int member_point) {
		this.member_point = member_point;
	}
	
	
	
	
}
