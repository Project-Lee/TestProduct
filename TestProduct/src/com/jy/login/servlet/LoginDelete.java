package com.jy.login.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jy.login.db.LoginDB;
import com.jy.login.db.LoginVO;


@WebServlet("/LoginDelete")
public class LoginDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public LoginDelete() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String i_numId = request.getParameter("i_numId");
		int intI_numId = Integer.parseInt(i_numId);
		
		LoginVO vo = new LoginVO();
		vo.setI_numId(intI_numId);
		
		LoginDB.deleteMember(vo);
		
		response.sendRedirect("LoginMember");
		
		
		
		
		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
