package array2d;

public class array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] a =new int[5][5];
		int val=1;
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a[i].length;j++) {
				
				a[i][j]=val;
				System.out.print(a[i][j]+" ");
				val++;
			}
			System.out.println();
		}
		
		
	}

}
