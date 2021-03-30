package API.IO.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class test5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//목표 : 싱글 바이트 입력을 여러개 묶어서 처리
		//여러개를 한 번에 가져오면 빠르다는 것은 알지만 몇개씩 가져올지 어떻게 정하나?(버퍼크기조정)
		
		File target = new File("kh/single2.kh");
		
		FileInputStream in = new FileInputStream(target);
		
		byte [] buffer = new byte[5];
		
		in.read(buffer); // buffer에 가능한 모든 데이터를 순서대로 채워라!
		System.out.println(Arrays.toString(buffer));
		
		in.read(buffer); 
		System.out.println(Arrays.toString(buffer));
		
		in.read(buffer); 
		System.out.println(Arrays.toString(buffer));
		
		in.read(buffer); 
		System.out.println(Arrays.toString(buffer));
		
		in.close();
		
	}

}
