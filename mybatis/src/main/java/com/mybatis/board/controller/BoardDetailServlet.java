package com.mybatis.board.controller;

import java.io.IOException;

import com.mybatis.board.service.BoardService;
import com.mybatis.board.service.BoardServiceImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/detail.bo")
public class BoardDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int boardNo = Integer.parseInt(request.getParameter("boardNo"));	
		BoardService boardService = new BoardServiceImpl();
		
		int result = boardService.increaseCount(boardNo);
		
		if(result >0) {
			request.setAttribute("board",boardNo);
			request.getRequestDispatcher("WEB-INF/views/board/boardDetail.jsp");	
		}
		
	}

}
