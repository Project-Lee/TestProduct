package com.jy.product.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jy.product.db.DAO;
import com.jy.product.db.ProductDB;



@WebServlet("/ProductInsert")
public class ProductInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ProductInsert() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/product/productInsert.jsp");
		rd.forward(request, response);

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
