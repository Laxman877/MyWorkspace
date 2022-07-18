<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
   <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

<title>Hello world</title>


</head>
<body>

<div class="container">
  	<div class="row">
  	<div class="col-md-4"></div>
  	<div class="col-md-4">
  	
  	<h1 class="text-success">Login form</h1>
  	<form action="login"  method="post">
  	
  	<span  class="text-danger">${err}</span>

  	<div class="form-group">
  		<label>Email</label>
  	<input type="text" name="email" class="form-control" id="email" onblur="validation()">
  	<span id="emailE" class="text-danger"></span>
  	</div>
  	
  	<div class="form-group">
  		<label>Password</label>
  	<input type="text" name="pass" class="form-control" id="pass" onblur="validation()">
  	<span id="passE" class="text-danger"></span>
  	</div>
  	
  	<br>
  	<input type="submit" class="btn btn-success" id="sbtn">
  	<input type="reset" class="btn btn-info">
  	</form>
  	
  	<a href="registration.jsp">Register Here</a>
  	</div>
  	<div class="col-md-4"></div>
  	</div>
  	
  	</div>

</body>
</html>