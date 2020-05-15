package com.adullam.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.adullam.domain.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO{
	
	@Inject
	private SqlSession sql;
	
	private static String namespace = "com.adullam.mappers.MemberMapper";

	@Override
	public void signup(MemberVO vo) throws Exception {
		sql.insert(namespace + ".signup", vo);
	}

}
