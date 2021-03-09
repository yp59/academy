package conditon2;
import java.util.ArrayList;

class time extends Thread{
	int count;
	
	time(int count){
		
		this.count=count;
		
	}
	public void run() {//객체 생성 후 start();시 run 메소드 실행됨 (동시에)
		
		
		System.out.println(count+"thread on");//먼저실행되고
		
		try {
			sleep(1000);
			
		}catch(Exception e) {
			
		}
		System.out.println(count+"thread end");//딜레이 후에 실행된다.

	}
	
	
	
	
}

public class UseThread2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Thread> threads=new ArrayList<Thread>();//쓰레드를 담기위해 만든 arraylist
		
		time test = null ;
		
		for(int i=0;i<10;i++) {
			test=new time(i);
			test.start();
			threads.add(test);
		}
		
		
	
		
		for(int i=0;i<threads.size();i++)//list를 상속받은 클래스는 length가 아니라 size로 길이를 재야함.
		{
			try {
				
				test.join();
			}catch(Exception e) {
				
				
			}
			
			
			}
		System.out.println("main end");
	}

}
