package api.net.tcp7;

import java.io.BufferedInputStream;
import java.io.ObjectInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Client {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Set<Integer> store	= new TreeSet();
		InetAddress address = InetAddress.getByName("localhost");
		Socket socket = new Socket(address,30000);
		
		BufferedInputStream buffer =new BufferedInputStream(socket.getInputStream());
		ObjectInputStream ois = new ObjectInputStream(buffer);
		
		
		try {
			while(true) {
				store.add(ois.readInt());
			}
			
		}catch(Exception e) {}
		
		System.out.println(store);
		socket.close();
	}

}
