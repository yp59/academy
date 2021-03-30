package API.IO.file;

import java.io.File;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File c = new File("C:/");
		System.out.println(c.exists());
		
		System.out.println(c.isDirectory());
		System.out.println(c.canRead());
		System.out.println(c.canWrite());
		System.out.println(c.canExecute());

		File[]info = c.listFiles();
		
		for (File in : info) System.out.println(in);
		
		File d = new File("D:/");
		
		File []info2 = d.listFiles();
		
		for (File in : info2) System.out.print(in);
	}

}
