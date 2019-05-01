package com.az.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.az.model.User;
import com.az.service.UserService;

@WebServlet(name = "UserContreller", urlPatterns = "/user-controller")

public class UserController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");


		User user = new User();
		UserService userService = new UserService();
		user = userService.loginUser(username, password);
		if (user != null && user.getUsername().equals(username) && user.getPassword().equals(password)) {

			// Cookie [] cookies=request.getCookies();
			// for (Cookie cookie : cookies) {
			// System.out.println(cookie.getName()+ " = "+cookie.getValue());
			// }
			// response.addCookie(new Cookie("uname", username));
			// response.addCookie(new Cookie("pword", password));
			HttpSession session = request.getSession();
			session.setAttribute("uname", username);
			session.setAttribute("pword", password);
			response.sendRedirect(request.getContextPath() + "/products");
			response.setStatus(200);

		} else {
			response.sendRedirect(request.getContextPath() + "/login?error=ue");
		}
	}
 @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String name = req.getParameter("name");
		String surname = req.getParameter("surname");
		int age=0;
		age=Integer.parseInt(req.getParameter("age"));
	
       
		
		User user = new User(username, password, name, surname, age);
		UserService userService = new UserService();
		user = userService.registerUser(user);
		resp.sendRedirect(req.getContextPath() + "/products");
	
}
}
