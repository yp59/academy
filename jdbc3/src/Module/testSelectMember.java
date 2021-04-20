package Module;

import java.util.List;

import beans.AcademyDao;
import beans.AcademyDto;
import beans.MemberDao;
import beans.MemberDto;

public class testSelectMember {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		//memberDao,MemberDto를 활용한 데이터베이스 조회 작업을 수행할 수 있는가?
		
		//준비 데이터 : 없음
		
		//데이터베이스 조회
		//select를 DAO DTO를 사용해서 조회해보려면 LIST를 쓰거나 ARRAY를 사용하는 것이 좋다.
		
		//AcademyDao academyDao = new AcademyDao();
		//List<AcademyDto> list = academyDao.select();//dao에서 얻은 list값을 저장하는 용도?
		
		MemberDao memberDao = new MemberDao();
		List<MemberDto> list = memberDao.selectList();
		
//		출력
		System.out.println("데이터 개수 : " + list.size());
		
		/*for(AcademyDto academyDto : list) {
			System.out.println(academyDto.getAcademyName());
		}*/	
		for(MemberDto memberDto : list) {//구문이 잘 이해가 안됨
		System.out.println(memberDto.getMember_id());
			System.out.println(memberDto.getMember_nick());
		}
		
	}

}
