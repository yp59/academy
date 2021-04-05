package thread;

import javax.swing.JOptionPane;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread t =new MyThread();
		
		t.start();
		
		JOptionPane.showMessageDialog(null, "test");
	}

}
