package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet1 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw=resp.getWriter();
		pw.print("<h1>Welcome to servlet1</h1>");
		
		ServletContext c1=req.getServletContext();
		String Driver =c1.getInitParameter("Driver");
		pw.print("<h2>"+Driver+"</h2>");
		
		Enumeration en=c1.getInitParameterNames();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		
		ServletConfig c2=getServletConfig();
		String path=c2.getInitParameter("path");
		pw.print("<h2>"+path+"</h2>");
	}
}
