package com.adullam.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.adullam.domain.CartListVO;
import com.adullam.domain.CartVO;
import com.adullam.domain.QTinfoVO;
import com.adullam.domain.QTorderVO;

@Repository
public class ShopDAOImpl implements ShopDAO {

	@Inject
	private SqlSession sql;

	private static String namespace = "com.adullam.mappers.ShopMapper";

	@Override
	public List<QTinfoVO> qtlist() throws Exception {
		return sql.selectList(namespace + ".qtlist");
	}

	@Override
	public List<CartListVO> cartlist(String mb_id) throws Exception {
		return sql.selectList(namespace + ".cartlist", mb_id);
	}
	
	@Override
	public List<QTorderVO> qtorderlist() throws Exception {
		return sql.selectList(namespace + ".qtorderlist");
	}

	@Override
	public void addCart(CartVO cart) throws Exception {
		sql.insert(namespace + ".addCart", cart);
	}

	@Override
	public void deleteCart(CartVO cart) throws Exception {
		sql.delete(namespace + ".deleteCart", cart);
	}

	@Override
	public void addOrder(QTorderVO order) throws Exception {
		sql.insert(namespace + ".addOrder", order);
	}
	
}
