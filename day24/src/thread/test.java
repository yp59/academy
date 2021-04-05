package thread;

import javax.swing.JOptionPane;

public class test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//현재 우리가 만드는 프로그램의 심각한 문제점
		// 무조건 동시에 1가지만 처리할 수 있다.
		//멀티테스킹ㅇ을 처리할 수 없다.
		//thread를 다룰 줄 알면 해결이 가능하다.java.lang.thread
		//1
		JOptionPane.showMessageDialog(null, "테스트");
		//2
		for(int i=0;i<100;i++) {
			
			System.out.println(i);
			Thread.sleep(1000l);
		}
		
	}

}
