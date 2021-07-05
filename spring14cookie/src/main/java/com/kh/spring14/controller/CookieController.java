package com.kh.spring14.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CookieController {
	@RequestMapping("/2")
	public String home(HttpServletRequest request, Model model) {
		//질문 : 쿠키 직접 탐색
		Cookie[] cookies = request.getCookies();
		String visit = null;
		for(Cookie cookie : cookies) {
			if(cookie.getName().equals("visit")) {
				visit = cookie.getValue();
				break;
			}
		}
		
		model.addAttribute("visit", visit);
		return "home";
	}
	
	//@CookieValue 는 해당하는 이름의 쿠키 값을 읽어오는 annotation
	//= Spring에서는 annotation을 이용하여 특정 쿠키만 가져올 수 있도록 지원한다.
	
	@RequestMapping("/")
	public String home(@CookieValue(required = false) String visit, Model model) {
//		System.out.println("visit = " + visit);
		model.addAttribute("visit", visit);
		return "home";
	}
	
	/**
	 *	쿠키를 생성한다
	 *	= 쿠키 객체를 만들어 사용자에게 보낸다
	 *	= 사용자에게 보내기 위해서는 HttpServletResponse(응답객체)가 필요하다 
	 * @throws UnsupportedEncodingException 
	 */
	@RequestMapping("/create")
	public String create(HttpServletResponse response) throws UnsupportedEncodingException {
		String time = "한글들어갑니다!";
		String encode = URLEncoder.encode(time, "UTF-8");//불편한 값들에 대한 변환
		Cookie cookie = new Cookie("visit", encode);//쿠키객체를 (이름,값)으로 생성한다.
		cookie.setMaxAge(1 * 24 * 60 * 60);//쿠키의 유효시간을 초단위로 설정한다.
		response.addCookie(cookie);//쿠키를 사용자에게 보낸다.
		return "redirect:/";
	}
	
	/**
	 *  쿠키를 삭제한다
	 *  = 기존의 쿠키와 동일한 이름 객체를 만들어 사용자에게 보내지만 0초 뒤에 소멸되도록 설정한다.
	 */
	@RequestMapping("/delete")
	public String delete(HttpServletResponse response) {
		Cookie cookie = new Cookie("visit", "");
		cookie.setMaxAge(0);
		response.addCookie(cookie);
		return "redirect:/";
	}
	
	@RequestMapping("/show")
	public String show(HttpServletResponse response) {
		Cookie cookie = new Cookie("show", "");
		cookie.setMaxAge(0);
		response.addCookie(cookie);
		return "redirect:/";
	}
	
	@RequestMapping("/hide")
	public String hide(HttpServletResponse response) {
		//시간 계산
		Calendar c = Calendar.getInstance();//익일 0시 0분 0초
		c.add(Calendar.DATE, 1);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		
		Date d = new Date();//현재시간
		
		long gap = c.getTimeInMillis() - d.getTime();
		int gapSecond = (int)(gap / 1000);
		
		Cookie cookie = new Cookie("show", "");
		cookie.setMaxAge(gapSecond);
		response.addCookie(cookie);
		return "redirect:/";
	}
	
}