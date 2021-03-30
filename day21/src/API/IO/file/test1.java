package API.IO.file;

import java.io.File;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//목표 : 프로젝트에 있는 kh 폴더의 hello.txt의 정보를 확인
		//java.io.file 클래스 활용
		//기본 경로는 java project문서가 기본 경로이다.
		
		
		File a = new File("jyp/hello.txt");
		File b = new File("jyp","hello.txt");
		System.out.println(a.exists());
		System.out.println(a.length());//내부 글자 길이 단위는 byte
		System.out.println(a.getName());//파일 이름
		System.out.println(a.getPath());//프로젝트 기준 상대경로
		System.out.println(a.getAbsolutePath());//파일 전체경로
		
		System.out.println(a.lastModified());//최종 수정 시각
		
		Date d = new Date(a.lastModified());
		Format e = new SimpleDateFormat("y년 M월 d일 E요일, a H:mm:ss");
		System.out.println(e.format(d));
	}

}
