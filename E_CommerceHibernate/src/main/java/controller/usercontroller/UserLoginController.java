package controller.usercontroller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDao;
import model.Customer;

@WebServlet("/user_login")
public class UserLoginController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("email");
		String pass=req.getParameter("pass");
		
		Customer c=new Customer();
		c.setEmail(email);
		c.setPass(pass);
		
		UserDao dao=new UserDao();
		boolean b=dao.loginCheck(c);
		
		if(b){
			Customer cus = dao.isEmailExist(c);
			HttpSession session=req.getSession();
			session.setAttribute("uname", cus.getCname());
			req.getRequestDispatcher("index.jsp").forward(req, resp);
		}else {
			req.setAttribute("err", "Invalid Username Or Password!!");
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}
	}
}