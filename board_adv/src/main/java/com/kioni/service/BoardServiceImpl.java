package com.kioni.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.kioni.dao.BoardDAO;
import com.kioni.domain.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {
	@Inject
	private BoardDAO boardDAO;

	@Override
	public int test1() {
		return boardDAO.test1();
	}

	@Override
	public List<BoardVO> list() {
		return boardDAO.list();
	}

	@Override
	public BoardVO view(int no) {
		return boardDAO.view(no);
	}

	@Override
	public int write(BoardVO boardVO) {
		if(boardVO.getgNo() == 0) {
			return boardDAO.write(boardVO);
		}
		else {
			boardDAO.replyShape(boardVO);
			return boardDAO.replyWrite(boardVO);
		}
	}
}
