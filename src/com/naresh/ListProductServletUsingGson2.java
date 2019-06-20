package com.naresh;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

/**
 * Servlet implementation class ListProductServletUsingGson
 */
@WebServlet("/ListProductServletUsingGson2")
public class ListProductServletUsingGson2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Product product1 = new Product("MAC", 1000);
		
		ArrayList<Product> productList = new ArrayList<>();
		productList.add(product1);
		
		Gson gson = new Gson();
		String json = gson.toJson(productList);
		
		PrintWriter out = response.getWriter();
		out.write(json.toString());
		out.flush();
	}


}
