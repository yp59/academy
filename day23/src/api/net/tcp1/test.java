package api.net.tcp1;

import java.io.IOException;
import java.net.ServerSocket;

public class test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//TCP : 연결지향형 통신
		// 연결을 위해 딕하ㅡㄴ 프로그램과 접속하는 프로그램 2가지가 필요하다.
		//연결 대기하는 쪽을 서버라고 하고
		//연결 시도하는 쪽을 클라이언트라 한다.
		
		//서버코드
		//통신을 위해서는 반드시 상대방의 IP와 port를 알아야 한다.
		//서버 입장에서는 IP가 정해져 있고, port만 설정하면 된다.
		//어떤 포트가 사용할 수 있는지, 없는지를 알 수 없으므로 파악을 해봐야 한다.
		//serversocket이라는 클래스를 이용하여 포트를 지정한뒤 서버를 개방해본다.
		int port=30000;
		try {
			
			ServerSocket server =new ServerSocket(port);
			System.out.println(port+"번 포트 사용 시작!");
		}catch(Exception e) {
			
			System.out.println(port+" 사용중");
		}
		
		
		
		
	}

}
