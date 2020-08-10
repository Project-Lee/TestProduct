package com.jy.login.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jy.login.db.LoginDB;


@WebServlet("/LoginSignInsert")
public class LoginSignInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public LoginSignInsert() {
        super();

    }

    
    
    // 현재 post방식으로 받았음 그러니 post 메소드로 내용 다 옮기기 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
//		String i_id = request.getParameter("i_id");
//		String i_ps = request.getParameter("i_ps");
//		String i_name = request.getParameter("i_name");
//		String i_email = request.getParameter("i_email");
//		String i_gender = request.getParameter("i_gender");
//			
//						
//		if("남자".equals(i_gender)) {
//			i_gender = "남자";
//		} else {
//			i_gender = "여자";
//		}
//		
//		LoginDB.insertLogin(i_id, i_ps, i_name, i_email, i_gender);
//				
//		
//		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/login/SignUpAlert.jsp");
//		rd.forward(request, response);	
			
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String i_id = request.getParameter("i_id");
		String i_ps = request.getParameter("i_ps");
		String i_name = request.getParameter("i_name");
		String i_email = request.getParameter("i_email");
		String i_gender = request.getParameter("i_gender");
			
						
		if("남자".equals(i_gender)) {
			i_gender = "남자";
		} else {
			i_gender = "여자";
		}
		
		LoginDB.insertLogin(i_id, i_ps, i_name, i_email, i_gender);
				
		
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/login/SignUpAlert.jsp");
		rd.forward(request, response);	
		doGet(request, response);
	}

}
