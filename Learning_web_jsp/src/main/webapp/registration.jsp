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
<script type="text/javascript">
function validation()
{
	var uname = document.getElementById("uname").value;
    var email = document.getElementById("email").value;
    var pass = document.getElementById("pass").value;
    var cpass = document.getElementById("cpass").value;
    var adr = document.getElementById("adr").value;
	var btn = document.getElementById("sbtn");
	
    var unameE = document.getElementById("unameE");
    var emailE = document.getElementById("emailE");
    var passE = document.getElementById("passE");
    var cpassE = document.getElementById("cpassE");
    var adrE = document.getElementById("adrE");
	
    
    var unameExp = /^[a-zA-Z]+$/;
    var emailExp = /^[a-z0-9]+@[a-z]+\.[a-z]{2,3}$/;
    
    if(uname=="" || uname==null)
	{
		unameE.innerHTML="Username Required!!!"
		btn.disabled=true;
	}
    else if(!unameExp.test(uname))
    {
    	unameE.innerHTML="Only char. allowed"
    	btn.disabled=true;
   	}
    else
    {
    	unameE.innerHTML="";
    	
    }
    
    if(email=="" || email==null)
	{
    	emailE.innerHTML="Email Required!!!"
    		btn.disabled=true;
	}
    else if(!emailExp.test(email))
    {
    	emailE.innerHTML="Please enter valid email"
    		btn.disabled=true;
    }
    else
    {
    	emailE.innerHTML="";
    	
    }
    
    if(pass=="" || pass==null)
	{
    	passE.innerHTML="Pass Required!!!"
    		btn.disabled=true;
	}
    else
    {
    	passE.innerHTML="";
    	
    }
    
    if(cpass=="" || cpass==null)
	{
    	cpassE.innerHTML="Cpass Required!!!"
    	btn.disabled=true;
	}
    else if(cpass != pass)
    {
    	cpassE.innerHTML="Cpass should be same as Pass"
    	btn.disabled=true;
    }
    else
    {
    	cpassE.innerHTML="";
    	
    }
    
    if(adr=="" || adr==null)
	{
    	adrE.innerHTML="Address Required!!!"
    	btn.disabled=true;
	}
    else
    {
    	adrE.innerHTML="";
    	btn.disabled=false;
    }	
}

</script>


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
	<span class="text-success">${msg}</span>  	
  	<div class="form-group">
  	<label>Username</label>
  	<input type="text" name="uname" class="form-control" id="uname" onblur="validation()">
  	<span id="unameE" class="text-danger"></span>
  	</div>
  	
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
  	
  	<div class="form-group">
  		<label>Confirm Password</label>
  	<input type="text" class="form-control" id="cpass" onblur="validation()">
  	<span id="cpassE" class="text-danger"></span>
  	</div>
  	
  	<div class="form-group">
  		<label>Address</label>
  	<input type="text" name="adr" class="form-control" id = "adr" onblur="validation()">
  	<span id="adrE" class="text-danger"></span>
  	</div>
  	<br>
  	<input type="submit" class="btn btn-success" id="sbtn">
  	<input type="reset" class="btn btn-info">
  	</form>
  	
  	<a href="login.jsp">Login Here</a>
  	</div>
  	<div class="col-md-4"></div>
  	</div>
  	
  	</div>

</body>
</html>