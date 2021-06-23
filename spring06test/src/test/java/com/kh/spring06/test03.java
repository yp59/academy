package com.kh.spring06;

import org.apache.commons.dbcp2.BasicDataSource;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

public class test03 {

	@Test
	public void test03() {
		
		BasicDataSource bs = new BasicDataSource();
		
		bs.setDriverClassName("oracle.jdbc.OracleDriver");
		bs.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		bs.setPassword("study");
		bs.setUsername("study");
		
		bs.setMaxTotal(20);
		bs.setMaxIdle(10);
		bs.setMaxWaitMillis(1000L);
		
		JdbcTemplate jt = new JdbcTemplate();
		jt.setDataSource(bs);
		
		for(int i =0 ; i<20;i++) {
		String sql = "insert into item values(item_seq.nextval,?,?)";
		Object[] param = {"아디다스",3900};
		jt.update(sql,param);
		}//dbcp로 다수로 하니까 훨씬 빠르다
	}
}
