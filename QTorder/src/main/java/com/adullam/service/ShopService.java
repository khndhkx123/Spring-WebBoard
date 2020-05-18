package com.adullam.service;

import java.util.List;

import com.adullam.domain.CartVO;
import com.adullam.domain.QTinfoVO;

public interface ShopService {
	
	public List<QTinfoVO> qtlist() throws Exception;
	public void addCart(CartVO cart) throws Exception;
}
