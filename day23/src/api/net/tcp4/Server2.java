package api.net.tcp4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server2 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		//준비물 출력파일 출력스트림 소켓
		
		ServerSocket server = new ServerSocket(30000);
		Socket socket = server.accept();
		InputStream in = socket.getInputStream(); 
		
		File dir = new File("kh");
		dir.mkdirs();
		
		File target =new File(dir,"test");
		FileOutputStream out = new FileOutputStream(target);
		byte[] buffer = new byte[1024];
		while(true) {
			int n =in.read(buffer);
			
			if(n==-1)break;
			out.write(buffer,0,n);
			
		} 
		out.close();
		socket.close();
	}

}
