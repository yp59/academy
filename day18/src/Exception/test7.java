package Exception;

public class test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		System.out.println(calculate.div(10, 0));
		}
		
		catch(Exception e) {
			e.printStackTrace();
			System.err.println("예외발생");
			
		}
	}

}
