package com.adullam.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.adullam.dao.ShopDAO;
import com.adullam.domain.CartListVO;
import com.adullam.domain.CartVO;
import com.adullam.domain.QTinfoVO;
import com.adullam.domain.QTorder;

@Service
public class ShopServiceImpl implements ShopService {

	@Inject
	private ShopDAO dao;

	@Override
	public List<QTinfoVO> qtlist() throws Exception {
		return dao.qtlist();
	}

	@Override
	public List<CartListVO> cartlist(String mb_id) throws Exception {
		return dao.cartlist(mb_id);
	}
	
	@Override
	public List<QTorder> qtorderlist() throws Exception {
		return dao.qtorderlist();
	}

	@Override
	public void addCart(CartVO cart) throws Exception {
		dao.addCart(cart);
	}

	@Override
	public void deleteCart(CartVO cart) throws Exception {
		dao.deleteCart(cart);
	}

	@Override
	public void addOrder(QTorder order) throws Exception {
		dao.addOrder(order);
	}
	
}
