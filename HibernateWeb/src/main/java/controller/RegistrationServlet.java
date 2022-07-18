package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Empdao;
import model.Employee;

@WebServlet("/reg")
public class RegistrationServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int uid=0;
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String dept=req.getParameter("dept");
		if(!id.equals("")) {
			uid=Integer.parseInt(id);
		}
		Employee emp=new Employee();
		emp.setId(uid);
		emp.setName(name);
		emp.setEmail(email);
		emp.setDept(dept);
		
		Empdao dao=new Empdao();
		dao.addemp(emp);
	}
}
