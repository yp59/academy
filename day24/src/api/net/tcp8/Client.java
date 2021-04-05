package api.net.tcp8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;

public class Client {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
//inputstreamreader는 inputstream과 reader간의 변환작업을 수행(인코딩 설정)
		
		InetAddress address = InetAddress.getLocalHost();
		
		Socket socket = new Socket(address,30000);
		
		InputStreamReader isr = new InputStreamReader(socket.getInputStream());
		BufferedReader br =new BufferedReader(isr);
		
		while(true) {
			String text = br.readLine();
			if(text==null)break;
			System.out.println(text);
		}
		socket.close();
	}

}
