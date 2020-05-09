package com.kioni.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kioni.service.BoardService;

@Controller
@RequestMapping(value="/board_adv")
public class BoardController {
	
	@Inject
	private BoardService boardService;
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@RequestMapping(value="/test1",method=RequestMethod.GET)
	public String test1() {
		logger.info("move test1");
		int result = boardService.test1();
		return "";
	}
}
