<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Student</h1>
<table align="center" border="1">
<tr>
<th>Id</th>
<th>Name</th>
<th>Email</th>
<th>Dept</th>
<th colspan="2">Action</th>
</tr>
<c:forEach var="dt" items="${data}">
<tr>
<td>${dt.getId()}</td>
<td>${dt.getName()}</td>
<td>${dt.getEmail()}</td>
<td>${dt.getDept()}</td>
<td><a href="update?action=delete&&uid=${dt.getId()}">Delete</a></td>
<td><a href="update?action=update&&uid=${dt.getId()}">Update</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>