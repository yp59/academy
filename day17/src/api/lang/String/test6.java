package api.lang.String;

public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//문자열 편집 : 문자열에 인위적인 조작을 가하여 새로운 문자열을 만들어내는 명령
		
		String word = "   Hello World   ";
		
		//대소문자 변환
		System.out.println(word.toUpperCase());
		System.out.println(word.toLowerCase());
		System.out.println(word);//문자열은 한번 저장하면 불변이기 때문에 수정은 안됨 덮어쓰기는 가능;
		
		//잘라내기
		String x= "www.naver.com";
		System.out.println(word.substring(5));//5까지 잘라내자
		System.out.println(x.substring(4,9));
		System.out.println(x.substring(0,1));//0부터 5까지 잘라내자
		
		
		//여백제거
		
		System.out.println(word.trim());//앞뒤의 여백을 없애준다.
		
		//치환
		String str = "오늘 점심은 짬뽕";
		System.out.println(str.replace("짬뽕", "짜장면"));
	}

}
