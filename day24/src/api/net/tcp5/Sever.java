package api.net.tcp5;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sever {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		List<Integer> lotto = new ArrayList();
		
		for(int i = 1;i<45;i++) lotto.add(i);
		
		Collections.shuffle(lotto);;
		
		ServerSocket server = new ServerSocket(30000);
		
		Socket socket = server.accept();
		
//		OutputStream out = socket.getOutputStream();
		BufferedOutputStream buffer = new BufferedOutputStream(socket.getOutputStream());
		DataOutputStream data = new DataOutputStream(buffer); 
		
		for(int i =0;i<6;i++) data.writeInt(lotto.get(i));
		
		data.flush();
		
		socket.close();
		server.close();
	}

}
