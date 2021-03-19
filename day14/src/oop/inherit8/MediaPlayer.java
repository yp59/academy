package oop.inherit8;

public abstract class MediaPlayer extends Media {

	public MediaPlayer(String name) {
		
		super(name);
		
	}

	public abstract void  forward();
	public abstract void  rewind();

	
}
