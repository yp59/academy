package API.IO.file;

import java.io.File;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//File 클래스를 이용해서 디렉토리 제어
		//파일을 구분지을 수 있는 이름을 가진 공간
		
		File dir = new File("jyp");
		
		System.out.println(dir.exists());
		
		System.out.println(dir.length());
		
		System.out.println(dir.isDirectory());
		System.out.println(dir.isFile());
		
		//디렉토리는 내부 구성요소에 대한 정보를 확인할 수 있는 명령이 있어야 한다.
		//1.이름만 확인-->.list()-->String[] List<String>
		//2.파일 정보를 확인-->listFiles()--->File[] List<File>
		
		String[] names = dir.list();
		for(String name:names)System.out.println("name : "+name);
		
		File[] files = dir.listFiles();
		for(File file : files) {
			
			
			
		}
		
		
	}

}
