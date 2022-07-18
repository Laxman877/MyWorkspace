package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Table_ctreate_InDB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		String name = sc.next();
		System.out.println("enter email");
		String email = sc.next();
		System.out.println("enter dept");
		String dept = sc.next();
		System.out.println("enter salary");
		double sal = sc.nextDouble();
		try {
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver loaded");
			
			//define connection url
			String url = "jdbc:mysql://localhost:3306/laxman";
			String uname = "root";
			String pass = "";
			
			//established the connection
			Connection cn = DriverManager.getConnection(url,uname,pass);
			System.out.println("connection esatblished");
			
			PreparedStatement pr = cn.prepareStatement("insert into emp values(?,?,?,?,?)");
			pr.setInt(1, 0);
			pr.setString(2, name);
			pr.setNString(3, email);
			pr.setString(4, dept);
			pr.setDouble(5, sal);
			int i = pr.executeUpdate();
			
			if(i>0) {
				System.out.println("data inserted...");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
