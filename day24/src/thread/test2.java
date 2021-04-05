package thread;

import javax.swing.JOptionPane;

public class test2 {

	public static void main(String[] args) throws InterruptedException {
		//main Thread 외에 1개의 Thread를 추가로 생성하여 2개의 작업을 동시에 진행
		
		Thread t = new Thread() {
			@Override
			public void run() {
				for(int i=0;i<100;i++) {
					
					System.out.println(i);
					try {
						Thread.sleep(1000l);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		};
		t.start();
		
		
		JOptionPane.showMessageDialog(null, "테스트");
		//2
	
		
	}

}
