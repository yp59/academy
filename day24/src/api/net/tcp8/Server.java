package api.net.tcp8;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
// 목표 :접속한 사용자에게  Welcome 이라는 문자열을 전소아는 서버 구현
		
		//문자열 출력이 필요
		//outputStreamwriter 는 writer와 outputStream간의 출력 변환을  수행(인코딩설정)
		String text = "hello";
		
		
		ServerSocket server = new ServerSocket(30000);
		Socket socket = server.accept();
		

		OutputStreamWriter osw = new OutputStreamWriter(socket.getOutputStream());
		BufferedWriter bw = new BufferedWriter(osw);
		PrintWriter pw = new PrintWriter(bw);
		
		pw.println(text);
		pw.flush();
		
		socket.close();
		server.close();
	}

}
