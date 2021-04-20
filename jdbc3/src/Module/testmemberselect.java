package Module;

import java.util.List;

import beans.MemberDao;
import beans.MemberDto;

public class testmemberselect {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		MemberDao memberDao = new MemberDao();
		
		List<MemberDto> list = memberDao.selectList();
		
		System.out.println(list.size());
		
		for(MemberDto memberDto : list) {
			System.out.println(memberDto.getMember_id());
			System.out.println(memberDto.getMember_email());
		}
	}

}
