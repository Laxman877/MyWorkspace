<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Products</title>
</head>
<body>
<%
String bname=(String)session.getAttribute("bname");
if(bname==null){
	request.setAttribute("err", "PLease login first");
	request.getRequestDispatcher("login.jsp").forward(request, response);
}
%>
<h1>Product List</h1>
<ul>
	<li>Tv</li>
	<li>Refrigerator</li>
	<li>Mobile</li>
	<li>Laptop</li>
	<li>Desktop</li>
</ul>
<h2><a href="logout">Logout</a></h2>
</body>
</html>