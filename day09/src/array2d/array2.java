package array2d;

import java.util.Arrays;

public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] a =new int[5][5];
		int val=1;
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a[i].length;j++) {
				
				a[j][i]=val;
				val++;
				
			}
			
		}
for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a[i].length;j++) {
				
			System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
