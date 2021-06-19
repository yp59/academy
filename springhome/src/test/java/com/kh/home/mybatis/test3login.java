package com.kh.home.mybatis;

import static org.junit.Assert.assertNotNull;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
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

import com.kh.home.entity.ItemDto;
import com.kh.home.entity.MemberDto;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
	"file:src/main/webapp/WEB-INF/spring/root-context.xml",
	"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"
})
@WebAppConfiguration
public class test3login {

	@Autowired
	private SqlSession sqlSession;
	
	MemberDto memberDto;
	
	@Before
	public void before() {
		memberDto=MemberDto.builder().
				memberId("cacalote123").
				memberPw("cacalote123").
				build(); 
		
	}
	
	@Test
	public void test() {
	
		sqlSession.selectOne("member.login", memberDto);
		
	
	}
	
	@After
	public void after() {
		assertNotNull(sqlSession);
		
	}
		
	
}
