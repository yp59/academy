package Module;

import beans.AcademyDao;
import beans.AcademyDto;

public class test12 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//Q dao,dto를 통한 상세보기 구현
		
		int academy_no=10;
		
		AcademyDao academyDao = new AcademyDao();
		AcademyDto academyDto = academyDao.find(academy_no);		

	if(academyDto!=null) {
		
		System.out.println(academyDto.getAcademyNo());
		System.out.println(academyDto.getAcademyName());
	}
	}

}
