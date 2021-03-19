package oop.inherit8;

public abstract class Media {
	private String name;
	
	private int filesize;
	
	
	public Media(String name) {
		
		this.name=name;
	
	}

	public String getName() {
		return name;
	}

	public int getFilesize() {
		return filesize;
	}


	public void setFilesize(int filesize) {
		this.filesize = filesize;
	}

	public abstract void excute();
	
	
}
