package com.kh.spring09;

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

public class Test6 {
	private SqlSession sqlSession;
	
	@Before
	public void before() throws IOException {
		InputStream in = Resources.getResourceAsStream("mybatis/mybatis-config.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
		sqlSession = factory.openSession(false);	
	}
	
	@Test
	public void test() {
		//원하는 항목과 원하는 값을 이용하여 검색을 수행
		//ex : type=item_name, keyword=피자 10판이면 item_name=피자 10판 인 항목을 조회
		Map<String, Object> map =new HashMap<>();
		map.put("type", "item_price");
		map.put("keyword", 50000);
		
		List<ItemDto> list = sqlSession.selectList("item.select3",map);
		for(ItemDto itemDto : list) {
			System.out.println(itemDto);
		}
		}
	
	
	@After
	public void after() {
		sqlSession.rollback();
	}
}
