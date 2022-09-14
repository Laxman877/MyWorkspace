package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
@WebServlet("/pay")
public class MyPayment extends HttpServlet 
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int amount=Integer.parseInt(req.getParameter("amount"));
		
		try {
			RazorpayClient razorpay=new RazorpayClient("rzp_test_tlQG57afw3aL5q", "4vOm1EhdvVLexp7gv9Rd5RCt");
			  JSONObject orderRequest = new JSONObject();
			  orderRequest.put("amount", amount*100); // amount in the smallest currency unit
			  orderRequest.put("currency", "INR");
			  orderRequest.put("receipt", "order_rcptid_11");

			  Order order = razorpay.orders.create(orderRequest);
			  
			  PrintWriter pw=resp.getWriter();
			 pw.append(order.toString());
			} catch (RazorpayException e) {
			  // Handle Exception
			  System.out.println(e.getMessage());
			}
	}
}
