package controller;

import java.io.IOException;
import java.net.http.HttpConnectTimeoutException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import model.User;

@WebServlet("/login")
public class UserLoginController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uname=req.getParameter("uname");
		String pass =req.getParameter("pass");
		
		User u = new User();
		u.setUname(uname);
		u.setPass(pass);
		
		UserDao dao=new UserDao();
		String username=dao.loginCheck(u);
//		System.out.println(username);
		if(username==null) {
			req.setAttribute("err", "Invalid Credintial!!!");
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}else {
			req.setAttribute("username", username);
			req.getRequestDispatcher("home.jsp").forward(req, resp);
		}
	}
}
