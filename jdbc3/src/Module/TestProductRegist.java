package Module;

import java.text.SimpleDateFormat;
import java.util.Date;

import beans.MemberDao;
import beans.ProductDao;

public class TestProductRegist {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		int no = 11;
		String name = "하리보";
		String type = "과자";
		int price  = 1200;
		//Date Expire = new Date();
		//SimpleDateFormat f = new SimpleDateFormat("YYYY-MM");왜 안되냐
		//String date = f.format(Expire);
		String expire = "2021-03-04";

		ProductDao productDao = new ProductDao();
		
		productDao.registItem(name,
				type,price,expire);
		
		
		
	}

}
