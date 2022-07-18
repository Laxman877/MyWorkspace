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
String uname=(String)session.getAttribute("uname");
if(uname==null){
	request.setAttribute("err", "please login first");
	request.getRequestDispatcher("login.jsp").forward(request, response);
}
%>
<h1>Products</h1>
<ul>
<li>Mobile</li>
<li>Tv</li>
<li>Laptop</li>
<li>Refrigerator</li>
<li>AC</li>
</ul>
<h3><a href="logout">Logout</a></h3>
</body>
</html>