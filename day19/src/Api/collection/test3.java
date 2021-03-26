package Api.collection;

import java.util.List;
import java.util.ArrayList;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> friends = new ArrayList<String>();
		String[] no =new String[2];
		
		friends.add("철수");	friends.add("영희");	friends.add("영수");	friends.add("민지");	friends.add("미영");
		friends.add("민수");
		
		for(int i=0;i<2;i++) {
		
			int x =	(int)(Math.random()*friends.size());
		
		no[i] = friends.get(x);
		friends.remove(x);
		System.out.println(no[i]);
		}
		
		
	}

}
