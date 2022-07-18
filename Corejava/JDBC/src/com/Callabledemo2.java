package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.CallableStatement;

public class Callabledemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter book name");
		String bname=sc.next();
		System.out.println("enter price");
		double price=sc.nextDouble();
		System.out.println("enter qty");
		int qty=sc.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/java";
			String uname="root";
			String pass="";
			String sql="call addBook(?,?,?,?)";
			Connection cn=DriverManager.getConnection(url,uname,pass);
			CallableStatement cst=(CallableStatement) cn.prepareCall(sql);
			cst.setInt(1, id);
			cst.setString(2, bname);
			cst.setDouble(3, price);
			cst.setInt(4, qty);
			
			cst.execute();
			System.out.println("Data inserted...");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
