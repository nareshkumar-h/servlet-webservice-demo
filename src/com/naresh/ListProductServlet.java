package com.naresh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListProductServlet
 */
@WebServlet("/ListProductServlet")
public class ListProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("List Product Servlet");
		// { "product_name": "Mac", "price": 1000 };
		String content = "[{\"product_name\":"+"\"Mac\",\"price\":1000},"
				+ "{\"product_name\":\"Lenova\",\"price\":500}]";
		PrintWriter out =response.getWriter();
		out.write(content);
		out.flush();
	}

}
