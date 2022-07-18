<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Employee Details</h1>
	<table border="1">
		<tr>
			<th>Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Password</th>
			<th colspan="2"></th>
		</tr>
		<c:forEach var="dt" items="${data}">
			<tr>
				<td>${dt.getId()}</td>
				<td>${dt.getEmployeeDetail().getFname()}</td>
				<td>${dt.getEmployeeDetail().getLname()}</td>
				<td>${dt.getEmail()}</td>
				<td>${dt.getPass()}</td>
				<td><a href="update?action=delete&&uid=${dt.getId()}">Delete</a></td>
				<td><a href="update?action=update&&uid=${dt.getId()}">Update</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>