package oop.inherit5;

public class Browser {

	private String url;
	private String version;
	
	Browser(String url, String version){
		
		this.url=url;
		this.version=version;
	}
	
	public void move() {
		System.out.println("다른 페이지로 이동합니다");
	}
	public void refresh() {
		System.out.println("새로고침을 시도합니다");
	}
	
}
