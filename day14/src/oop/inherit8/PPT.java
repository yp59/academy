package oop.inherit8;
//나머지 채우자
public class PPT extends Media{

	private int size;
	
	public PPT(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		this.size=1;
	}
	
	public int getSize() {

		return size;
	}

	public void setSize(int size) {
		if(size<1)return;
		this.size = size;
	}

	@Override
	public void excute() {
		// TODO Auto-generated method stub
		System.out.println("파워포인트 애니메이션을 재생합니다" );
	}
	public void information() {
		System.out.println(getName()+getFilesize()+getSize());
		
	}
}
