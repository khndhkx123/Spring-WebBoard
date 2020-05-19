package com.adullam.dao;

import java.util.List;

import com.adullam.domain.CartVO;
import com.adullam.domain.QTinfoVO;

public interface ShopDAO {
	public List<QTinfoVO> qtlist() throws Exception;
	public List<CartVO> cartlist() throws Exception;
	public void addCart(CartVO cart) throws Exception;
}
