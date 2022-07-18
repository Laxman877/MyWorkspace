package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Empdao;
import model.Employee;

@WebServlet("/update")
public class UpdateController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action =req.getParameter("action");
		int uid=Integer.parseInt(req.getParameter("uid"));
		Empdao dao=new Empdao();
		if(action.equals("delete")) {
			dao.deleteEmp(uid);
			req.getRequestDispatcher("display").forward(req, resp);
		}
		else if(action.equals("update")) {
			Employee emp= dao.getById(uid);
			req.setAttribute("data", emp);
			req.getRequestDispatcher("index.jsp").forward(req, resp);
		}
	}
}
