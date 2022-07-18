package controller.productcontroller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductDao;
import model.Product;

@WebServlet("/addproduct")
public class AddProductController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String pid=req.getParameter("pid");
		String pname=req.getParameter("pname");
		double price=Double.parseDouble(req.getParameter("price"));
		
		Product p=new Product();
		p.setPname(pname);
		p.setPrice(price);
		
		dao.ProductDao pdao=new dao.ProductDao();
		if(!pid.equals("")) {
			p.setPid(Integer.parseInt(pid));
			int i=pdao.updateProduct(p);
			if(i>0) {
				ArrayList<Product> al=pdao.getAllProduct();
				req.setAttribute("data", al);
				req.getRequestDispatcher("product.jsp").forward(req, resp);
			}
		}else {
		boolean b =pdao.isExist(p);
		if(b) {
			ArrayList<Product> al=pdao.getAllProduct();
			req.setAttribute("data", al);
			req.setAttribute("err", "Product already Exixt!!");
			req.getRequestDispatcher("product.jsp").forward(req, resp);
		}else {
		int i=pdao.addproduct(p);
		if(i>0) {
			ArrayList<Product> al=pdao.getAllProduct();
			req.setAttribute("data", al);
			req.setAttribute("msg", "Product Added Successfully!!!");
			req.getRequestDispatcher("product.jsp").forward(req, resp);
		}
	}
	}
	}
}

