package com.kh.home.repository;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.home.entity.MemberDto;
@Repository
public class MemberDaoMybatis implements MemberDao{

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public void insert(MemberDto memberDto) {
		sqlSession.insert("member.regist",memberDto);
		
	}

	@Override
	public MemberDto login(MemberDto memberDto) {
		// TODO Auto-generated method stub
		return  sqlSession.selectOne("member.login",memberDto);
	}

	@Override
	public MemberDto get(int memberNo) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("member.get",memberNo);
	}

	@Override
	public boolean delete(int memberNo) {
		
		return sqlSession.delete("member.delete",memberNo)>0;
	}

	@Override
	public boolean changePassword(int memberNo, String curPassword, String newPassword) {
		Map<String, Object> map = new HashMap<>();
		
			map.put("newPassword", newPassword);
			map.put("memberNo", memberNo);
			map.put("curPassword", curPassword);
		
		return sqlSession.update("member.changePassword",map)>0;
	
	}

	@Override
	public boolean changeInformation(MemberDto memberDto) {
		// TODO Auto-generated method stub
		return sqlSession.update("member.changeInfo",memberDto)>0;
	}

}
