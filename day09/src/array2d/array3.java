package array2d;

public class array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] a =new int[5][5];
		int val=1;
		
	for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a[i].length;j++) {
				
			
				if(i%2==1) {
					
					int position= a[i].length-1-j;
					a[i][position]=val;
					val++;
						
					
					
				}
				else {
					a[i][j]=val;
					val++;
					
				}
				
				
				
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


