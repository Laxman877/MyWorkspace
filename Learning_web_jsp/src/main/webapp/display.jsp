<%@page import="com.User" %>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>display</title>
<meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
   <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

</head>
<body>
		<h1 align="center">User List</h1>
			<table class="table">
			<tr>
			<th>Id</th>
			<th>Uname</th>
			<th>Email</th>
			<th>Password</th>
			<th>Address</th>
			<th colspan="2">Action</th>
			</tr>
			<%
			 ArrayList<User> al =(ArrayList)request.getAttribute("data");
			for(User u : al)
			{ %>
				<tr>
				<td><%=u.getId()%></td>
				<td><%=u.getUname()%></td>
				<td><%=u.getEmail()%></td>
				<td><%=u.getPass()%></td>
				<td><%=u.getAdr()%></td>
				<td><a href="delete?uid=<%=u.getId()%>" class="btn btn-success">Delete</a> </td>
				<td><a href="update?uid=<%=u.getId()%>" class="btn btn-primary">Update</a></td>
				</tr>
			<%}
			%>
			</table>
</body>
</html>