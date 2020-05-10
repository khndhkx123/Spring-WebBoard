package com.kioni.controller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.kioni.domain.BoardVO;
import com.kioni.service.BoardService;

@Controller
@RequestMapping(value = "/board_adv")
public class BoardController {

	@Inject
	private BoardService boardService;
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

	@RequestMapping(value = "/test1", method = RequestMethod.GET)
	public String test1() {
		logger.info("move test1");
		int result = boardService.test1();
		return "";
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String moveList(Model model, @RequestParam(value="pageNum", defaultValue="1") int pageNum) {
		logger.info("move list");
		List<BoardVO> list = boardService.list();
		model.addAttribute("list", list);
		return "board/list";
	}
	
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public String moveView(Model model, @RequestParam int no) {
		logger.info("move view");
		BoardVO board = boardService.view(no);
		model.addAttribute("board", board);
		return "board/view";
	}

	@RequestMapping(value = "/write", method = RequestMethod.GET)
	public String writePro(BoardVO boardVO) {
		logger.info("writePro");
		int result = boardService.write(boardVO);
		return "redirect:/board/list";
	}
}
