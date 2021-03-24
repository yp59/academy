package api.lang.String;

public class test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문자열을 이용하여 형식 검사를 한다면???
		//사용자에게 회원 아이디를 입력받는다면? 아이디의 형식을 지켜야 한다.!
		//네이버 기준으로 아이디는 5~20글자
		//영문자와 숫자 특수문자중에서 -,_만 사용가능
		
		//문자열로 검사하면 매우 복잡하다.... 그래서 생긴 것이 문자 정규포현식?
		
		String id ="jyp5760";
		boolean first= id.length()>=5&&id.length()<=20;
		
		
	}

}
