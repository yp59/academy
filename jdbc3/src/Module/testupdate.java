package Module;

import beans.MemberDao;
import beans.MemberDto;

public class testupdate {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		String id = "test0002";
		int point = 45;
		
		MemberDao memberdao = new MemberDao();
		MemberDto memberDto = new MemberDto();
		
		memberDto.setMember_id(id);
		memberDto.setMember_point(point);
		
		//int count = memberdao.givePoint(id, point);
		int count = memberdao.givePoint(memberDto);
		
		if(count>0) System.out.println("point증가 : "+point);
		
	}

}
