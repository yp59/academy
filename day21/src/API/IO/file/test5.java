package API.IO.file;

import java.io.File;

public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//file 생성 및 삭제
		
		File dir = new File("kh","test");
		System.out.println(dir.exists());
		
		//폴더 생성
		//명령 2개
		
		//dir.mkdir(); 중간 경로가 없으면 생성이 안되다.
		//-dir.mkdirs(); 중간 경로가 ㅇ벗으면 중간 경로 디렉터리까지 생성해준다.
		dir.mkdirs();
		
		//삭제 : 폴더나 파일 모드 같은 명령을 사용한다.
		dir.delete();
		
		
		
	}

}
