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
				PrintWriter pw= resp.getWriter();
				pw.write("login successfully");
				RequestDispatcher rd=req.getRequestDispatcher("Success.html");
				rd.forward(req, resp);
			}else {
				RequestDispatcher rd=req.getRequestDispatcher("error.html");
				rd.forward(req, resp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
