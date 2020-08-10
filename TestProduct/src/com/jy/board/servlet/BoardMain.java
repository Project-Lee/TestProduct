package com.jy.board.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jy.board.db.BoardDAO;
import com.jy.board.db.BoardVO;


@WebServlet("/BoardMain")
public class BoardMain extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public BoardMain() {
        super();
    
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		List<BoardVO> list = new ArrayList();
		
		list = BoardDAO.selBoard();
		
		request.setAttribute("list", list);
		
				
		String jsp = "WEB-INF/board/boardMain.jsp";
		request.getRequestDispatcher(jsp).forward(request, response);
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
