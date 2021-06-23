package com.kh.spring06;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

//서버를 키지 않은 상태에서 Sprping에 등록해놓은 bean들의 정상 작동을 테스트
//runWith : 추가적으로 적용시킬 환경 정보를 설정
//ContextConfiguration : 설정파일 정보를 설정
//WebAppConfiguration : 가상의 web.xml을 사용하겠단는 설정

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
	"file:src/main/webapp/WEB-INF/spring/root-context.xml",
	"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"
})
@WebAppConfiguration
public class test04 {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Test
	public void test4() {
		//System.out.println(jdbcTemplate);
		
		String sql = "insert into item values(item_seq.nextval,?,?)";
		Object[] param = {"퓨마",3300};
		
		jdbcTemplate.update(sql,param);
		
		
	}
	
}
