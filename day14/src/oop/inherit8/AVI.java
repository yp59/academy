package oop.inherit8;
//완성
public class AVI extends MediaPlayer{
	private int speed;

	public AVI(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		this.speed=1;
	}

	public int getSpeed() {

		return speed;
	}

	public void setSpeed(int speed) {
		if(speed<1)return;
		this.speed = speed;
		
	}
	
	@Override
	public void excute() {
		// TODO Auto-generated method stub
		System.out.println("영상 재생을 "+speed+"배속으로 시작합니다" );
	}

	@Override
	public void forward() {
		// TODO Auto-generated method stub
		System.out.println("영상 재생을 빨리감기 시작합니다");

	}

	@Override
	public void rewind() {
		// TODO Auto-generated method stub
		System.out.println("영상 재생을 되감기 시작합니다");

	}
	public void result() {
		System.out.println(getName());
		System.out.println(getFilesize());
		excute();
		forward();
		rewind();
	}

}
