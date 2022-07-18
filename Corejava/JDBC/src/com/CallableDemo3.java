package com;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CallableDemo3 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/java";
			String uname="root";
			String pass="";
			String sql="call Book()";
			Connection cn = DriverManager.getConnection(url,uname,pass);
			CallableStatement cst=cn.prepareCall(sql);
			ResultSet rs= cst.executeQuery();
			
			while(rs.next()) {
				System.out.println("id= "+rs.getInt(1)+" name= "+rs.getString(2)+" price= "+rs.getDouble(3)+" qty= "+rs.getInt(4));
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
