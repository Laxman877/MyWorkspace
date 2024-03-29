<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="C"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Header</title>
  <link rel="stylesheet" href="css/style.css">
</head>
<body>
<div class="container">
			
			<div class="row">
			<div class="col-sm-3"></div>
			<div class="col-sm-6">
		    <span class="welcome"> Welcome ${uname}</span>
			</div>
			</div>
			<div class="row">
				<div class="col-sm-3">
					<div class="logo"><a href="#"><img src="images/logo.png"></a></div>
				</div>
				<div class="col-sm-9">
					<nav class="navbar navbar-expand-lg navbar-light bg-light">
                        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                        </button>
                    <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                        <div class="navbar-nav">
                           <a class="nav-item nav-link" href="index.jsp">Home</a>
                           <a class="nav-item nav-link" href="collection.jsp">Collection</a>
                           <a class="nav-item nav-link" href="shoes.jsp">Shoes</a>
                           <a class="nav-item nav-link" href="contact.jsp">Contact</a>
                           <%
                           String uname = (String)session.getAttribute("uname");
                           if(uname == null)
                           { %>
                        	    <a class="nav-item nav-link" href="login.jsp">Login</a>
                       <%    }
                           else
                           {%>
                           		
                        	    <a class="nav-item nav-link" href="logout">Logout</a>
                        <% }
                           %>
                          
                           <a class="nav-item nav-link last" href="#"><img src="images/search_icon.png"></a>
                           <a class="nav-item nav-link last" href="cart.jsp"><img src="images/shop_icon.png"></a>
                        </div>
                    </div>
                    </nav>
				</div>
			</div>
		</div>
</body>
</html>