package loop;

import java.util.Scanner;

public class test4 {
public static void main(String[] args) {
	
	Scanner in =new Scanner(System.in);
	
	int answer=0;
	int life=3;
	int count=0;
	int My_answer=-1;
	for(int i=1;i<10;i++) {
		
		for(int j=1;j<10;j++) {
			answer= i*j;
			
			
			while(true) {
				System.out.println(i+"*"+j+"= ?");
				System.out.println("답은?");
				
				My_answer=in.nextInt();
				
				if(answer==My_answer) {
					count++;
					System.out.println("정답입니다.");
					System.out.println("정답갯수 : "+count);
				break;
				}
				else {
					System.out.println("틀렸습니다.");
					life--;
					if(life==0)break;
				}
			}
			if(life==0)break;
		
		
		}
		if(life==0)break;
	}
	
	
}
}
