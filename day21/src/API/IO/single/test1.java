package API.IO.single;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class test1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//목표 : kh라는 폴더 안에 single.kh 라는 이름의 파일을 만들고 원하는 내용을 byte 단위로 출력
		//=유니코드는 불가능하다..
		
		//준비물 : 파일 객체와 출력통로
		
		File target = new File("kh/single.kh");
		FileOutputStream out = new FileOutputStream(target);  //파일 출력 통로 덮어쓰기
//		FileOutputStream out2 = new FileOutputStream(target,true);  //이어쓰기


		
		//프로그램 에서 out 에서 target에서 single.kh로
		
		out.write(65);//out으로 65라는 데이터를 출력해라!
		out.write('B');
		out.write(9);//tab
		out.write(104);//h
		out.write(101);//e
		out.write(108);//l
		out.write(108);//l
		out.write(111);//o
		out.write(10);//enter
		out.write(30000);//byte를 벗어난 값 벗어난 값은 byte로 강제 변경된다.
		
		
		//통로는 마지막에 close()를 해야한다.
		out.close(); 
	}

}
