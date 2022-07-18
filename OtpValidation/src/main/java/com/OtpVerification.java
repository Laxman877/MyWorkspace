package com;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/otpvalidation")
public class OtpVerification extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String otp=request.getParameter("otp");
		
		ServletContext cx=request.getServletContext();
		String myOtp=(String)cx.getAttribute("myOtp");
		if(otp.equals(myOtp)) {
			request.getRequestDispatcher("home.jsp").forward(request, response);
		}else {
			request.setAttribute("err", "Invalid otp");
			request.getRequestDispatcher("otpVerification.jsp").forward(request, response);
		}
	}

}
