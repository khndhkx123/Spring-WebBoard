package com.adullam.service;

import com.adullam.domain.MemberVO;

public interface MemberService {
	
	//회원가입	
	public void signup(MemberVO vo) throws Exception;

}
