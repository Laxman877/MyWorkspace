package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.User;
import util.DbConnection;

public class UserDao {
	Connection cn;
	public UserDao() {
		cn=DbConnection.getConn();
		
	}
	public int registerUser(User u) {
		int i=0;
		String qry="insert into customer_mst values(?,?,?,?,?)";
		try {
			PreparedStatement ps=cn.prepareStatement(qry);
			ps.setInt(1, 0);
			ps.setString(2, u.getCname());
			ps.setString(3, u.getEmail());
			ps.setString(4, u.getMobile());
			ps.setString(5, u.getPassword());
			
			i=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	public boolean loginCheck(User u) {
		boolean b=false;
		String qry="select * from customer_mst where email=? and pass=?";
		try {
			PreparedStatement ps=cn.prepareStatement(qry);
			ps.setString(1, u.getEmail());
			ps.setString(2, u.getPassword());
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				b=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}
	public String isExist(User u) {
		String user=null;
		String qry="select * from customer_mst where email=? or mobile=?";
		try {
			PreparedStatement ps=cn.prepareStatement(qry);
			ps.setString(1, u.getEmail());
			ps.setString(2, u.getMobile());
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				user=rs.getString(2);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}
}
