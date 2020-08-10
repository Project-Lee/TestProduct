package com.jy.login.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jy.login.db.LoginDB;
import com.jy.login.db.LoginVO;


@WebServlet("/LoginMember")
public class LoginMember extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public LoginMember() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ist<LoginVO> selectMember
		
		List<LoginVO> list = LoginDB.selectMember();
		
		request.setAttribute("list", list);
		
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/login/loginMember.jsp");
		
		rd.forward(request, response);
		
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
