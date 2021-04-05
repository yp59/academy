package api.net.tcp9;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

			InetAddress address = InetAddress.getByName("localhost");
			
			Socket socket =new Socket(address,30000);
			
			Scanner in = new Scanner(System.in);
			
			//sc를 통해 입력받은 내용을 socket의 outputStream에 전달
			
			OutputStreamWriter osw = new OutputStreamWriter(socket.getOutputStream());
			BufferedWriter bw= new BufferedWriter(osw);
			PrintWriter pw =new PrintWriter(bw);
			
			
			
			while(true) {
				String line=in.nextLine();
			if(line.equals("그만"))break;
				
			
			pw.println(line);
			pw.flush();
			}
			
			in.close();
			socket.close();
	}

}
