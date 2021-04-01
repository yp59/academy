package api.net.tcp4;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//준비물 파일 입력 스트림 소켓
		
		String host = "localhost";
		int port =30000;
		
		InetAddress address = InetAddress.getByName(host);
		
		Socket socket = new Socket(host, port);
		OutputStream out =socket.getOutputStream();
		
        File target = new File("kh/test.kh");
        FileInputStream in =new FileInputStream(target);
        
        //in에서 읽은 byte를 out으로 출력
      
        System.out.println("파일전송을 시작합니다. 총 "+target.length());
        while(true) {
        int n = in.read();
        if(n==-1) break;
        out.write(n);
		
       }
        System.out.println("프로그램을 종료합니다.");
		socket.close();
    }




}
