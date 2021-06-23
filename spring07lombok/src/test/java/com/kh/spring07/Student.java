package com.kh.spring07;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Data
@Builder
@NoArgsConstructor//기본생성자
@AllArgsConstructor//모든 생성자 구현
public class Student {

	/*
	 * setter / getter
	 * toString()
	 * equals()/hashcode()
	 * Data는 setter getter Tostring합친것
	 * 
	 * */
	
	private String name;
	private int score;
	
	
}
