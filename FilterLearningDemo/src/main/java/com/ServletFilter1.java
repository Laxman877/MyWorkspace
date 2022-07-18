package com;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter("/ser1")
public class ServletFilter1 extends HttpFilter{
	@Override
	protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		ServletContext cx=request.getServletContext();
		String value=cx.getInitParameter("underMaintainance");
		if(value.equals("yes")) {
			request.getRequestDispatcher("maintainance.jsp").forward(request, response);
		}
		System.out.println("Request on filter");
		chain.doFilter(request, response);
		System.out.println("Response from servlet");
	}
}
