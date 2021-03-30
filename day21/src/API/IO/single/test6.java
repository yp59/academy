package API.IO.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class test6 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//복사 프로그램에 버퍼를 적용시켜 성능을 향상시킨 버전
		
		
		File origin = new File("kh/practice.kh");
		File copy = new File("kh/copy.kh");
		
		FileInputStream in = new FileInputStream(origin);
		FileOutputStream out = new FileOutputStream(copy);
		
		byte [] buffer = new byte[10];//buffer는 2진수이기 떄문에 2의 n승으로 쓰는 것이 좋다.
			while(true) {
			int n = in.read(buffer);//buffer에 값이 들어감 이렇게 하면
			if(n==-1) break;
			out.write(buffer,0,n);
			
			
		
			}
		
		in.close();
		out.close();
	}

}
