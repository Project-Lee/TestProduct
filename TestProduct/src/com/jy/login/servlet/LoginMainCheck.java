package com.jy.login.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jy.login.db.LoginDB;


@WebServlet("/LoginMainCheck")
public class LoginMainCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	static int num = 0;  // 몇회 실패했는지 알수있게 하는 num 메소드
	
    public LoginMainCheck() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String i_id = request.getParameter("i_id");
		String i_ps = request.getParameter("i_ps");	
		String ok = "yes";
		

		LoginDB.loginMain(i_id, i_ps);
		
		if(ok.equals(LoginDB.loginMain(i_id, i_ps))) {
			RequestDispatcher rddd = request.getRequestDispatcher("WEB-INF/loginCheck/loginCheckTrue.jsp");  // rddd랑 rsss 서로 같게해서 테스트해보기 제일위에 null 선언하기 
			rddd.forward(request, response);
		} else {
			++num;
			request.setAttribute("num", num);
			if(num == 3) {
				num = 0;		
			}						
			                      
			RequestDispatcher rsss = request.getRequestDispatcher("/WEB-INF/loginCheck/loginCheckFalse.jsp");
			rsss.forward(request, response);
		}
		// doGet(request, response);
	}

}
