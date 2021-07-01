package com.kh.spring19.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.kh.spring19.entity.MemberDto;
import com.kh.spring19.repository.MemberDao;

public class MemberController {
	@Autowired
	private MemberDao memberDao;

	@GetMapping("/login")
	public String login() {
		return "member/login";//"/WEB-INF/views/member/login.jsp"
	}
	
	@PostMapping("/login")
	public String login(
			@ModelAttribute MemberDto memberDto,
			HttpSession session) {
		MemberDto find = memberDao.login(memberDto);
		if(find == null) {
			return "redirect:login?error";
		}
		else {
			session.setAttribute("memberNo", find.getMemberNo());
			return "redirect:/";
		}
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
}
