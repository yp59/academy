package Module;

import java.text.SimpleDateFormat;
import java.util.Date;

import beans.MemberDao;
import beans.ProductDao;
import beans.ProductDto;

public class TestProductRegist2 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		ProductDto productDto = new ProductDto();
		
		productDto.setName("팅클");
		productDto.setType("과자");
		productDto.setPrice(1500);
		productDto.setExpire("2022-06-04");
		
		String expire = "2021-03-04";

		ProductDao productDao = new ProductDao();
		
		productDao.registItem(productDto);
		System.out.println("입력완료");
		
		
	}

}
