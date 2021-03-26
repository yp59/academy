package Api.collection;

import java.util.List;
import java.util.ArrayList;

public class test {
	//arrayList배우기
	//배열과 유사한 형태의 저장소
	//크기는 가변적이다
	//저장소는 무엇이 들어가느냐가 매우 중요하다.
	//순서가 중요하며, index에 의해 관리된다.
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> d = new ArrayList<>();
		
		d.add("아이유");
		d.add("송중기");
		d.add("유재석");
		System.out.println(d.get(0));
		System.out.println(d.size());
		System.out.println(d.indexOf("유재석"));
		System.out.println(d.contains("송중기"));
	}

}
