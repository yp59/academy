package thread;

import javax.swing.JOptionPane;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread t =new MyThread();
		
		//thread를 설정하기 전에 주 스레드와 종료를 함께하도록 종속 설정
		
//		t.setName("testthread");
//		t.setPriority(0);//우선순위 10 5 0 순으로 매우높음 보통 낮음
		t.setDaemon(true);//위의 두개는 별로 안쓰는데 이건 준내 중요하다.
		//thread가 여러개일 경우 전체가 daemon이거나 전체가 daemon이 아니거나 둘 중 하나
		
		t.start();
		
		JOptionPane.showMessageDialog(null, "test");
	}

}
