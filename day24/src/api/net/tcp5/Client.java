package api.net.tcp5;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		String host = "localhost";
		int port =30000;
		
		InetAddress address = InetAddress.getByName(host);
		
		Socket socket = new Socket(address,port);
		
		//통로준비(파일 입출력의 멀티바이트 입력 예제 참고)
		
		BufferedInputStream buffer = new BufferedInputStream(socket.getInputStream());
		DataInputStream data = new DataInputStream(buffer);
		try {
		while(true) {
			System.out.println(data.readInt());
		}
		
		}catch(Exception e) {
			
			
		}
		socket.close();
	}

}
