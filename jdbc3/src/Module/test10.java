package Module;

import java.util.List;

import beans.AcademyDao;
import beans.AcademyDto;

public class test10 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		String keyword = "점";
		
		AcademyDao academyDao = new AcademyDao();
		
		List<AcademyDto> list = academyDao.searchList(keyword);
		
		System.out.println(list.size());
		for(AcademyDto academyDto : list) {
			System.out.print(academyDto.getAcademyNo());
			System.out.print("/");
			System.out.println(academyDto.getAcademyName());
		}
	}

}
