package com.az.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.az.model.Product;
import com.az.service.ProductService;

@WebServlet(name="ProductController",urlPatterns="/product-controller",loadOnStartup=1)

public class ProductController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest  request, HttpServletResponse response) throws IOException {
		
		String action=request.getParameter("action");
		
		if (action!=null && action.equals("addBasket")) {
			List<Product> basketList=null;
			String productId=request.getParameter("productId");
			String lang=(String) request.getSession().getAttribute("lang");
			ProductService productService=new ProductService();
			Product product=productService.findProductById(productId,lang);
			
			HttpSession session=request.getSession();
			
			if (session.getAttribute("basketList")!=null) {
				 basketList=(List<Product>) session.getAttribute("basketList");
			}
			else {

				basketList=new ArrayList<Product>();

			}			
			 basketList.add(product);
			 session.setAttribute("basketList", basketList);
					
		}
		response.sendRedirect(request.getContextPath()+"/products");
		
		
		
		
	
		
	}

}
