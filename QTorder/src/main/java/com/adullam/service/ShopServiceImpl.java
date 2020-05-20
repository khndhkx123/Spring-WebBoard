package com.adullam.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.adullam.dao.ShopDAO;
import com.adullam.domain.CartListVO;
import com.adullam.domain.CartVO;
import com.adullam.domain.QTinfoVO;

@Service
public class ShopServiceImpl implements ShopService{
	
	@Inject
	private ShopDAO dao;

	@Override
	public List<QTinfoVO> qtlist() throws Exception {
		
		return dao.qtlist();
	}	

	@Override
	public List<CartListVO> cartlist() throws Exception {
		return dao.cartlist();
	}

	@Override
	public void addCart(CartVO cart) throws Exception {
		dao.addCart(cart);
	}
	
}
