package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insertdata {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("eneter email");
		String email=sc.next();
		System.out.println("enter dept");
		String dept=sc.next();
		System.out.println("enter sal");
		double sal=sc.nextDouble();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/laxman";
			String uname="root";
			String pass="";
			Connection cn =DriverManager.getConnection(url,uname,pass);
			PreparedStatement ps =cn.prepareStatement("insert into emp values(?,?,?,?,?)");
			ps.setInt(1, 0);
			ps.setString(2, name);
			ps.setString(3, email);
			ps.setString(4, dept);
			ps.setDouble(5, sal);
			int i=ps.executeUpdate();
			if(i>0) {
				System.out.println("data inserted");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
