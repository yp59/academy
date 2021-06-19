package com.kh.home.mybatis;

import static org.junit.Assert.assertNotNull;

import java.util.Date;
import java.util.List;

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
public class test2regist {

	@Autowired
	private SqlSession sqlSession;
	
	MemberDto memberDto = new MemberDto();
	@Before
	public void before() {
	
		memberDto.setMemberId("cacalote12");
		memberDto.setMemberPw("cacalote12");
		memberDto.setMemberNick("후이잉윙");
		memberDto.setMemberBirth("1995-02-14");
		memberDto.setMemberPhone("010-1335-4233");
		memberDto.setMemberEmail("asdkfj@nqaer.com");
	}
	
	@Test
	public void test() {
		//member_seq.nextval,#{memberId},#{memberPw},
		//#{memberNick},#{memberBirth},#{memberPhone},sysdate,#{memberEmail},0,'일반'
		
	
			sqlSession.insert("member.regist", memberDto);
		}
	
	@After
	public void after() {
		assertNotNull(sqlSession);
		
	}
		
	
}
