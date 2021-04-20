package Module;
import beans.MemberDao;
import beans.MemberDto;
public class testdelete {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String id = "test0001";
		String pw = "test0001";
		
		
		
		MemberDao memberDao = new MemberDao();
		MemberDto memberDto = new MemberDto();
		
		memberDto.setMember_id(id);
		 memberDto.setMember_pw(pw);
		
		//int count = memberDao.exit(memberDto.getMember_id(),memberDto.getMember_pw());
		
		 int count = memberDao.exit(memberDto);//Dto의 객체를 쓴다고 get으로 자동 변환되는게 아니라 
		 										//Dao의 exit문에서 생성된 객체를 가지고 get메소드로 값을 넣을 수 있다.
		
		if(count>0) {System.out.println("삭제완료");}
		
		else {System.out.println("그런 회원 없습니다.");}
	}

}
