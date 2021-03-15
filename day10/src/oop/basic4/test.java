package oop.basic4;

class market{
	private String goods;
	private String name;
	private String calssification;
	private int price;
	
	void set(String goods,
	String name,
	String calssification,
	int price) {
		this.goods=goods;
		this.name=name;
		this.calssification=calssification;
		this.price=price;

		
	}
	
	void print() {
		System.out.println(goods+"\n"+name+"\n"+calssification+"\n"+price+"\n");
		
	}
	
	
}


public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		market a = new market();
		market b = new market();
		market c = new market();
		
		a.set("A00001", "참이슬", "주류", 1200);
		b.set("A00002", "참이슬", "주류", 1300);
		c.set("B00001", "참이슬", "생필품", 2000);
		a.print();
		b.print();
		c.print();
	}

}
