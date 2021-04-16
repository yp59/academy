package Module;

import beans.MemberDao;

public class TestChangePw {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String id = "test0002";
		String prePw = "test0003";
		String aftPw = "test0002";
		
		MemberDao memberdao = new MemberDao();
	
		if(memberdao.changePassword(aftPw, id, prePw)) System.out.println("비밀번호 변경");
		
		else System.out.println("잘못된 정보입니다");
		
	}

}
