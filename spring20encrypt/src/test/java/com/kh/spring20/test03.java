package com.kh.spring20;

import org.junit.Test;

import lombok.extern.slf4j.Slf4j;


@Slf4j
public class test03 {
//단반향 암호화 : 데이터를 의도적으로 절삭하여 원본이 추리 불가능하도록 구현
	
	@Test
	public void test() {
		int number = 7;
		log.debug("number ={}", number);
		
		int encrypt = number*123456789%10;
		log.debug("encrypt ={}",encrypt);
	}
	
}
