package com.kh.spring08;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@RequestMapping("/")
	@ResponseBody
	public String home() {
		
		return"home";
	}
	
	
	@RequestMapping("/test1")
	@ResponseBody//view resolver를 사용하지 않고 응답 정보를 직접 생성하겠다.
	public String test1() {
		
		return "Hello Test1";
	}
	
	@RequestMapping("/test2")
	@ResponseBody//view resolver를 사용하지 않고 응답 정보를 직접 생성하겠다.
	public String test2() {
		
		return "Hello Test2";
	}
	
	@RequestMapping("/test1/sub1")
	@ResponseBody//view resolver를 사용하지 않고 응답 정보를 직접 생성하겠다.
	public String test1sub1() {
		
		return "Hello Test1s1";
	}
	
	@RequestMapping("/test2/sub1")
	@ResponseBody//view resolver를 사용하지 않고 응답 정보를 직접 생성하겠다.
	public String test2sub1() {
		
		return "Hello Test2s1";
	}
	
	@RequestMapping("/test1/sub2")
	@ResponseBody//view resolver를 사용하지 않고 응답 정보를 직접 생성하겠다.
	public String test1sub2() {
		
		return "Hello Test1s2";
	}
	
	@RequestMapping("/test2/sub2")
	@ResponseBody//view resolver를 사용하지 않고 응답 정보를 직접 생성하겠다.
	public String test2sub2() {
		
		return "Hello Test2s2";
	}
	
	@RequestMapping("/test1/sub3")
	@ResponseBody//view resolver를 사용하지 않고 응답 정보를 직접 생성하겠다.
	public String test1sub3() {
		
		return "Hello Test1s3";
	}
	
	@RequestMapping("/test2/sub3")
	@ResponseBody//view resolver를 사용하지 않고 응답 정보를 직접 생성하겠다.
	public String test2sub3() {
		
		return "Hello Test2s3";
	}
	
	@RequestMapping("/test1/sub1/child1")
	@ResponseBody//view resolver를 사용하지 않고 응답 정보를 직접 생성하겠다.
	public String test1sub1child1() {
		
		return "Hello Test1s1c1";
	}
	
	@RequestMapping("/test1/sub1/child2")
	@ResponseBody//view resolver를 사용하지 않고 응답 정보를 직접 생성하겠다.
	public String test1sub1child2() {
		
		return "Hello Test1s1c2";
	}
}
