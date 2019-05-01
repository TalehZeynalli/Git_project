package com.az.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter(urlPatterns = "/")

public class RootFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;

		HttpSession session = req.getSession();

		String username = (String) session.getAttribute("uname");
		String password = (String) session.getAttribute("pword");

		if (username == null || password == null) {
			res.sendRedirect(req.getContextPath() + "/login");
			return;
		} else {
			res.sendRedirect(req.getContextPath() + "/products");
			return;
		}

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}
