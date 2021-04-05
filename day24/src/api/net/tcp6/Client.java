package api.net.tcp6;

import java.io.BufferedInputStream;
import java.io.ObjectInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Date;

public class Client {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		
		InetAddress address = InetAddress.getByName("localhost");
		Socket socket  = new Socket(address, 30000);
		
		BufferedInputStream buffer = new BufferedInputStream(socket.getInputStream());
		ObjectInputStream ois = new ObjectInputStream(buffer);
		
		Date d = (Date) ois.readObject();
		
		System.out.println(d);
		socket.close();
	}

}
