package com.kioni.service;

import java.util.List;

import com.kioni.domain.BoardVO;
import com.kioni.domain.PageDTO;

public interface BoardService {

	int test1();

	List<BoardVO> list(PageDTO page);

	BoardVO view(int no);

	int write(BoardVO boardVO);

	int count();

}