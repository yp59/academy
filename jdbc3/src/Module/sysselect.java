package Module;

import java.util.List;

import beans.sysoutDao;
import beans.sysoutDto;

public class sysselect {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		sysoutDao dao = new sysoutDao();
		
//		sysoutDto dto = new sysoutDto();
		
		List<sysoutDto> select = dao.sysList();
	
		System.out.println(select.size());
		for(sysoutDto dto : select) {
			
		System.out.print(dto.getEmpNo());
		System.out.print("/");
		System.out.print(dto.getEmpPw());
		System.out.print("/");
		System.out.print(dto.getEmpName());
		System.out.print("/");
		System.out.print(dto.getEmpPhone());
		System.out.print("/");
		System.out.print(dto.getAddress());
		System.out.println("");
		
		}
		
	}

}
