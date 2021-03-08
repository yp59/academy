package day04;

public class test21 {

	public static void main(String[] args) {
		
		int price = 85000;
		int discount = 30;
		int final_price =(int) (price-price*discount/100.0);
		
		System.out.println(price);
		System.out.println(final_price);
	}
}
