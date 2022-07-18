package controller.usercontroller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDao;
import model.User;

@WebServlet("/user_login")
public class UserLoginController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		
		User u=new User();
		u.setEmail(email);
		u.setPassword(password);
		
		UserDao dao=new UserDao();
		boolean b=dao.loginCheck(u);
		
		if(b){
			String uname = dao.isExist(u);
			HttpSession session=req.getSession();
			session.setAttribute("uname", uname);
			req.getRequestDispatcher("index.jsp").forward(req, resp);
		}else {
			req.setAttribute("err", "Invalid Username Or Password!!");
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}
	}
}