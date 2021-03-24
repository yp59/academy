package api.lang.String;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String a = "hello";
		String b = "hello";//a 와 b는 hello라는 데이터를 같이 보고 있다.
				
		String c = new String("hello");//c는 참조형 이므로 hello라는 데이터를 c만 보고있다.
		String d = new String("hello");//d는 참조형 이므로 hello라는 데이터를 d만 보고있다.
		
		System.out.println(a.equals(c));
		System.out.println(c==d);
	}

}
