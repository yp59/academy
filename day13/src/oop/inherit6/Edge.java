package oop.inherit6;

public class Edge extends Browser{
	
	public Edge(String url,String version) {
		super(url,version);
	}
	public void windows() {
		System.out.println("윈도우와 연동을 시작합니다");
		
		
	}
	@Override
	public void move() {
		System.out.println("왜날뷁");
		// TODO Auto-generated method stub
//		super.move(); 원래의 move를 실행시키는 코드 자동완성으로 하면 딸려나온다.
	}
}
