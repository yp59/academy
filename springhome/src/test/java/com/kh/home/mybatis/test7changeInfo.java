package com.kh.home.mybatis;

import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.kh.home.entity.MemberDto;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
	"file:src/main/webapp/WEB-INF/spring/root-context.xml",
	"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"
})
@WebAppConfiguration
public class test7changeInfo {

	
	/*
	 * {memberNick}, member_birth=#{memberBirth},
 member_phone=#{memberPhone}, member_email=#{memberEmail}
 where member_no=#{memberNo} and member_pw=#{memberPw}*/
	
	@Autowired
	private SqlSession sqlSession;
	
	MemberDto memberDto =new MemberDto();
	@Before
	public void before() {
		memberDto=MemberDto.builder()
				.memberNo(4)
				.memberPw("admin0002")
				.memberNick("관리자둘둘")
				.memberBirth("1111-12-23")
				.memberPhone("010-0000-0000")
				.memberEmail("qwerqwer@qwer.com")
				.build();
	}
	int count;
	@Test
	public void test() {
	 count= sqlSession.update("member.changeInfo",memberDto);
	
	}
	@After
	public void after() {
	System.out.println(count);
		
	}
}
