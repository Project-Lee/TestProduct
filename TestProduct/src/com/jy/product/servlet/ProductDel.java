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

@WebServlet("/ProductDel")
public class ProductDel extends HttpServlet {
	private static final long serialVersionUID = 1L;
    

    public ProductDel() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String i_num = request.getParameter("i_num");
		int intI_num = Integer.parseInt(i_num);
		
		ProductDB.deleteProduct(intI_num);
		response.sendRedirect("ProductMain");
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
