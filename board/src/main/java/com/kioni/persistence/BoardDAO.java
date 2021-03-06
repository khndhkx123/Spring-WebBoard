package com.kioni.persistence;

import java.util.List;

import com.kioni.domain.BoardVO;
import com.kioni.domain.Criteria;
import com.kioni.domain.SearchCriteria;

public interface BoardDAO {
	public void create(BoardVO vo) throws Exception;
	public BoardVO read(Integer bno) throws Exception;
	public void update(BoardVO vo) throws Exception;
	void updateViewCnt(Integer bno) throws Exception;
	public void delete(Integer bno) throws Exception;
	public List<BoardVO> listPage(int page) throws Exception;
	public List<BoardVO> listCriteria(Criteria page) throws Exception;
	public int countPaging(Criteria cri) throws Exception;
	public List<BoardVO> listSearch(SearchCriteria cri)throws Exception;
	public int listSearchCount(SearchCriteria cri)throws Exception;
}
