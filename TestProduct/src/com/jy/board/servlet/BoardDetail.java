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




@WebServlet("/BoardDetail")
public class BoardDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public BoardDetail() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		
		String strI_num = request.getParameter("i_num");
		int intI_num = Integer.parseInt(strI_num);
		
		BoardVO data = new BoardVO();
		
		data = BoardDAO.detailBoard(intI_num);
		
		request.setAttribute("data", data);				
		String jsp = "WEB-INF/board/boardDetail.jsp";
		request.getRequestDispatcher(jsp).forward(request, response);
		
		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
