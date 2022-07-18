<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Products</title>
</head>
<body>
<form action="addnewproduct">
<select name="cid">
<c:forEach var="dt" items="${data}">
<option value="${dt.getcId()}">${dt.getcName()}</option>
</c:forEach>
</select>
<input type="text" name="pname" placeholder="Product Name">
<input type="text" name="price" placeholder="Product Price">
<input type="submit">
</form>
<h1>Products</h1>
<table border="1">
<tr>
<th>Id</th>
<th>Pname</th>
<th>Price</th>
<th>Category</th>
</tr>
<c:forEach var="prod" items="${products}">
<tr>
<td>${prod.getpId()}</td>
<td>${prod.getpName()}</td>
<td>${prod.getPrice()}</td>
<td>${prod.getCategory().getcName()}</td>
</tr>
</c:forEach>
</table>
</body>
</html>