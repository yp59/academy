package api.net.tcp1;

import java.net.ServerSocket;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int port=0;port<=65535;port++) {
			
			try {
				ServerSocket server = new ServerSocket(port);
			}catch(Exception e) {
				
				System.out.println(port+"사용중");
			}
			
			
			
		}
	}

}
