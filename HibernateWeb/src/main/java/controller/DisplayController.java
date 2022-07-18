package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Empdao;
import model.Employee;

@WebServlet("/display")
public class DisplayController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Empdao dao=new Empdao();
		ArrayList<Employee> emp = dao.getAllEmp();
		req.setAttribute("data", emp);
		req.getRequestDispatcher("display.jsp").forward(req, resp);
	}
}
