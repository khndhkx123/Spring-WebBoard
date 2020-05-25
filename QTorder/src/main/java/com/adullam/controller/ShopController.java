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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.adullam.domain.CartListVO;
import com.adullam.domain.CartVO;
import com.adullam.domain.MemberVO;
import com.adullam.domain.QTinfoVO;
import com.adullam.domain.QTorderVO;
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
	
	@RequestMapping(value="/cartlist", method = RequestMethod.GET)
	public void getcartList(Model model, HttpSession session) throws Exception{
		logger.info("GET : CARTLIST");
		
		MemberVO member = (MemberVO)session.getAttribute("member");
		String mb_id = member.getMb_id();
		
		List<CartListVO> cartlist = service.cartlist(mb_id);
		
		model.addAttribute("cartlist", cartlist);
	}
	
	@ResponseBody
	@RequestMapping(value="/addCart", method = RequestMethod.POST)
	public void addCart(CartVO cart, HttpSession session) throws Exception{
		logger.info("POST : ADDCART");
		
		MemberVO member = (MemberVO)session.getAttribute("member");
		cart.setMb_id(member.getMb_id());
		
		service.addCart(cart);
	}
	
	@ResponseBody
	@RequestMapping(value="/deleteCart", method = RequestMethod.POST)
	public void deleteCart(@RequestParam(value = "cart_no") int cart_no, CartVO cart, HttpSession session) throws Exception{
		logger.info("POST : DELETECART");
		
		MemberVO member = (MemberVO)session.getAttribute("member");
		cart.setMb_id(member.getMb_id());
		cart.setCart_no(cart_no);
		
		service.deleteCart(cart);
	}
	
	@ResponseBody
	@RequestMapping(value="/addOrder", method = RequestMethod.POST)
	public void deleteCart(@RequestParam(value = "total_price") int total_price, QTorderVO order, HttpSession session) throws Exception{
		logger.info("POST : ADDORDER");
		
		MemberVO member = (MemberVO)session.getAttribute("member");
		order.setMb_name(member.getMb_name());
		order.setTotal_price(total_price);
		
		service.addOrder(order);
	}

}
