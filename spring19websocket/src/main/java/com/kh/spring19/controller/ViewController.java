package com.kh.spring19.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/view")
public class ViewController {
	
	@RequestMapping("/basic")
	public String basic() {
		
		return "ws/basic";
	}
	
	@GetMapping("/member")
	public String member() {
		return "ws/member";
	}
}
