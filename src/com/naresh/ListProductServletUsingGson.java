package com.naresh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

/**
 * Servlet implementation class ListProductServletUsingGson
 */
@WebServlet("/ListProductServletUsingGson")
public class ListProductServletUsingGson extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("product_name", "MAC");
		jsonObject.addProperty("price", 1000);
		
		JsonObject jsonObject2 = new JsonObject();
		jsonObject2.addProperty("product_name", "Lenova");
		jsonObject2.addProperty("price", 500);
		
		JsonArray jsonArray = new JsonArray();
		jsonArray.add(jsonObject);
		jsonArray.add(jsonObject2);
		
		PrintWriter out = response.getWriter();
		out.write(jsonArray.toString());
		out.flush();
	}


}
