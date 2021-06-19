package com.kh.home.mybatis;

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
public class test5delete {

	
	@Autowired
	private SqlSession sqlSession;
	int memberNo = 5;
	
	
	@Before
	public void before() {
		
	}
	
	@Test
	public void test() {
		sqlSession.delete("member.delete",memberNo);
		
		
	}
	@After
	public void after() {
		
	}
}
