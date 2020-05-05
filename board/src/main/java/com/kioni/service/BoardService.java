package com.kioni.service;

import java.util.List;

import com.kioni.domain.*;

public interface BoardService {
	public void regist(BoardVO board) throws Exception;
	public BoardVO read(Integer bno) throws Exception;
	public void modify(BoardVO board) throws Exception;
	public void remove(Integer bno) throws Exception;
	public List<BoardVO> listCriteria(Criteria cri) throws Exception; // For calculate Paging
	public int listCountCriteria(Criteria cri) throws Exception; // for DB data counting
}
