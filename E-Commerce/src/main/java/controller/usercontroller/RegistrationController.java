package controller.usercontroller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import model.User;

@WebServlet("/user_reg")
public class RegistrationController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String cname=req.getParameter("cname");
		String email=req.getParameter("email");
		String mobile=req.getParameter("mobile");
		String password=req.getParameter("password");

		User u=new User();
		u.setCname(cname);
		u.setEmail(email);
		u.setMobile(mobile);
		u.setPassword(password);

		UserDao dao=new UserDao();
		String user=dao.isExist(u);
		if(user!=null) {
			req.setAttribute("warn", "Email or Mobile already exist!!");
			req.getRequestDispatcher("registration.jsp").forward(req, resp);
		}else {
			int i=dao.registerUser(u);
			if(i>0) {
				req.setAttribute("msg", "Register Successfully!!");
				req.getRequestDispatcher("registration.jsp").forward(req, resp);
			}
		}
	}
}
