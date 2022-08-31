package com;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
@MultipartConfig
@WebServlet("/imageupload")
public class ImageUpload extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String img="img";
		String path=req.getServletContext().getRealPath("");
		String uploadPath=path+File.separator+img;
		System.out.println(uploadPath);
//		String uploadPath="D:\\Laxman_DoNot_Delete\\Java\\ImageUploading\\src\\main\\webapp\\img";
		
		File myfile=new File(uploadPath);
		if(!myfile.exists()) {
			myfile.mkdir();
			System.out.println("file created...");
			System.out.println(myfile.getAbsolutePath());
		}
		
		String uname=req.getParameter("uname");
		Part file=req.getPart("file");
		System.out.println(uname+" "+file);
		String filename=Paths.get(file.getSubmittedFileName()).getFileName().toString();
		System.out.println(filename);
		file.write(uploadPath+File.separator+filename);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn =DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
			PreparedStatement ps=cn.prepareStatement("insert into upload values(?,?,?)");
			ps.setInt(1, 0);
			ps.setString(2, uname);
			ps.setString(3, filename);
			
			int i=ps.executeUpdate();
			if(i>0) {
				req.getRequestDispatcher("index.jsp").forward(req, resp);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
