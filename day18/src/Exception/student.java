package Exception;

import java.util.InputMismatchException;
import java.util.regex.Pattern;

public class student {

	private String name;
	private int lang;
	private int math;
	private int eng;

	public student() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		String regex = "^[가-힣]{2,7}$";
		if(!Pattern.matches(regex, name)) {
			
			throw new InputMismatchException("2~7자 사이의 이름을 입력해주세요");
		}
		this.name = name;
	}

	public int getLang() {
		return lang;
	}

	public void setLang(int lang) {
		if(lang<0||lang>100) {
			
			throw new InputMismatchException("0~100사이의 점수를 입력해주세요");
		}
		
		this.lang = lang;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		if(math<0||math>100) {
			
			throw new InputMismatchException("0~100사이의 점수를 입력해주세요");
		}
		
		this.math = math;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		if(eng<0||eng>100) {
			
			throw new InputMismatchException("0~100사이의 점수를 입력해주세요");
		}
		
		this.eng = eng;
	}

	public student(String name, int lang, int math, int eng) {
		super();
		this.setName(name);
		this.setLang(lang);
		this.setMath(math);
		this.setEng(eng);
	}
}
