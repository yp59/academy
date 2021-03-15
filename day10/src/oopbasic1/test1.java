package oopbasic1;
public class test1 {

	//메세지는 보낸사람,시간,내용,안읽은 사람 수

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Message a= new Message(); //a는 참조변수(리모컨같은 존재) massage()는 객체
		Message b= new Message();
		Message c= new Message();
		Message d= new Message();
		
		a.sender = "초롱초롱 라이언";
		a.content = "응 먹고 들어가는중";
		a.time = "오후 12 : 39";
		a.remain = 0;
		System.out.println(a.sender);
		System.out.println(a.content);
		System.out.println(a.time);
		System.out.println(a.remain);
		
		System.out.println(b.content);//string 기본값 null
		
		
		
	}

}
