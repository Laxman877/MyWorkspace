package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class LibraryOperation {
	Connection cn;
	public LibraryOperation() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/java";
			String uname="root";
			String pass="";
			cn = DriverManager.getConnection(url,uname,pass);
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	Scanner sc = new Scanner(System.in);
	public void addBook() {
		try {
			System.out.println("enter book name");
			String bname=sc.next();
			PreparedStatement ps=cn.prepareStatement("select * from library where bname=?");
			ps.setString(1, bname);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				System.out.println("book already exist");
			}
			else {
				System.out.println("enter book price: ");
				double price=sc.nextDouble();
				System.out.println("enter qty");
				int qty=sc.nextInt();
				PreparedStatement ps1=cn.prepareStatement("insert into library values(?,?,?,?)");
				ps1.setInt(1, 0);
				ps1.setString(2, bname);
				ps1.setDouble(3, price);
				ps1.setInt(4, qty);
				int i=ps1.executeUpdate();
				if(i>0) {
					System.out.println("book inserted");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void deleteBook() {
		try {
			System.out.println("enter Book name");
			String bname=sc.next();
			PreparedStatement ps=cn.prepareStatement("select * from library where bname=?");
			ps.setString(1, bname);
			ResultSet rs= ps.executeQuery();
			if(rs.next()) {
				PreparedStatement ps1=cn.prepareStatement("delete from library where bname=?");
				ps1.setString(1, bname);
				int i=ps1.executeUpdate();
				if(i>0) {
					System.out.println("book deleted!!!");
				}
			}
			else {
				System.out.println("Book not available");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void issueBook() {
		try {
			System.out.println("enter book name");
			String bname=sc.next();
			PreparedStatement ps=cn.prepareStatement("select * from library where bname=?");
			ps.setString(1, bname);
			ResultSet rs= ps.executeQuery();
			if(rs.next()) {
				int qty=rs.getInt(4);
				if(qty>0) {
					qty--;
					PreparedStatement ps1=cn.prepareStatement("update library set qty=? where bname=?");
					ps1.setInt(1, qty);
					ps1.setString(2, bname);
					int i=ps1.executeUpdate();
					if(i>0) {
						System.out.println("Book issued!!!");
					}
				}else {
					System.out.println("book is currently not available!!!");
				}
			}else {
				System.out.println("book not avillable");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void viewBook() {
		try {
			PreparedStatement ps=cn.prepareStatement("select * from library");
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3)+" "+rs.getInt(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}	
}
