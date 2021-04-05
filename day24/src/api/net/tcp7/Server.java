package api.net.tcp7;

import java.io.BufferedOutputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Server {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		List<Integer> lotto = new ArrayList();
		
		for(int i =1;i<=45;i++) lotto.add(i);
		
		Collections.shuffle(lotto);
		
		
		
		ServerSocket server = new ServerSocket(30000);
		Socket socket = server.accept();
		
		BufferedOutputStream buffer = new BufferedOutputStream(socket.getOutputStream());
		ObjectOutputStream oos = new ObjectOutputStream(buffer);
		
		for(int i =0;i<6;i++) {
			oos.writeInt(lotto.get(i));
			
		}
		
		
		oos.flush();
		socket.close();
		server.close();
	}

}
