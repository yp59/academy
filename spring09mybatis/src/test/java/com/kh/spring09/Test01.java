package com.kh.spring09;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

//테스트 목표 : mybatis를 사용할 수 있도록 필요한 도구를 생성
//sqlSessionFactory : 마이 바티스 작업을 위한 기본 환경을 구축하는 역할(공장) : 설정파일을 불러와야 함
public class Test01 { 

	@Test
	public void test() throws IOException {
		//마이바티스에서 제공하는 설정 파일 로드 방법(경로는 classpath부터 작성)
		InputStream in = Resources.getResourceAsStream("mybatis/mybatis-config.xml");
		//도구생성
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
		System.out.println(factory);
		
		assertNotNull(factory);		
	}
}
