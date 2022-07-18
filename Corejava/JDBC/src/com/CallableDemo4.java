package com;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Result;

public class CallableDemo4 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/java";
			String uname="root";
			String pass="";
			String sql="{call mulview}";
			Connection cn = DriverManager.getConnection(url,uname,pass);
			CallableStatement cst=cn.prepareCall(sql);
			
			boolean hasrs=cst.execute();
			System.out.println();
			
			if(hasrs) {
				try(ResultSet rs=cst.getResultSet()){
					while(rs.next()) {
						System.out.println("name= "+rs.getString(1));
					}
				}
			}
			if(cst.getMoreResults()) {
				try(ResultSet rs= cst.getResultSet()){
					if(rs.next()) {
						System.out.println("total price is "+rs.getDouble(1));
					}
				}
			}
			if(cst.getMoreResults()) {
				try(ResultSet rs= cst.getResultSet()){
					if(rs.next()) {
						System.out.println("max price "+rs.getDouble(1));
						System.out.println("min price "+rs.getDouble(2));
					}
				}
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
