package Module;

import java.util.List;

import beans.MemberDao;
import beans.MemberDto;

public class test11 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String type = "member_id";
		String keyword="admin";
		
		MemberDao memberDao = new MemberDao();
		List<MemberDto> list = memberDao.searchList(type, keyword);
		
		
		for(MemberDto memberDto : list) {
			
			System.out.print(memberDto.getMember_id()+"/");
			System.out.println(memberDto.getMember_phone());
		}
	}

}
