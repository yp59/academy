package com.kh.spring19.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.kh.spring19.entity.MemberDto;

public class MemberDaoImpl implements MemberDao{

	
	@Autowired
	private SqlSession sqlSession;
	@Override
	public MemberDto login(MemberDto memberDto) {
		
		return sqlSession.selectOne("member.login", memberDto);
	}

}
