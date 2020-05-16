package com.adullam.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.adullam.domain.MemberVO;

public class AdminInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object obj) throws Exception {
		
		HttpSession session = req.getSession();
		MemberVO member = (MemberVO)session.getAttribute("member");
		
		if(member == null || member.getMb_ident() == 2) {
			// 로그인을 안했거나, 관리자가 아닌 일반성도의 경우
			res.sendRedirect("/");
			return false;
		}
		
		return true;
	}
}
