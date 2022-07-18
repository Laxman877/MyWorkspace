package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductDao;
import model.Category;
import model.Product;

@WebServlet("/addnewproduct")
public class AddProductForm extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Integer cid=Integer.parseInt(req.getParameter("cid"));
		String pname=req.getParameter("pname");
		double price=Integer.parseInt(req.getParameter("price"));
		Category ct=new Category();
		ct.setcId(cid);
		
		Product p=new Product();
		p.setpName(pname);
		p.setPrice(price);
		p.setCategory(ct);
		
		ProductDao dao=new ProductDao();
		dao.addProduct(p);
		req.getRequestDispatcher("addproduct").forward(req, resp);
	}
}
