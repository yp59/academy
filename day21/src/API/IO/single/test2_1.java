package API.IO.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class test2_1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//single byte 입력
		
		//kh폴더 안에 있는 single.kh 파일의 내용을 읽어와 콘솔에 출력
		//준비물 FileinputStream file 객체 두가지
		
		File target = new File("kh/single.kh");
		FileInputStream	in = new FileInputStream(target);

		for(int i=0;i<target.length();i++) {
			
			int n = in.read();
			char x = (char) n;
			System.out.print(x);
		}
	in.close();
	}
}
