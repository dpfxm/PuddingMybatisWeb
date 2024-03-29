package com.kh.member.model.dao;

import org.apache.ibatis.session.SqlSession;

import com.kh.member.model.vo.Member;

public class MemberDAO {

	public int insertMember(SqlSession conn, Member member) {
		int result = conn.insert("MemberMapper.insertMember", member);
		return result;
	}

	public Member selectCheckLogin(SqlSession conn, Member member) {
		Member mOne = conn.selectOne("MemberMapper.selectCheckLogin", member);
		return mOne;
	}

	public Member selectOneById(SqlSession conn, String memberId) {
		Member member = conn.selectOne("MemberMapper.selectOneById", memberId);
		return member;
	}

	public int updatetMember(SqlSession conn, Member member) {
		int result = conn.update("MemberMapper.updateMember", member);
		return result;
	}

	public int deletetMember(SqlSession conn, String memberId) {
		int result = conn.update("MemberMapper.deleteMember", memberId);
		return result;
	}

}
