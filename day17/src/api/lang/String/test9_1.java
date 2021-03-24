package api.lang.String;

public class test9_1 {
public static void main(String[] args) {
	//문자열의 단점과 보완방법 탐색
	//문자열의 가장큰 장점이자 단점 불변
	//문자열 합성이 매우느림
	//문자열 합성이 느리므로 이를 처리할 수 있는 별도의 도우미 클래스가 존재
	//StringBuffer,StringBuilder 둘 중 하나 상황에 맞게 이용한다.
	
	
	
	String text ="";
	StringBuffer buffer = new StringBuffer();
	
	long start=System.currentTimeMillis();
	for(int i=0;i<10000;i++) {
		buffer.append("hello\n");
		
	}long end=System.currentTimeMillis();
	
	System.out.println(buffer.toString());
	System.out.println((end-start));//엄청 줄어듬
	
}
}
