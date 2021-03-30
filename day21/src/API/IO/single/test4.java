package API.IO.single;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class test4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//싱글바이트 출력을 여러개 묶어서 처리
		//byte ------>byte[]로 처리
		//why? 자바는 입출력 속도가 느리다 운영체제에 독립적이기떄문
		
		File target = new File("kh/single2.kh");
		FileOutputStream out = new FileOutputStream(target);
		byte[] data = {'h','e','l','l','o'};
		
		out.write(data);//배열로 내보내면 한꺼번에 내보내기 때문에 속도가 더 빨라진다.
		out.write(data, 1, 3);
		out.write(data,0,4);
		
	}

}
