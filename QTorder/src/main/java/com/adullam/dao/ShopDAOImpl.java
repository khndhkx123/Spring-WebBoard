package com.adullam.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.adullam.domain.QTinfoVO;

@Repository
public class ShopDAOImpl implements ShopDAO{
	
	@Inject
	private SqlSession sql;
	
	private static String namespace = "com.adullam.mappers.ShopMapper";

	@Override
	public List<QTinfoVO> qtlist() throws Exception {
		return sql.selectList(namespace + ".qtlist");
	}
	

}
