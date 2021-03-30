package API.IO.file;

import java.io.File;
import java.io.IOException;

public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//file 생성 및 삭제
		
		File dir = new File("kh","test");
		System.out.println(dir.exists());
		
		//파일 생성
	
		try {
			dir.createNewFile();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//삭제 : 폴더나 파일 모드 같은 명령을 사용한다.
		
		dir.delete();
		
		
	}

}
