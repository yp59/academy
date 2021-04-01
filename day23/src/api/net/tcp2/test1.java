package api.net.tcp2;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//tcp 클라이언트 코드
		//반드시 접속해야할 아이피와 포트를 알아야 한다.
		//IP의 경우에는 돈을 내고 등록하거나 DDNS 설정을 하면 영문으로 바꿔서 쓸 수 있다.
		
		String host = "1.220.236.75";//양식만 검사 가능
		int port =30000;
		
		try {
			InetAddress address = InetAddress.getByName(host);
			System.out.println("접속 가능");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			System.out.println("접속 불가");
			}
	}

}
