package oop.inherit6;

public class Monitor extends Display{

	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("모니터를 컬러로 전환합니다.");
	}

	@Override
	public void grayscale() {
		// TODO Auto-generated method stub
		System.out.println("모니터를 흑백으로 전환합니다.");

	}

	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("모니터 전원을 켭니다.");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("모니터 전원을 끕니다.");

	}

}
