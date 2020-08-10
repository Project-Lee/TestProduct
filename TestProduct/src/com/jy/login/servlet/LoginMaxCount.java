package com.jy.login.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginMaxCount")
public class LoginMaxCount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public LoginMaxCount() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String jsp = "WEB-INF/loginCheck/loginMaxCount.jsp";
		request.getRequestDispatcher(jsp).forward(request, response);
		
	}


	
	
	
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
