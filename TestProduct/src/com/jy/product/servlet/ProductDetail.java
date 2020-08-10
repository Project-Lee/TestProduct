package com.jy.product.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jy.product.db.ProductDB;
import com.jy.product.db.ProductVO;


@WebServlet("/ProductDetail")
public class ProductDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ProductDetail() {
        super();
   
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String i_num = request.getParameter("i_num");
		int intI_num = Integer.parseInt(i_num);
		
		List<ProductVO> list = ProductDB.selectProduct(intI_num);
		
		request.setAttribute("list",list);
		
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/product/productDetail.jsp");
		
		rd.forward(request, response);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
