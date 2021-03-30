package API.IO.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class test3 {
public	static final int EOF=-1;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		File copy= new File("kh/practice.kh");
		File paste	=new File("kh/copy.kh");
		
		FileOutputStream out = new FileOutputStream(paste);
		FileInputStream in = new FileInputStream(copy);
		
	/*	for(int i=0;i<copy.length();i++) {
			int n = in.read();
			
			out.write(n);
			
		}
		*/
		while(true) {
			int n= in.read();
			if(n==EOF) break;
			out.write(n);
			
		}
	}

}
