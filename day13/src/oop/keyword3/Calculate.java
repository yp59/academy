package oop.keyword3;

public class Calculate {
private int first;
private int second;


//탈 객체지향 키워드
//클래스에 고정시켜 편하게 사용하려는 목적이 있다.
//일회용 계산 메소드 등에 적합한 형태
public Calculate() {
	
}

public static int plus(int a , int b) {
	return (a+b);
}

public static int minus(int a , int b) {
	
	return (a-b);
}

}
