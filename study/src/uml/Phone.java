package uml;

public abstract class Phone {
	private static String number;
	private String serial;
	
	public abstract void sms();
	public abstract void call();
}