package com.az.controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





@WebServlet(value="/person")
public class testController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1448561396172638415L;
	 
   @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
   	   
//	   ObjectMapper objectMapper= new ObjectMapper();
	   PrintWriter pw = resp.getWriter();
	   BufferedReader br = new BufferedReader(new FileReader("E:\\person.json"));
	   String json="";
	   while ((json=br.readLine()) != null) {
		 pw.write(json);
	}
	  
 	
	
}
}
