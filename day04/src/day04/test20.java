package day04;

public class test20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int day =20190503;
		int year = day/10000;
		int month = day%10000/100;
		int date = day%100;
		
		System.out.println(year+"/"+month+"/"+date);
		
	}

}
