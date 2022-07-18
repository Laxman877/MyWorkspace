package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmpDao;
import model.Employee;
import model.EmployeeDetail;

@WebServlet("/reg")
public class AddEmp extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fname=req.getParameter("fname");
		String lname=req.getParameter("lname");
		String email=req.getParameter("email");
		String pass=req.getParameter("pass");
		EmployeeDetail empd=new EmployeeDetail();
		empd.setFname(fname);
		empd.setLname(lname);
		
		Employee emp=new Employee();
		emp.setEmail(email);
		emp.setPass(pass);
		emp.setEmployeeDetail(empd);
		
		EmpDao dao=new EmpDao();
		dao.addEmp(emp);
	}
}
