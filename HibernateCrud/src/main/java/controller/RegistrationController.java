package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StdDao;
import model.Student;

@WebServlet("/reg")
public class RegistrationController extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int uid=0;
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String mobile=req.getParameter("mobile");
		if(!id.equals("")) {
			uid=Integer.parseInt(id);
		}
		Student s=new Student();
		s.setId(uid);
		s.setName(name);
		s.setEmail(email);
		s.setMobile(mobile);
		
		StdDao dao=new StdDao();
		dao.addStd(s);
	}
}
