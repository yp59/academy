package Api.collection;

import java.util.List;
import java.util.ArrayList;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lotto = new ArrayList<Integer>();
		List<Integer> LuckyNumber = new ArrayList<Integer>();
		
		for(int i=0;i<45;i++) lotto.add(i+1);	
		
		
		
		for(int i=0;i<6;i++) {
			
			int num= (int) (Math.random()*45);
			
			LuckyNumber.add(lotto.get(num));
			lotto.remove(num);
		}
		System.out.println(LuckyNumber.toString());
	}

}
