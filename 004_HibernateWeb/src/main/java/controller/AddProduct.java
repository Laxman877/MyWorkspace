package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductDao;

@WebServlet("/addproduct")
public class AddProduct extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ProductDao dao=new ProductDao();
		req.setAttribute("products", dao.viewAllProduct());
		req.setAttribute("data", dao.viewAllCat());
		req.getRequestDispatcher("addproduct.jsp").forward(req, resp);
	}
}
