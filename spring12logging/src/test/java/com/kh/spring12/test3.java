package com.kh.spring12;

import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class test3 {
		
		@Test
		public void test() {
			//Logger 문법
			log.debug("Logger에는 한 개의 문자열을 출력할 수 있습니다");
			log.debug("값을 출력할 경우 특수문자를 지원합니다. a = {}", 10);
			
			int a = 10;
			System.out.println("a = " + a);
			log.debug("a = {}", a);
			
			int b = 20;
			System.out.println("a = " + a + " , b = " + b);
			log.debug("a = " + a + " , b = " + b);
			log.debug("a = {} , b = {}", a, b);
			
			//(주의) 객체는 직접 출력이 안된다.
			Object c = new Object();
			System.out.println(c);//c.toString()
//			log.debug(c);//에러
			log.debug(c.toString());//c가 null이면 에러 발생
			log.debug("{}", c);//c가 null이어도 에러 발생하지 않음
		}
}
