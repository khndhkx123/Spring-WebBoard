package com.kioni.service;

import java.util.List;

import com.kioni.domain.BoardVO;

public interface BoardService {

	int test1();

	List<BoardVO> list();

	BoardVO view(int no);

	int write(BoardVO boardVO);

}
