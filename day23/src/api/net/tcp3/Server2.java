package api.net.tcp3;

import java.io.IOException;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Set;
import java.util.TreeSet;

import java.util.Iterator;

public class Server2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ServerSocket server = new ServerSocket(30000);
		Set<Integer> lotto = new TreeSet();
		Socket socket = server.accept();
		
		
		//byte를 전송하던가 수신하던가 둘중 하나를 수행
		//FileOutputStream대신에 socket.getOutputStream을 사용
		
		OutputStream out= socket.getOutputStream();
		
		while(lotto.size()<6) {
			int x = (int) (Math.random()*45+1);
			lotto.add(x);
		}
		Iterator<Integer> iter = lotto.iterator();
		while(iter.hasNext()) {
			out.write(iter.next());
		}

		socket.close();
		server.close();
		
	}

}
