package Module;

import beans.MemberDao;

public class testupdate {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		String id = "test0002";
		int point = 45;
		
		MemberDao memberdao = new MemberDao();
		int count = memberdao.givePoint(id, point);
		
		if(count>0) System.out.println("point증가 : "+point);
		
	}

}
