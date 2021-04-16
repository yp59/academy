package beans;

public class test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String id = "test0001";
		String pw = "test0001";
		
		MemberDao memberDao = new MemberDao();
		
		int count = memberDao.exit(id, pw);
		
		
		if(count>0) {System.out.println("삭제완료");}
		
		else {System.out.println("그런 회원 없습니다.");}
	}

}
