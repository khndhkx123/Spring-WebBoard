package com.kioni.dao;

import java.util.List;

import com.kioni.domain.BoardVO;
import com.kioni.domain.CommentsVO;
import com.kioni.domain.PageDTO;

public interface BoardDAO {

	int test1();

	List<BoardVO> list(PageDTO page);

	BoardVO view(int no);

	int write(BoardVO boardVO);

	void replyShape(BoardVO boardVO);

	int replyWrite(BoardVO boardVO);

	int count();

	int writeComments(CommentsVO commentsVO);

	List<CommentsVO> listComments(int bNo);

}
