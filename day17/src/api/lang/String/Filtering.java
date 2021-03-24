package api.lang.String;

import java.util.Scanner;

public class Filtering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		String[] filter = {"십장생","신발끈","개나리","식빵","시베리아"};
		
		String[] star = {
				"",
				"*","**","***","****","*****","*******"
		};
		String chat = in.nextLine();
		for(int i=0;i<filter.length;i++) {
			
			if(chat.contains(filter[i])) {
				
				chat=chat.replace(filter[i], starGenerator.star(filter[i].length()));
			}
			
		
		}
		System.out.println(chat);
	}

}
