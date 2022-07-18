<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
</head>
<body>
<form action="login">
<span>${err}</span>
<input type="text" name="uname" placeholder="Enter Username">
<input type="text" name="pass" placeholder="Enter Password">
<input type="submit">
</form>
</body>
</html>