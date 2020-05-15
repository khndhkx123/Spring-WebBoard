package com.adullam.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.adullam.domain.MemberVO;
import com.adullam.service.MemberService;

@Controller
@RequestMapping("/member/*")
public class MemberController {
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Inject
	MemberService service;
	
	@RequestMapping(value="/signup", method=RequestMethod.GET)
	public void getSignup() throws Exception{
		logger.info("GET : signup");
	}
	
	@RequestMapping(value="/signup", method=RequestMethod.POST)
	public String postSignup(MemberVO vo) throws Exception{
		logger.info("POST : signup");
		
		String input_pw = vo.getMb_pw();
		vo.setMb_pw(input_pw);
		
		service.signup(vo);
		
		return "redirect:/";
	}

}
