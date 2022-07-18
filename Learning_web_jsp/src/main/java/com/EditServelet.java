package com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.DbConnection;

@WebServlet("/edit")
public class EditServelet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uid=req.getParameter("uid");
		int id=Integer.parseInt(uid);
		String uname=req.getParameter("uname");
		String email=req.getParameter("email");
		String pass=req.getParameter("pass");
		String adr=req.getParameter("adr");
		
		Connection cn=DbConnection.getconn();
		try {
			PreparedStatement ps=cn.prepareStatement("update student set uname=?,email=?,pass=?,adr=? where id=?");
			ps.setInt(5, id);
			ps.setString(1, uname);
			ps.setString(2, email);
			ps.setString(3, pass);
			ps.setString(4, adr);
			
			int i=ps.executeUpdate();
			if(i>0) {
				RequestDispatcher rd= req.getRequestDispatcher("display");
				rd.forward(req, resp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
