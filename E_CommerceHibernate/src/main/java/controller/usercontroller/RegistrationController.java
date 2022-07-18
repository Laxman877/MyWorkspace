package controller.usercontroller;



import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import model.Customer;


@WebServlet("/user_reg")
public class RegistrationController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String cname=req.getParameter("cname");
		String email=req.getParameter("email");
		String mobile=req.getParameter("mobile");
		String pass=req.getParameter("pass");

		Customer c=new Customer();
		c.setCname(cname);
		c.setEmail(email);
		c.setMobile(mobile);
		c.setPass(pass);

		UserDao dao=new UserDao();
		Customer email1=dao.isEmailExist(c);
		Customer mobile1 = dao.isMobileExist(c);
		if(email1!=null) {
			req.setAttribute("warn", "Email already exist!!");
			req.getRequestDispatcher("registration.jsp").forward(req, resp);
		}
		else if(mobile1!=null) {
			req.setAttribute("warn", "Mobile already exist!!");
			req.getRequestDispatcher("registration.jsp").forward(req, resp);
		}
		else {
			    dao.registerUser(c);
				req.setAttribute("msg", "Register Successfully!!");
				req.getRequestDispatcher("registration.jsp").forward(req, resp);
		}
	}
}