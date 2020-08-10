package com.jy.product.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jy.product.db.ProductDB;



@WebServlet("/ProductInsertExc")
public class ProductInsertExc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ProductInsertExc() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String i_name = request.getParameter("i_name");
		String i_price = request.getParameter("i_price");
		int intI_price = Integer.parseInt(i_price);		
				
		ProductDB.insertProduct(i_name, intI_price);
		
		response.sendRedirect("ProductMain");		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
