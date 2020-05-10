package com.kioni.dao;

import java.util.List;

import com.kioni.domain.BoardVO;

public interface BoardDAO {

	int test1();

	List<BoardVO> list();

	BoardVO view(int no);

	int write(BoardVO boardVO);

	void replyShape(BoardVO boardVO);

	int replyWrite(BoardVO boardVO);

}
