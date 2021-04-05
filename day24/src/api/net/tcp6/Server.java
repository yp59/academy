package api.net.tcp6;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;



public class Server {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		//날짜 객체를 클라이언트 접속 시 전송
		ServerSocket server =new ServerSocket(30000);
		Socket socket = server.accept();
		
		Date d =new Date();
		
		BufferedOutputStream buffer = new BufferedOutputStream(socket.getOutputStream());
		ObjectOutputStream oos = new ObjectOutputStream(buffer);
		
		oos.writeObject(d);
		oos.flush();
		
		socket.close();
		server.close();
	}

}
