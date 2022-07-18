package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StdDao;
import model.Student;

@WebServlet("/update")
public class UpdateController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action =req.getParameter("action");
		int uid=Integer.parseInt(req.getParameter("uid"));
		StdDao dao=new StdDao();
		if(action.equals("delete")) {
			dao.deleteStd(uid);
			req.getRequestDispatcher("display").forward(req, resp);
		}else if(action.equals("update")) {
			Student std= dao.getById(uid);
			req.setAttribute("data", std);
			req.getRequestDispatcher("index.jsp").forward(req, resp);
		}
	}
}
