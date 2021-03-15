package oop.basic7;

class menu{
	String name,kinds;
	int price;
	String promotion;

		menu(String name,String kinds,int price,String promotion){
			this.name=name;
			this.kinds=kinds;
			this.promotion=promotion;
			
			if(promotion.equals("행사중")) this.price=price-price*20/100;
			else this.price=price;
			
			
		}
		
		
	
	void get() {
		
		System.out.println(name+"\n"+kinds+"\n"+price+"\n"+promotion+"\n");
	}
}

public class test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		menu a =new menu("아메리카노","음료",2000,"행사중");
		menu b =new menu("프라프치노","음료",3500,"행사아님");
		menu c =new menu("치즈케이크","빵",5000,"행사중");
		menu d =new menu("샌드위치","빵",3000,"행사아님");
		a.get();
		b.get();
		c.get();
		d.get();
	}

}
