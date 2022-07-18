<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<h1>Login Here</h1>
<form action="login">
<span>${err}</span>
<input type="text" name="uname" placeholder="Enter Username">
<input type="text" name="pass" placeholder="Enter Password">
<input type="submit">
</form>
</body>
</html>