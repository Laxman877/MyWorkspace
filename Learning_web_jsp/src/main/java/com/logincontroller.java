package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.DbConnection;
@WebServlet("/login")
public class logincontroller extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email= req.getParameter("email");
		String pass= req.getParameter("pass");
		
		Connection cn=DbConnection.getconn();
		String qry="select * from student where email=? and pass=?";
		try {
			PreparedStatement ps=cn.prepareStatement(qry);
			ps.setString(1, email);
			ps.setString(2, pass);
			ResultSet rs= ps.executeQuery();
			if(rs.next()) {
				req.setAttribute("user", rs.getString(2));
				req.getRequestDispatcher("home.jsp").forward(req, resp);
			}else {
				req.setAttribute("err", "Invalid username or Password!");
				req.getRequestDispatcher("login.jsp").forward(req, resp);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
