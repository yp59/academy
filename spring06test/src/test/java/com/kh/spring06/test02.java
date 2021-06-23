package com.kh.spring06;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class test02 {

	@Autowired
	//jdbctemplate을 직접 만들어서 명령을 실행시켜본다.
	
	@Test
	public void test() {
	DriverManagerDataSource dataSource = new DriverManagerDataSource();
	dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
	dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
	dataSource.setPassword("study");
	dataSource.setUsername("study");
	
	JdbcTemplate jdbcTemplate = new JdbcTemplate();
	jdbcTemplate.setDataSource(dataSource);
	
	for(int i =0 ; i<20;i++) {
	
	String sql ="insert into item values(item_seq.nextval,?,?)";
	Object[] param = {"나이키",1300};
	jdbcTemplate.update(sql,param);
	}
	}
}
