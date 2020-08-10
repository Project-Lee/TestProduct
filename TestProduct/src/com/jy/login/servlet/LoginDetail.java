package com.jy.login.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jy.login.db.LoginDB;
import com.jy.login.db.LoginVO;


@WebServlet("/LoginDetail")
public class LoginDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public LoginDetail() {
        super();

    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		    	
		String i_numId = request.getParameter("i_numId");
		int intI_numId = Integer.parseInt(i_numId);
		
		LoginVO vo = new LoginVO();
		
		
		// 값이 혹시 안넘어왔다면 if문실행 후 -> numId값 이 찍혀나올것임 
		if(i_numId == null) {
			System.out.println("numId 값 : " + vo.getI_numId());
			response.sendRedirect("LoginMember");
		}
		
		vo.setI_numId(intI_numId);
		
		LoginVO data = LoginDB.detailMember(vo);
		request.setAttribute("data", data);
		
		// 테스트 ( vo는 그냥 detailMember(vo) 메소드 사용하기위해 만든것 )
		// 실제 메소드 실행후 값들은 data 객체변수에 내용들이 저장되어 있음 
		// System.out.println("1번" + vo.getI_name());
		// System.out.println("2번" + data.getI_name());
			
		String jsp = "WEB-INF/login/loginDetail.jsp";
		
//		RequestDispatcher rd = request.getRequestDispatcher(jsp);
//		rd.forward(request, response);
		
		request.getRequestDispatcher(jsp).forward(request, response);
		
	}

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
