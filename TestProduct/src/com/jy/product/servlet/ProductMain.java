package com.jy.product.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;
import com.jy.product.db.ProductDB;
import com.jy.product.db.ProductVO;


/*
 *		제일 Main 페이지 ProductMain 서블릿은 Product.jsp로 값을보내어 
 *		product.jsp에서 값을 값을 뿌려준후 다시 그 화면을 여기 서블릿으로 가져옴 
 */

@WebServlet("/ProductMain")
public class ProductMain extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ProductMain() {
        super();
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<ProductVO> list = ProductDB.selectProduct();
			
		request.setAttribute("list", list);
		
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/product/product.jsp");		
		rd.forward(request, response);
		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
