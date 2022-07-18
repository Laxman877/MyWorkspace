package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Product;
import util.DBconnection;

public class ProductDao {
	Connection cn;
	public ProductDao() {
		DBconnection con=new DBconnection();
		cn=con.getConn();
	}
	public ArrayList<Product> getAllProduct() {
		ArrayList<Product> al=new ArrayList<Product>();
		try {
			PreparedStatement ps=cn.prepareStatement("select * from product");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Product p=new Product();
				p.setPid(rs.getInt(1));
				p.setPname(rs.getString(2));
				p.setPrice(rs.getDouble(3));
				al.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return al;
	}
	public int editProduct(Product p) {
		int i=0;
		String qry="update product set pname=?,price=? where pid=?";
		try {
			PreparedStatement ps=cn.prepareStatement(qry);
			ps.setInt(3, p.getPid());
			ps.setString(1, p.getPname());
			ps.setDouble(2, p.getPrice());
			i=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	public int addProduct(Product p) {
		int i=0;
		String qry="insert into product values(?,?,?)";
		try {
			PreparedStatement ps=cn.prepareStatement(qry);
			ps.setInt(1, 0);
			ps.setString(2, p.getPname());
			ps.setDouble(3, p.getPrice());
			i=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	public boolean isExist(Product p) {
		boolean b=false;
		String qry="select * from product where pname=?";
		try {
			PreparedStatement ps=cn.prepareStatement(qry);
			ps.setString(1, p.getPname());
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
	public int deleteProduct(int uid) {
		int i=0;
		String qry="delete from product where pid=?";
		try {
			PreparedStatement ps=cn.prepareStatement(qry);
			ps.setInt(1, uid);
			i=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	public Product getProdById(int uid) {
		Product p=new Product();
		String qry="select * from product where pid=?";
		try {
			PreparedStatement ps=cn.prepareStatement(qry);
			ps.setInt(1, uid);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				p.setPid(rs.getInt(1));
				p.setPname(rs.getString(2));
				p.setPrice(rs.getDouble(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}
	public ArrayList<Product> getSearchProduct(String pname) {
		ArrayList<Product> al=new ArrayList<Product>();
		try {
			Statement st=cn.createStatement();
			ResultSet rs=st.executeQuery("select * from product pname like'"+pname+"%'");
			while(rs.next()) {
				Product p=new Product();
				p.setPid(rs.getInt(1));
				p.setPname(rs.getString(2));
				p.setPrice(rs.getDouble(3));
				al.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return al;
	}
	
}
