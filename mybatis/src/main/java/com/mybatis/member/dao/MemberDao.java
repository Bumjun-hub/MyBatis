package com.mybatis.member.dao;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.member.vo.Member;

public class MemberDao {

	public Member loginMember(SqlSession sqlSession, Member m) {
		// sqlSession.xml의id("",m)
//		Member loginUser = sqlSession.selectOne("memberMapper.loginMember");
//		return loginUser;
		
		return sqlSession.selectOne("memberMapper.loginMember",m);
	}

}
