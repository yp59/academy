package com.kh.spring11.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.spring11.entity.StudentDto;

@Repository
public class StudentDaoImpl implements StudentDao{

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int sequence() {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("student.sequence");
	}

	@Override
	public void insert(StudentDto studentDto) {
		// TODO Auto-generated method stub
		sqlSession.insert("student.insert",studentDto);
	}

}
