package com.kioni.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.kioni.dao.BoardDAO;

@Service
public class BoardServiceImpl implements BoardService{
	@Inject
	private BoardDAO boardDAO;
	
	@Override
	public int test1() {
		return boardDAO.test1();
	}
}
