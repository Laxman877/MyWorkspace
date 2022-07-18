package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Connection {
	public static void main(String[] args) {
		try {
			//for load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver loaded");
			//for connection with mysql
			String url="jdbc:mysql://localhost:3306/laxman";
			String uname="root";
			String pass="";
			Connection cn =DriverManager.getConnection(url,uname,pass);
			System.out.println("connection established");
			//create statement
			Statement st=cn.createStatement();
			//execute query
			ResultSet rs= st.executeQuery("select * from emp");
			//process the result set
			while(rs.next()) {
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String email=rs.getString(3);
				String dept=rs.getString(4);
				double sal=rs.getDouble(5);
				
				System.out.println(id+" "+name+" "+email+" "+dept+" "+sal);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
}
