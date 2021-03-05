import java.util.Calendar;
public class Today {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar today=Calendar.getInstance();
		
		int year= today.get(Calendar.YEAR);
		int month=today.get(Calendar.MONTH)+1;
		int date=today.get(Calendar.DATE);

		System.out.println(year+"/"+month+"/"+date);
		
	}

}
