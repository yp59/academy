package api.net.tcp1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class test3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		//서버 개방코드 = 영업시작 코드
		
		int port =30000;
		ServerSocket server = new ServerSocket(port);
		System.out.println("서버가 준비되었습니다.");
		
		
		//서버 개방 후에 연결을 대기하는 코드가 필요하다.
		//Socket 연결 클래스
		Socket socket = server.accept();
		System.out.println("사용자가 접속하였습니다.");
		System.out.println(socket);

		
		//연결종료
		socket.close();
		server.close();
	}

}
