<%@page import="java.io.File"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="imageupload" method="post" enctype="multipart/form-data">
	<input type="text" name="uname" placeholder="Enter UserName">
	<input type="file" name="file">
	<input type="submit">
	</form>
	
	<h1>User Data</h1>
	<table border="1">
	<tr>
	<th>id</th>
	<th>uname</th>
	<th>image</th>
	</tr>
	
	<%
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection cn =DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
	PreparedStatement ps=cn.prepareStatement("select * from upload");
	ResultSet rs=ps.executeQuery();
	String path=request.getServletContext().getRealPath("img");
	while(rs.next()){%>
		<tr>
		<td><%=rs.getInt(1) %></td>
		<td><%=rs.getString(2) %></td>
		<td><img alt="<%=rs.getString(3) %>" src="img/<%=rs.getString(3)%>"></td>
		</tr>
	<%}
	%>
	</table>
</body>
</html>