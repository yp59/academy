package api.net.tcp3;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ServerSocket server = new ServerSocket(30000);
		
		Socket socket = server.accept();
		
		
		//byte를 전송하던가 수신하던가 둘중 하나를 수행
		//FileOutputStream대신에 socket.getOutputStream을 사용
		
		OutputStream out= socket.getOutputStream();
		
		
		out.write(104);
		out.write(101);
		out.write(108);
		out.write(108);
		out.write(111);
		
		out.close();
		socket.close();
		server.close();
		
	}

}
