package Module;

import beans.MemberDao;
import beans.MemberDto;

public class test13 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		MemberDao memberDao = new MemberDao();
		MemberDto memberDto = memberDao.find(2);
		
		if(memberDto!=null) {
			System.out.println(memberDto.getMember_id());
			System.out.println(memberDto.getMember_nick());
			System.out.println(memberDto.getMember_email());
			//get으로 다 보여줘야되네
		}
	}

}
