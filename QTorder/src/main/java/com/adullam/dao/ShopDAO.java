package com.adullam.dao;

import java.util.List;

import com.adullam.domain.QTinfoVO;

public interface ShopDAO {
	public List<QTinfoVO> qtlist() throws Exception;
}
