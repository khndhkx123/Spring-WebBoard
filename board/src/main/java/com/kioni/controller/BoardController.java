package com.kioni.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;//@Controller
import org.springframework.ui.Model;//model.addAttribute
import org.springframework.web.bind.annotation.ModelAttribute;//@ModelAttribute
import org.springframework.web.bind.annotation.RequestMapping;//@RequestMapping
import org.springframework.web.bind.annotation.RequestMethod;//@RequestMethod
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;//@RedirectAttr

import com.kioni.domain.*;
import com.kioni.service.BoardService;

@Controller//It is Controller
@RequestMapping(value = "/")//Access Addr(root)
public class BoardController {
	
	@Inject
	private BoardService service;//Call service
	
	@RequestMapping(value = "/listPage", method = RequestMethod.GET)
	public void listPage(@ModelAttribute("cri") Criteria cri, Model model) throws Exception {
		model.addAttribute("list", service.listCriteria(cri)); // JSP에 계산된 페이징 출력
	    PageMaker pageMaker = new PageMaker(); // 객체생성
	    pageMaker.setCri(cri); // setCri 메소드 사용
	    pageMaker.setTotalCount(service.listCountCriteria(cri)); // 전체 게시글 갯수 카운트
	    model.addAttribute("pageMaker", pageMaker);
	}
	
	@RequestMapping(value="/regist", method = RequestMethod.GET)
	public void registerGET(BoardVO board, Model model) throws Exception{
		
	}
	
	@RequestMapping(value="/regist", method = RequestMethod.POST)
	public String registPOST(BoardVO board, RedirectAttributes rttr) throws Exception{
		service.regist(board);//Call regist service
		return "redirect:/listPage";//After POST, return to listAll page
	}
	
	@RequestMapping(value="/read", method = RequestMethod.GET)
	public void read(@RequestParam("bno")int bno, Model model) throws Exception{
		model.addAttribute(service.read(bno));//READ Service call
	}
	
	@RequestMapping(value="/modify", method = RequestMethod.GET)
	public void modifyGET(int bno, Model model) throws Exception{
		model.addAttribute(service.read(bno));//READ before modify
	}
	
	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String modifyPOST(BoardVO board, RedirectAttributes rttr) throws Exception{
		service.modify(board);//Call modify service
		return "redirect:/listPage";//return to listAll page after Run
	}
	
	@RequestMapping(value = "/remove", method = RequestMethod.POST)
	public String removePOST(@RequestParam("bno") int bno, RedirectAttributes rttr) throws Exception{
		service.remove(bno);//Call remove service
		return "redirect:/listPage";
	}	
	
}