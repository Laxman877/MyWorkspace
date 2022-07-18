package com;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String bname=req.getParameter("bname");
		String pass=req.getParameter("pass");
		
		if(bname.equals("admin") && pass.equals("pass")) {
			HttpSession session=req.getSession();
			session.setAttribute("bname", bname);
			req.getRequestDispatcher("product.jsp").forward(req, resp);
		}else {
			req.setAttribute("err", "Invalid username or password");
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}
	}
}
