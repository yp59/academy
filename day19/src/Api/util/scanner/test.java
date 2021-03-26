package Api.util.scanner;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="빨,주 노+초&파@남#보";
		Scanner a = new Scanner(str);
		
		//구분자(delimiter)를 알려준다.(정규표현식 패턴지정이 가능)
		a.useDelimiter("[,\\s+\\&@#]");
		while(a.hasNext()) {
		
		System.out.println(a.next());
		
		}
		a.close();
	}

}
