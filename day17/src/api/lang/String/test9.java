package api.lang.String;

public class test9 {
public static void main(String[] args) {
	//문자열의 단점과 보완방법 탐색
	//문자열의 가장큰 장점이자 단점 불변
	//문자열 합성이 매우느림
	//왜? 문자열은 불변이기 떄문에 hello를 더하면 새로운 객체가 생기는 거시다
	//기존의 hello는 메모리를 차지하면서 남아있음 
	//1억번 반복하면 1억개의 객체가 생성되는 거시다.
	
	String text ="";
	long start=System.currentTimeMillis();
	for(int i=0;i<10000;i++) {
		text+="hello";
		
	}long end=System.currentTimeMillis();
	
	System.out.println(text);
	System.out.println((end-start));//반복될수록 시간이 오래걸림
}
}
