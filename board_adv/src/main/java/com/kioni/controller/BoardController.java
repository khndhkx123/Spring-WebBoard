package com.kioni.controller;

import java.util.List;

import javax.inject.Inject;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kioni.domain.BoardVO;
import com.kioni.domain.CommentsVO;
import com.kioni.domain.PageDTO;
import com.kioni.service.BoardService;

@Controller
@RequestMapping(value = "/board")
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
		PageDTO page = new PageDTO();
		page.setPageNum(pageNum);
		page.setPageBlock(3);
		page.setPageSize(10);
		page.setCount(boardService.count());
		
		List<BoardVO> list = boardService.list(page);
		model.addAttribute("list", list);
		model.addAttribute("page", page);
		return "board/list";
	}
	
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public String moveView(Model model, @RequestParam int no) {
		logger.info("move view");
		BoardVO board = boardService.view(no);
		List<CommentsVO> comments = boardService.listComments(no);
		logger.info(board.toString());
		model.addAttribute("board", board);
		model.addAttribute("comments", comments);
		return "board/view";
	}

	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public String writePro(BoardVO boardVO) {
		logger.info("writePro");
		logger.info(boardVO.toString());
		int result = boardService.write(boardVO);
		return "redirect:/board/list"; //redirect = actual uri !!
	}
	
	@RequestMapping(value = "/write", method = RequestMethod.GET)
	public String movewrite(Model model, BoardVO boardVO) {
		logger.info("move write");
		model.addAttribute("board", boardVO);
		return "board/write"; //return = package board/write.jsp
	}
	
	@ResponseBody
	@RequestMapping(value = "/writeComments", method = RequestMethod.POST)
	public String writeComments(CommentsVO commentsVO) {
		logger.info(commentsVO.toString());
		int result = boardService.writeComments(commentsVO);
		return Integer.toString(result);
	}
	
	@SuppressWarnings("unchecked")
	@ResponseBody
	@RequestMapping(value = "/listComments", method = RequestMethod.POST, produces="application/json; charset=UTF8")
	public String listComments(@RequestParam int bNo) {
		List<CommentsVO> list = boardService.listComments(bNo);
		JSONObject obj = new JSONObject();
		JSONArray array = new JSONArray();
		for(int i=0; i<list.size(); i++) {
			JSONObject value = new JSONObject();
			value.put("no", list.get(i).getNo());
			value.put("bNo", list.get(i).getbNo());
			value.put("id", list.get(i).getId());
			value.put("content", list.get(i).getContent());
			value.put("cDate", list.get(i).getcDate());
			array.add(value);
		}
		obj.put("result", array);
		return obj.toString();
	}
}
