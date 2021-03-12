package array;

public class test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열에서의 데이터 교환(swap)
		
		int[] data = new int[] {4,5,3,2,1};
		
		//정렬코드
		
		for(int i=0;i<data.length;i++) {
			
			for(int j=i+1;j<data.length;j++) {
				
				if(data[i]>data[j]) {
					
					int save=data[i];
					data[i]=data[j];
					data[j]=save;
					
				}
				
			}
			
			
		}
		for(int i=0;i<data.length;i++) {
		
			System.out.println(data[i]);
			
			
		}
		
		
	}

}