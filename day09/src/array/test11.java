package array;

import java.util.Scanner;

public class test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in =new Scanner(System.in);
		
		
		int []storage = new int[7];
		
		for(int i=0;i<storage.length;i++) {
			
			storage[i]=in.nextInt();
			
		}
		
		for(int i=0;i<storage.length-1;i++) {
		
				for(int j=i+1;j<storage.length;j++) {
				
					
					if(storage[i]>storage[j]) {
						
						int save = storage[i];
						storage[i]=storage[j];
						storage[j]=save;
						
					}
					
				
				}
			
			}
		
for(int i=0;i<storage.length;i++) {
			
			System.out.println(storage[i]);
			
		}
		
		
	}

}
