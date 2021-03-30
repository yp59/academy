package API.IO.file;

import java.io.File;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File[] list =File.listRoots();
		
		for(File drive : list) {
			
			System.out.println(list.length);
		}
			for(File drive : list) {
				
				System.out.println(drive.getAbsolutePath());
			}
		}
		
	}


