package com.kioni.persistence;

import java.util.List;

import javax.inject.Inject;//@Inject

import org.apache.ibatis.session.SqlSession;//SqlSession
import org.springframework.stereotype.Repository;//@Repository

import com.kioni.domain.BoardVO;
import com.kioni.domain.Criteria;

@Repository
public class BoardDaoImpl implements BoardDAO {
	
	@Inject
	private SqlSession session;
	
	private static String namespace = "com.kioni.mapper.BoardMapper";

	@Override
	public void create(BoardVO vo) throws Exception {
		session.insert(namespace+".create", vo);
	}

	@Override
	public BoardVO read(Integer bno) throws Exception {
		return session.selectOne(namespace+".read", bno);
	}

	@Override
	public void update(BoardVO vo) throws Exception {
		session.update(namespace+".update", vo);
	}
	
	@Override
    public void updateViewCnt(Integer bno) throws Exception {
      session.update(namespace + ".updateViewCnt", bno);
    }

	@Override
	public void delete(Integer bno) throws Exception {
		session.delete(namespace+".delete", bno);
	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		return session.selectList(namespace+".listAll");
	}
	
	@Override
	public List<BoardVO> listPage(int page) throws Exception {
		if(page <= 0) page = 1;
		page = (page-1)*10;
		return session.selectList(namespace + ".listPage", page);
	}
	
	@Override
	public List<BoardVO> listCriteria(Criteria cri) throws Exception {
		return session.selectList(namespace + ".listCriteria", cri);
	}
	
	@Override
	public int countPaging(Criteria cri) throws Exception {
		return session.selectOne(namespace + ".countPaging", cri);
	}

}
