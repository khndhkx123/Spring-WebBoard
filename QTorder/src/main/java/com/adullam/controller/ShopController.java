package com.adullam.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.adullam.domain.CartVO;
import com.adullam.domain.MemberVO;
import com.adullam.domain.QTinfoVO;
import com.adullam.service.ShopService;

@Controller
@RequestMapping(value="/shop/*")
public class ShopController {
	private static final Logger logger = LoggerFactory.getLogger(ShopController.class);
	
	@Inject
	ShopService service;
	
	@RequestMapping(value="/list", method = RequestMethod.GET)
	public void getqtList(Model model) throws Exception{
		logger.info("GET : GETLIST");
		
		List<QTinfoVO> list = service.qtlist();
		
		model.addAttribute("list", list);
	}
	
	@ResponseBody
	@RequestMapping(value="/addCart", method = RequestMethod.POST)
	public void addCart(CartVO cart, HttpSession session) throws Exception{
		logger.info("POST : ADDCART");
		
		MemberVO member = (MemberVO)session.getAttribute("member");
		cart.setMb_id(member.getMb_id());
		
		service.addCart(cart);
	}

}
