package Module;

import beans.MemberDao;
import beans.MemberDto;

public class testMemberDtoDao {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		MemberDao memberDao = new MemberDao();
		MemberDto memberDto = new MemberDto("bibibigbang", "bibibigbang", "아이유", "2020-05-04",
				"010-4353-3851", "naver@naver.com");
		
		memberDao.regist(memberDto);
		
		System.out.println("완료");
		
		
	} 

}
