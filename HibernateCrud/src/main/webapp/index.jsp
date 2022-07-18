<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
</head>
<body>
	<form action="reg" method="post">
		<input type="hidden" name="id" value="${data.getId()}"> <input
			type="text" name="name" placeholder="Enter name"
			value="${data.getName()}"> <input type="text" name="email"
			placeholder="Enter email" value="${data.getEmail()}"> <input
			type="text" name="mobile" placeholder="Enter mobile"
			value="${data.getMobile()}"> <input type="submit">
	</form>
	<a href="display">view all data</a>
</body>
</html>