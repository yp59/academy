package api.lang.String;

public class test3 {
public static void main (String[] args) {
	
	String url = "http://www.naver.com";
	
	//1. 글자수는 얼마입니까?
	System.out.println(url.length());
	//2. http로 시작합니까?
	System.out.println(url.startsWith("http"));
	System.out.println(url.startsWith("http",5));
	//3. .com으로 끝납니까?
	System.out.println(url.endsWith(".com"));
	//4. naver라는 글자가 있습니까?
	System.out.println(url.contains("naver"));
	System.out.println(url.indexOf("naver"));
	
	
}
}
