<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
	crossorigin="anonymous"></script>
<style type="text/css">
    
    .err
    {
    	color: red;
    }
    </style>
</head>
<body>
<div class="container">
  	<div class="row">
  	<div class="col-md-4"></div>
  	<div class="col-md-4">
  	
  	<h1 class="text-success">Registration form</h1>
  	<form action="reg"  method="post">
  	
  	<div class="form-group">
  	<label>Username</label>
  	<input type="text" name="uname" class="form-control" id="uname" value="<%if(request.getParameter("uname")!=null){%><%=request.getParameter("uname")%><%}%>">
  	<span id="unameE" class="text-danger">${unameE}</span>
  	</div>
  	
  	<div class="form-group">
  		<label>Email</label>
  	<input type="text" name="email" class="form-control" id="email" value="<%if(request.getParameter("email")!=null){%><%=request.getParameter("email")%><%}%>">
  	<span id="emailE" class="text-danger">${emailE}</span>
  	</div>
  	
  	<div class="form-group">
  		<label>Password</label>
  	<input type="text" name="pass" class="form-control" id="pass" value="<%if(request.getParameter("pass")!=null){%><%=request.getParameter("pass")%><%}%>">
  	<span id="passE" class="text-danger">${passE}</span>
  	</div>
  	
  	<div class="form-group">
  		<label>Confirm Password</label>
  	<input type="text" class="form-control" id="cpass" name="cpass" value="<%if(request.getParameter("cpass")!=null){%><%=request.getParameter("cpass")%><%}%>">
  	<span id="cpassE" class="text-danger">${cpassE}</span>
  	</div>
  	
  	<div class="form-group">
  		<label>Address</label>
  	<input type="text" name="adr" class="form-control" id = "adr" value="<%if(request.getParameter("adr")!=null){%><%=request.getParameter("adr")%><%}%>">
  	<span id="adrE" class="text-danger">${adrE}</span>
  	</div>
  	<br>
  	<input type="submit" class="btn btn-success" id="sbtn">
  	<input type="reset" class="btn btn-info">
  	</form>
  	</div>
  	<div class="col-md-4"></div>
  	</div>
  	
  	</div>
</body>
</html>