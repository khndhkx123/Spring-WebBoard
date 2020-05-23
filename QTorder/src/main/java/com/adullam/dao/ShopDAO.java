package com.adullam.dao;

import java.util.List;

import com.adullam.domain.CartListVO;
import com.adullam.domain.CartVO;
import com.adullam.domain.QTinfoVO;

public interface ShopDAO {
	public List<QTinfoVO> qtlist() throws Exception;
	public List<CartListVO> cartlist(String mb_id) throws Exception;
	public void addCart(CartVO cart) throws Exception;
	public void deleteCart(CartVO cart) throws Exception;
}
