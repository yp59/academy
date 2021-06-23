package com.kh.spring07;

import org.junit.Test;

public class Test01 {

	@Test
	public void test() {
		Student student = new Student();
		student.setName("name");
		student.setScore(100);
		System.out.println(student);
		System.out.println(student.builder());
	}
}
