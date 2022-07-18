package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		
		if (uname.equals("admin") && pass.equals("admin")) {
			PrintWriter pw=response.getWriter();
			HttpSession session=request.getSession();
			session.setAttribute("uname", uname);
			
			ServletContext cx=request.getServletContext();
			int current=(Integer)cx.getAttribute("currentuser");
			int total=(Integer)cx.getAttribute("totaluser");
			
			pw.print("<h1>current users: "+current+"</h1>");
			pw.print("<h1>Total Users: "+total+"</h1>");
			
			pw.print("<a href='logout'>Logout</a>");
		}else {
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

}
