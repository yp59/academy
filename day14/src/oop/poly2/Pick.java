package oop.poly2;

public class Pick {
	public static void SmartPhone(Phone[] c) {
		double ran;
		for(int i=0;i<c.length;i++) {
			ran = (Math.random());
			
		if(ran<0.25) c[i]= new Galaxy21s(Random.Gpick());
			
		  else if(ran<0.5)c[i]= new GalaxyNote10(Random.Gpick());
		
		  else if(ran<0.75)c[i]= new Iphone12(Random.Ipick());	
			
		  else if(ran<1)c[i]= new Iphone11(Random.Ipick());
		System.out.print(c[i].getColor()+"  ");
		c[i].call();
		}
	}

	public static void ApplePhone(Apple[] b) {
		double ran;
		for(int i=0;i<b.length;i++) {
			ran = (Math.random());
			
		if(ran>0.5) b[i]= new Iphone12(Random.Ipick());
			
		  else  b[i]= new Iphone11(Random.Ipick());
		System.out.print(b[i].getColor()+"  ");
		b[i].Siri();
		}
	}

	public static void SamsungPhone(Samsung[] a) {
		double ran;
		for(int i=0;i<a.length;i++) {
			ran = (Math.random());
			
		if(ran>0.5) a[i]= new Galaxy21s(Random.Gpick());
			
		  else  a[i]= new GalaxyNote10(Random.Gpick());
		System.out.print(a[i].getColor()+"  ");
		a[i].samsungStore();
		}
	}

}
