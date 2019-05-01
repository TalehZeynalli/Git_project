package com.az.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.az.model.User;
import com.az.service.UserService;

public class UserController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("OK");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String name = req.getParameter("name");
		String surname = req.getParameter("surname");
		int age = 0;
		age = Integer.parseInt(req.getParameter("age"));

		User user = new User(username, password, name, surname, age);
		UserService userService = new UserService();
		user = userService.registerUser(user);
		resp.sendRedirect(req.getContextPath() + "/registration");

	}
}
