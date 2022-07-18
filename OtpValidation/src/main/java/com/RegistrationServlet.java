package com;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class RegistrationServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("uname");
		String email=request.getParameter("email");
		String pass=request.getParameter("pass");
		
		Random rad=new Random();
		int otp=rad.nextInt(9999);
		System.out.println("your otp is: "+otp);
		
		ServletContext cx=request.getServletContext();
		cx.setAttribute("myOtp", otp+"");
		request.getRequestDispatcher("otpVerification.jsp").forward(request, response);
	}
}
