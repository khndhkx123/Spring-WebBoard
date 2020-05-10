package com.kioni.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.kioni.domain.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO {
	
	@Inject
	private SqlSession sqlSession;
	private static final String namespace = "com.kioni.mappers.BoardMapper";
	
	@Override
	public int test1() {
		return sqlSession.insert(namespace+".test1");
	}

	@Override
	public List<BoardVO> list() {
		return sqlSession.selectList(namespace+".list");
	}

	@Override
	public BoardVO view(int no) {
		return sqlSession.selectOne(namespace+".view", no);
	}

	@Override
	public int write(BoardVO boardVO) {
		return sqlSession.insert(namespace+".write", boardVO);
	}

	@Override
	public void replyShape(BoardVO boardVO) {
		sqlSession.update(namespace+".replyShape", boardVO);
	}

	@Override
	public int replyWrite(BoardVO boardVO) {
		return sqlSession.insert(namespace+".replyWrite", boardVO);
	}
}
