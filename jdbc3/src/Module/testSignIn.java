package Module;

import beans.MemberDao;

public class testSignIn {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//회원 등록 DAO를 사용해서 해보자
		
		String memberId = "khacademy";
		String memeberpw = "khacademy";
		String memebernick = "학생님";
		String memberBirth = "2000-01-01";
		String memberPhone = "010-4223-4958";
		String memberEmail = "khacademy@naver.com";
		
		MemberDao memberDao  = new MemberDao();
		
		memberDao.regist(memberId,memeberpw,memebernick,memberBirth,memberPhone,memberEmail);
		
		
	}

}
