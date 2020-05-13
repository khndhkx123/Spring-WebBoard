package com.kioni.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.kioni.dao.BoardDAO;
import com.kioni.domain.BoardVO;
import com.kioni.domain.CommentsVO;
import com.kioni.domain.PageDTO;

@Service
public class BoardServiceImpl implements BoardService {
	@Inject
	private BoardDAO boardDAO;

	@Override
	public int test1() {
		return boardDAO.test1();
	}

	@Override
	public List<BoardVO> list(PageDTO page) {
		page.setStartRow((page.getPageNum()-1) * page.getPageSize() + 1);
		page.setEndRow(page.getStartRow() + page.getPageSize() - 1);
		return boardDAO.list(page);
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
	
	@Override
	public int count() {
		return boardDAO.count();
	}

	@Override
	public int writeComments(CommentsVO commentsVO) {
		return boardDAO.writeComments(commentsVO);
	}

	@Override
	public List<CommentsVO> listComments(int bNo) {
		return boardDAO.listComments(bNo);
	}
		
}
