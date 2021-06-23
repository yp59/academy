package com.kh.spring09;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.kh.spring09.entity.ItemDto;

public class Test7 {
	private SqlSession sqlSession;
	
	@Before
	public void before() throws IOException {
		InputStream in = Resources.getResourceAsStream("mybatis/mybatis-config.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
		sqlSession = factory.openSession(false);	
	}
	
	@Test
	public void test() {
	//primary key 사용한 단일조회
		int itemNo =20;
		ItemDto itemDto = sqlSession.selectOne("item.select4",itemNo);//2개 나오면 에러난다.
		System.out.println(itemDto);
		assertNotNull(itemDto);
		
		}
	
	
	@After
	public void after() {
		sqlSession.rollback();
	}
}
