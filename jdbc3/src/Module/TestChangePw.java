package Module;

import beans.MemberDao;
import beans.MemberDto;

public class TestChangePw {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String id = "test0002";
		String prePw = "test000w";
		String aftPw = "test0002";
		
		MemberDao memberdao = new MemberDao();
		MemberDto memberDto1 = new MemberDto();
		MemberDto memberDto2 = new MemberDto();
		
		memberDto1.setMember_id(id);
		memberDto1.setMember_pw(prePw);
		memberDto2.setMember_pw(aftPw);//객체 2개만들어서 해야되나????
		
		//if(memberdao.changePassword(aftPw, id, prePw)) System.out.println("비밀번호 변경");
		if(memberdao.changePassword(memberDto1, memberDto2)) System.out.println("비밀번호 변경");
		else System.out.println("잘못된 정보입니다");
		
	}

}
