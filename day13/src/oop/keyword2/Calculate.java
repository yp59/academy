package oop.keyword2;

public class Calculate {
private int first;
private int second;

public int getFirst() {
	return first;
}
public void setFirst(int first) {
	this.first = first;
}
public int getSecond() {
	return second;
}
public void setSecond(int second) {
	this.second = second;
}

public Calculate() {
	
	
}

public Calculate(int first, int second) {
	this.setFirst(first);
	this.setSecond(second);
	
}

public int plus() {
	return (first+second);
}

public int minus() {
	
	return (first-second);
}

}
