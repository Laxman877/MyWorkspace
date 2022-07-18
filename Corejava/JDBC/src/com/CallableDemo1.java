package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

import com.mysql.cj.jdbc.CallableStatement;

public class CallableDemo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id");
		int bid=sc.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/java";
			String uname="root";
			String pass="";
			Connection cn=DriverManager.getConnection(url,uname,pass);
			
			CallableStatement ps=(CallableStatement) cn.prepareCall("{?=call getBook(?)}");
			ps.setInt(2,bid);
			ps.registerOutParameter(1, Types.VARCHAR);
			ps.execute();
			System.out.println("Book is: "+ps.getString(1));
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
}
