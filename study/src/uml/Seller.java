package uml;
//휴대폰 판매기
public class Seller {
	
	//아이폰 판매기능
	public Iphone12 sell1(int money) {
		Iphone12 phone = new Iphone12();
		return phone;
	}
	
	//갤럭시 판매기능
	public Galaxy21s sell2(int money) {
		Galaxy21s phone = new Galaxy21s();
		return phone;
	}
	
}