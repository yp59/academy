package kh.exam.model.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import kh.exam.model.vo.Member;

public class MemberDAO {

	
	
	public int insertMember(SqlSession session, Member m) {
		
		return session.insert("mybatis.insertMember",m);
	}
	
}
