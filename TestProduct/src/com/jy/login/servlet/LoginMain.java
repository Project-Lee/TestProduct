package com.jy.login.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jy.login.db.LoginDB;


@WebServlet("/LoginMain")
public class LoginMain extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginMain() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher rs = request.getRequestDispatcher("WEB-INF/login/loginMain.jsp");
		rs.forward(request, response);
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
