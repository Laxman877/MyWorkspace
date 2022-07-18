package filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter("/addproduct")
public class ProductFilter extends HttpFilter{
	@Override
	protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String pid=request.getParameter("pid");
		String pname=request.getParameter("pname");
		double price=Double.parseDouble(request.getParameter("price"));
		RequestDispatcher rd=request.getRequestDispatcher("product.jsp");
		if(pname=="" || pname==null) {
			request.setAttribute("pnameE", "Product name cannot be blank");
			rd.forward(request, response);
		}
		if(price<=0) {
			request.setAttribute("priceE", "Price cannot be below 0");
			rd.forward(request, response);
		}
	}
}
