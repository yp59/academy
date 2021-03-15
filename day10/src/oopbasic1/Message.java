package oopbasic1;


//이 클래스는 자바에게 메세지가 어떤 모양인지 알려주기 위해서 만들었다.
//메세지는 보낸사람,내용,시간,안읽은 사람 수로 구성되어 있다.
//메세지 데이터 타입은 String String String int로 구성되어 있다.

class Message {
	//인스턴스 변수 : 객체의 내부에서 데이터를 저장하기 위한 공간
	String sender;
	String content;
	String time;
	int remain;

}
