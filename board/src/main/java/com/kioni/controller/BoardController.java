package com.kioni.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;//@Controller
import org.springframework.ui.Model;//model.addAttribute
import org.springframework.web.bind.annotation.RequestMapping;//@RequestMapping
import org.springframework.web.bind.annotation.RequestMethod;//@RequestMethod
import org.springframework.web.servlet.mvc.support.RedirectAttributes;//@RedirectAttr

import com.kioni.domain.BoardVO;
import com.kioni.service.BoardService;

@Controller//It is Controller
@RequestMapping(value = "/")//Access Addr(root)
public class BoardController {
	
	@Inject
	private BoardService service;//Call service
	
	@RequestMapping(value="/listAll", method = RequestMethod.GET)//Access Addr(/listAll)
	public void listAll(Model model) throws Exception{//Model model : interfaces
		model.addAttribute("list", service.listAll());//To jsp(service call)
	}
	
	@RequestMapping(value="/regist", method = RequestMethod.GET)
	public void registerGET(BoardVO board, Model model) throws Exception{
		
	}
	
	@RequestMapping(value="/regist", method = RequestMethod.POST)
	public String registPOST(BoardVO board, RedirectAttributes rttr) throws Exception{
		service.regist(board);//Call regist service
		return "redirect:/listAll";//After POST, return to listAll page
	}
}