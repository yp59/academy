package oop.inherit8;
//구현완료
public class MP3 extends MediaPlayer{

	private int duration;
	
	public MP3(String name) {
		
		super(name);
	
	}
	
	public void setDuration(int duration) {
		if(duration<1)return;
		this.duration=duration;
	}
	public int getDuration() {
		return duration;
	}
	
	@Override
	public void excute() {
		// TODO Auto-generated method stub
		System.out.println("음악 재생을 시작합니다");
	}

	@Override
	public void forward() {
		// TODO Auto-generated method stub
		System.out.println("음악 빨리감기 시작합니다");

	}

	@Override
	public void rewind() {
		// TODO Auto-generated method stub
		System.out.println("음악 되감기 시작합니다");

	}
	public void result() {
		
		System.out.println(getName());
		System.out.println(getFilesize());
		excute();
		forward();
		rewind();
		getDuration();
		
		
	}

}
