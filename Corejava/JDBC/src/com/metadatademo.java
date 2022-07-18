package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.DatabaseMetaData;
import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class metadatademo {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/java";
			String uname="root";
			String pass="";
			Connection cn = DriverManager.getConnection(url,uname,pass);
			
			DatabaseMetaData db=(DatabaseMetaData) cn.getMetaData();
//			System.out.println(db.getDatabaseMajorVersion());
//			System.out.println(db.getDatabaseProductName());
			
			Statement st= cn.createStatement();
			ResultSet rs= st.executeQuery("select * from library");
			
			ResultSetMetaData rmt=(ResultSetMetaData) rs.getMetaData();
			System.out.println(rmt.getColumnCount());
			System.out.println(rmt.getColumnName(2));
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
}
