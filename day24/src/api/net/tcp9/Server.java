package api.net.tcp9;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		ServerSocket server = new ServerSocket(30000);
	
		
		Socket socket = server.accept();
		System.out.println("사용자 접속 : "+socket.getInetAddress());

		File dir =new File("kh");
		dir.mkdirs();
		File target = new File(dir,"chat.log");
		FileWriter fw = new FileWriter(target);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
	
		
		
		InputStreamReader isr = new InputStreamReader(socket.getInputStream());
		
		BufferedReader br = new BufferedReader(isr);
		while(true) {
			
			String line=br.readLine();
			if(line==null)break;
			System.out.println(line);
			pw.println(line);
			pw.flush();
		}
		


			pw.close();
			socket.close();
			server.close();
		
		
		
		
	}

}
