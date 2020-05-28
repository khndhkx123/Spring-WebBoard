package com.adullam.service;

import java.util.List;

import com.adullam.domain.CartListVO;
import com.adullam.domain.CartVO;
import com.adullam.domain.OrderCountVO;
import com.adullam.domain.QTinfoVO;
import com.adullam.domain.QTorderVO;

public interface ShopService {
	
	public List<QTinfoVO> qtlist() throws Exception;
	public List<CartListVO> cartlist(String mb_id) throws Exception;
	public List<QTorderVO> orderlist() throws Exception;
	public List<OrderCountVO> ordercount() throws Exception;
	public void addCart(CartVO cart) throws Exception;
	public void deleteCart(CartVO cart) throws Exception;
	public void addOrder(QTorderVO order) throws Exception;
}
