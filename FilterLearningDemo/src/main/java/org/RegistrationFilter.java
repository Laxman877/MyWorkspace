package org;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter("/reg")
public class RegistrationFilter extends HttpFilter{
	@Override
	protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		ServletContext cx=request.getServletContext();
		String value=cx.getInitParameter("underMaintainance");
		if(value.equals("yes")) {
			request.getRequestDispatcher("maintainance.jsp").forward(request, response);
		}
		String uname=request.getParameter("uname");
		String email=request.getParameter("email");
		String pass=request.getParameter("pass");
		String cpass=request.getParameter("cpass");
		String adr=request.getParameter("adr");
		RequestDispatcher rd=request.getRequestDispatcher("registration.jsp");
		if(uname=="" || uname==null) {
			request.setAttribute("unameE", "Uname Cannot be blank");
			rd.forward(request, response);
		}
		if(email=="" || email==null) {
			request.setAttribute("emailE", "Email Cannot be blank");
			rd.forward(request, response);
		}else if(!EmailValidation.emailCheck(email)) {
			request.setAttribute("emailE", "Invalid email format");
			rd.forward(request, response);
		}
		if(pass=="" || pass==null) {
			request.setAttribute("passE", "Pass Cannot be blank");
			rd.forward(request, response);
		}else if(!PassValidation.passCheck(pass)) {
			request.setAttribute("passE", "Invalid Pass format(Please enter atleast one small , ine capital ,one digit and on special character)!");
			rd.forward(request, response);
		}
		
		if(!cpass.equals(pass)) {
			request.setAttribute("cpassE", "Cpass must be same as Pass");
			rd.forward(request, response);
		}
		if(adr=="" || adr==null) {
			request.setAttribute("adrE", "Address Cannot be blank");
			rd.forward(request, response);
		}
		chain.doFilter(request, response);
	}
}
