package com.adullam.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.adullam.dao.MemberDAO;
import com.adullam.domain.MemberVO;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Inject
	private MemberDAO dao;

	@Override
	public void signup(MemberVO vo) throws Exception {
		dao.signup(vo);
	}
	
}
