package oop.inherit5;

public class Edge extends Browser{
	
	public Edge(String url,String version) {
		super(url,version);
	}
	public void windows() {
		System.out.println("윈도우와 연동을 시작합니다");
		
	}
}
